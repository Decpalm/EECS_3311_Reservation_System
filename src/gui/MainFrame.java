package gui;

import model.Equipment;
import model.Payment;
import model.Reservation;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GUIController controller;
    private JTextArea outputArea;

    public MainFrame() {
        controller = new GUIController();

        setTitle("YorkU Lab Equipment Reservation Platform");
        setSize(1100, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Register User", createRegisterUserPanel());
        tabbedPane.addTab("Add Equipment", createAddEquipmentPanel());
        tabbedPane.addTab("Reserve Equipment", createReserveEquipmentPanel());
        tabbedPane.addTab("Modify/Cancel/Extend", createReservationManagePanel());
        tabbedPane.addTab("Process Payment", createPaymentPanel());
        tabbedPane.addTab("Equipment Status", createEquipmentStatusPanel());
        tabbedPane.addTab("Auto-Generate Lab Manager Account", AutoGenerateLabManagerPanel());
       
        tabbedPane.addTab("View Data", createViewDataPanel());
        outputArea = new JTextArea(12, 80);
        outputArea.setEditable(false);
        JScrollPane outputScrollPane = new JScrollPane(outputArea);

        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.CENTER);
        add(outputScrollPane, BorderLayout.SOUTH);
    }

    private JPanel createRegisterUserPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        JLabel roleLabel = new JLabel("Role:");
        JComboBox<String> roleBox = new JComboBox<>(new String[]{"Student", "Faculty", "Researcher", "Guest"});

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JTextField passwordField = new JTextField();

        JLabel idLabel = new JLabel("ID / Cert Number:");
        JTextField idField = new JTextField();

        JButton registerButton = new JButton("Register User");

        registerButton.addActionListener(e -> {
            try {
                User user = controller.registerUser(
                        (String) roleBox.getSelectedItem(),
                        emailField.getText().trim(),
                        passwordField.getText().trim(),
                        idField.getText().trim()
                );

                outputArea.append("User registered successfully: " + user + "\n");
                emailField.setText("");
                passwordField.setText("");
                idField.setText("");
            } catch (Exception ex) {
                outputArea.append("Error registering user: " + ex.getMessage() + "\n");
            }
        });

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(roleLabel);
        panel.add(roleBox);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(new JLabel());
        panel.add(registerButton);

        return panel;
    }

    private JPanel createAddEquipmentPanel() {
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        JLabel managerEmailLabel = new JLabel("Lab Manager Email:");
        JTextField managerEmailField = new JTextField();
        
        JLabel managerPasswordLabel = new JLabel("Lab Manager Password:");
        JTextField managerPasswordField = new JTextField();
        
        JLabel equipmentIdLabel = new JLabel("Equipment ID:");
        JTextField equipmentIdField = new JTextField();

        JLabel descLabel = new JLabel("Description:");
        JTextField descField = new JTextField();

        JLabel locationLabel = new JLabel("Lab Location:");
        JTextField locationField = new JTextField();

        JButton addButton = new JButton("Add Equipment");

        addButton.addActionListener(e -> {
            try {
            	User user = controller.findUserByEmail(managerEmailField.getText().trim());
                if (user == null) {
                    throw new IllegalArgumentException("User not found.");
                }
                controller.addEquipment(
                		user,
                		managerPasswordField.getText().trim(),
                		equipmentIdField.getText().trim(),
                        descField.getText().trim(),
                        locationField.getText().trim()
                );

                Equipment equipment = controller.getAllEquipment()
                        .stream()
                        .filter(eq -> eq.getEquipmentId().equalsIgnoreCase(equipmentIdField.getText().trim()))
                        .findFirst()
                        .orElse(null);

                if (equipment != null) {
                    controller.attachDefaultObserversToEquipment(equipment);
                }

                outputArea.append("Equipment added successfully.\n");
                managerEmailField.setText("");
                managerPasswordField.setText("");
                equipmentIdField.setText("");
                descField.setText("");
                locationField.setText("");
            } catch (Exception ex) {
                outputArea.append("Error adding equipment: " + ex.getMessage() + "\n");
            }
        });

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(managerEmailLabel);
        panel.add(managerEmailField);
        panel.add(managerPasswordLabel);
        panel.add(managerPasswordField);
        panel.add(equipmentIdLabel);
        panel.add(equipmentIdField);
        panel.add(descLabel);
        panel.add(descField);
        panel.add(locationLabel);
        panel.add(locationField);
        panel.add(new JLabel());
        panel.add(addButton);

        return panel;
    }

    private JPanel createReserveEquipmentPanel() {
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        JLabel emailLabel = new JLabel("User Email:");
        JTextField emailField = new JTextField();
        
        JLabel passwordLabel = new JLabel("User password:");
        JTextField passwordField = new JTextField();

        JLabel equipmentIdLabel = new JLabel("Equipment ID:");
        JTextField equipmentIdField = new JTextField();

        JLabel startLabel = new JLabel("Start Time (yyyy-MM-ddTHH:mm):");
        JTextField startField = new JTextField("2026-03-20T10:00");

        JLabel endLabel = new JLabel("End Time (yyyy-MM-ddTHH:mm):");
        JTextField endField = new JTextField("2026-03-20T12:00");

        JButton reserveButton = new JButton("Reserve Equipment");

        reserveButton.addActionListener(e -> {
            try {
                User user = controller.findUserByEmail(emailField.getText().trim());
                if (user == null) {
                    throw new IllegalArgumentException("User not found.");
                }

                LocalDateTime start = LocalDateTime.parse(startField.getText().trim());
                LocalDateTime end = LocalDateTime.parse(endField.getText().trim());

                controller.reserveEquipment(
                        user,
                        passwordField.getText().trim(),
                        equipmentIdField.getText().trim(),
                        start,
                        end
                );

                Reservation latest = getLatestReservation();
                if (latest != null) {
                    outputArea.append("Reservation created successfully: " + latest + "\n");
                } else {
                    outputArea.append("Reservation created successfully.\n");
                }

                emailField.setText("");
                passwordField.setText("");
                equipmentIdField.setText("");
            } catch (Exception ex) {
                outputArea.append("Error reserving equipment: " + ex.getMessage() + "\n");
            }
        });

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(equipmentIdLabel);
        panel.add(equipmentIdField);
        panel.add(startLabel);
        panel.add(startField);
        panel.add(endLabel);
        panel.add(endField);
        panel.add(new JLabel());
        panel.add(reserveButton);

        return panel;
    }

    private JPanel createReservationManagePanel() {
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        JLabel reservationIdLabel = new JLabel("Reservation ID:");
        JTextField reservationIdField = new JTextField();

        JLabel newStartLabel = new JLabel("New Start (yyyy-MM-ddTHH:mm):");
        JTextField newStartField = new JTextField("2026-03-20T11:00");

        JLabel newEndLabel = new JLabel("New End (yyyy-MM-ddTHH:mm):");
        JTextField newEndField = new JTextField("2026-03-20T13:00");

        JButton modifyButton = new JButton("Modify Reservation");
        JButton cancelButton = new JButton("Cancel Reservation");
        JButton extendButton = new JButton("Extend Reservation");

        modifyButton.addActionListener(e -> {
            try {
                LocalDateTime newStart = LocalDateTime.parse(newStartField.getText().trim());
                LocalDateTime newEnd = LocalDateTime.parse(newEndField.getText().trim());

                controller.modifyReservation(reservationIdField.getText().trim(), newStart, newEnd);
                outputArea.append("Reservation modified successfully.\n");
            } catch (Exception ex) {
                outputArea.append("Error modifying reservation: " + ex.getMessage() + "\n");
            }
        });

        cancelButton.addActionListener(e -> {
            try {
                controller.cancelReservation(reservationIdField.getText().trim());
                outputArea.append("Reservation cancelled successfully.\n");
            } catch (Exception ex) {
                outputArea.append("Error cancelling reservation: " + ex.getMessage() + "\n");
            }
        });

        extendButton.addActionListener(e -> {
            try {
                LocalDateTime newEnd = LocalDateTime.parse(newEndField.getText().trim());
                controller.extendReservation(reservationIdField.getText().trim(), newEnd);
                outputArea.append("Reservation extended successfully.\n");
            } catch (Exception ex) {
                outputArea.append("Error extending reservation: " + ex.getMessage() + "\n");
            }
        });

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(reservationIdLabel);
        panel.add(reservationIdField);
        panel.add(newStartLabel);
        panel.add(newStartField);
        panel.add(newEndLabel);
        panel.add(newEndField);
        panel.add(modifyButton);
        panel.add(cancelButton);
        panel.add(new JLabel());
        panel.add(extendButton);

        return panel;
    }

    private JPanel createPaymentPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel reservationIdLabel = new JLabel("Reservation ID:");
        JTextField reservationIdField = new JTextField();

        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountField = new JTextField();

        JLabel methodLabel = new JLabel("Method:");
        JComboBox<String> methodBox = new JComboBox<>(new String[]{"Credit Card", "Debit Card", "Cash"});

        JButton payButton = new JButton("Process Payment");

        payButton.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText().trim());
                Payment payment = controller.processPayment(
                        reservationIdField.getText().trim(),
                        amount,
                        (String) methodBox.getSelectedItem()
                );

                outputArea.append("Payment processed successfully: " + payment + "\n");
                reservationIdField.setText("");
                amountField.setText("");
            } catch (Exception ex) {
                outputArea.append("Error processing payment: " + ex.getMessage() + "\n");
            }
        });

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(reservationIdLabel);
        panel.add(reservationIdField);
        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(methodLabel);
        panel.add(methodBox);
        panel.add(new JLabel());
        panel.add(payButton);

        return panel;
    }

    private JPanel createEquipmentStatusPanel() {
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        
        JLabel managerEmailLabel = new JLabel("Lab Manager Email:");
        JTextField managerEmailField = new JTextField();

        JLabel equipmentIdLabel = new JLabel("Equipment ID:");
        JTextField equipmentIdField = new JTextField();

        JLabel statusLabel = new JLabel("Manual Status:");
        JComboBox<String> statusBox = new JComboBox<>(new String[]{"available", "disabled", "maintenance"});

        JButton updateStatusButton = new JButton("Update Equipment Status");

        JLabel sensorStatusLabel = new JLabel("Sensor Status:");
        JComboBox<String> sensorStatusBox = new JComboBox<>(new String[]{"AVAILABLE", "DISABLED", "MAINTENANCE"});

        JLabel sensorMessageLabel = new JLabel("Sensor Message:");
        JTextField sensorMessageField = new JTextField();

        JButton applySensorButton = new JButton("Apply Sensor Update");

        updateStatusButton.addActionListener(e -> {
            try {
            	User user = controller.findUserByEmail(managerEmailField.getText().trim());
                if (user == null) {
                    throw new IllegalArgumentException("User not found.");
                }
                
                controller.updateEquipmentStatus(
                		user, 
                        equipmentIdField.getText().trim(),
                        (String) statusBox.getSelectedItem()
                );
                outputArea.append("Equipment status updated successfully.\n");
            } catch (Exception ex) {
                outputArea.append("Error updating equipment status: " + ex.getMessage() + "\n");
            }
        });

        applySensorButton.addActionListener(e -> {
            try {
            	User user = controller.findUserByEmail(managerEmailField.getText().trim());
                if (user == null) {
                    throw new IllegalArgumentException("User not found.");
                }
                controller.applySensorUpdate(
                		user, 
                        equipmentIdField.getText().trim(),
                        (String) sensorStatusBox.getSelectedItem(),
                        sensorMessageField.getText().trim()
                );
                outputArea.append("Sensor update applied successfully.\n");
            } catch (Exception ex) {
                outputArea.append("Error applying sensor update: " + ex.getMessage() + "\n");
            }
        });

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(managerEmailLabel);
        panel.add(managerEmailField);
        panel.add(equipmentIdLabel);
        panel.add(equipmentIdField);
        panel.add(statusLabel);
        panel.add(statusBox);
        panel.add(new JLabel());
        panel.add(updateStatusButton);
        panel.add(sensorStatusLabel);
        panel.add(sensorStatusBox);
        panel.add(sensorMessageLabel);
        panel.add(sensorMessageField);
        panel.add(new JLabel());
        panel.add(applySensorButton);

        return panel;
    }

    private JPanel createViewDataPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));

        JButton viewUsersButton = new JButton("View Users");
        JButton viewEquipmentButton = new JButton("View Equipment");
        JButton viewReservationsButton = new JButton("View Reservations");
        JButton viewPaymentsButton = new JButton("View Payments");

        viewUsersButton.addActionListener(e -> {
            List<User> users = controller.getAllUsers();
            outputArea.append("---- USERS ----\n");
            for (User user : users) {
                outputArea.append(user + "\n");
            }
        });

        viewEquipmentButton.addActionListener(e -> {
            List<Equipment> equipmentList = controller.getAllEquipment();
            outputArea.append("---- EQUIPMENT ----\n");
            for (Equipment equipment : equipmentList) {
                outputArea.append(equipment + "\n");
            }
        });

        viewReservationsButton.addActionListener(e -> {
            List<Reservation> reservations = controller.getAllReservations();
            outputArea.append("---- RESERVATIONS ----\n");
            for (Reservation reservation : reservations) {
                outputArea.append(reservation + "\n");
            }
        });

        viewPaymentsButton.addActionListener(e -> {
            List<Payment> payments = controller.getAllPayments();
            outputArea.append("---- PAYMENTS ----\n");
            for (Payment payment : payments) {
                outputArea.append(payment + "\n");
            }
        });

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(viewUsersButton);
        panel.add(viewEquipmentButton);
        panel.add(viewReservationsButton);
        panel.add(viewPaymentsButton);

        return panel;
    }

    private JPanel AutoGenerateLabManagerPanel() {
    	JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
    	
    	JLabel coordinatorEmailLabel = new JLabel("Head Lab Coordinator Email:");
        JTextField coordinatorEmailField = new JTextField();
        
        JLabel coordinatorPasswordLabel = new JLabel("Head Lab Coordinator Password:");
        JTextField coordinatorPasswordField = new JTextField();
    	
    	JLabel labManagerEmailLabel = new JLabel("Lab Manager Email:");
        JTextField labManagerEmailField = new JTextField();
        
        JButton generateButton = new JButton("Generate Lab Manager Account");
        
        generateButton.addActionListener(e -> {
        	try {
            	User user = controller.findUserByEmail(coordinatorEmailField.getText().trim());
                if (user == null) {
                    throw new IllegalArgumentException("User not found.");
                }
                
                controller.AutoGenerateLabManagerCommand(
                		user, 
                		coordinatorPasswordField.getText().trim(), 
                		labManagerEmailField.getText().trim());
                outputArea.append("Lab Manager account successfully generated.\n");
            } catch (Exception ex) {
                outputArea.append("Error updating equipment status: " + ex.getMessage() + "\n");
            }
        });
        
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(coordinatorEmailLabel);
        panel.add(coordinatorEmailField);
        panel.add(coordinatorPasswordLabel);
        panel.add(coordinatorPasswordField);
        panel.add(labManagerEmailLabel);
        panel.add(labManagerEmailField);
        panel.add(new JLabel());
        panel.add(generateButton);

        return panel;
    }
    
    private Reservation getLatestReservation() {
        List<Reservation> reservations = controller.getAllReservations();
        if (reservations.isEmpty()) {
            return null;
        }
        return reservations.get(reservations.size() - 1);
    }
}
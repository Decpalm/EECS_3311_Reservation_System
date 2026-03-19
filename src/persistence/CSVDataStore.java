package persistence;

import model.Equipment;
import model.Payment;
import model.Reservation;
import model.User;

import factory.*;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CSVDataStore {
    private static CSVDataStore instance;

    private final String usersFile = "data/users.csv";
    private final String equipmentFile = "data/equipment.csv";
    private final String reservationsFile = "data/reservations.csv";
    private final String paymentsFile = "data/payments.csv";

    private List<User> users;
    private List<Equipment> equipmentList;
    private List<Reservation> reservations;
    private List<Payment> payments;

    private CSVDataStore() {
        users = new ArrayList<>();
        equipmentList = new ArrayList<>();
        reservations = new ArrayList<>();
        payments = new ArrayList<>();
        this.loadUsersFromCSV();
        this.loadEquipmentFromCSV();
    }

    public static CSVDataStore getInstance() {
        if (instance == null) {
            instance = new CSVDataStore();
        }
        return instance;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void saveUser(User user) {
        users.add(user);
        writeUsersToCSV();
    }

    public void saveEquipment(Equipment equipment) {
        equipmentList.add(equipment);
        writeEquipmentToCSV();
    }

    public void saveReservation(Reservation reservation) {
        reservations.add(reservation);
        writeReservationsToCSV();
    }

    public void savePayment(Payment payment) {
        payments.add(payment);
        writePaymentsToCSV();
    }

    public User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }

    public Equipment findEquipmentById(String equipmentId) {
        for (Equipment equipment : equipmentList) {
            if (equipment.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                return equipment;
            }
        }
        return null;
    }

    public Reservation findReservationById(String reservationId) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationId().toString().equals(reservationId)) {
                return reservation;
            }
        }
        return null;
    }

    private void writeUsersToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(usersFile))) {
            writer.write("userId,email,passwordHash,status,idOrCertNumber,role");
            writer.newLine();

            for (User user : users) {
                writer.write(user.getUserId() + "," +
                        user.getEmail() + "," +
                        user.getPasswordHash() + "," +
                        user.getStatus() + "," +
                        user.getIdOrCertNumber() + "," +
                        user.getRole());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing users CSV: " + e.getMessage());
        }
    }
    
    private void loadUsersFromCSV() {
    	String line;
    	String[] data;
    	try (BufferedReader reader = new BufferedReader(new FileReader(usersFile))) {
    		while ((line = reader.readLine()) != null) {
    			if (line.equals("userId,email,passwordHash,status,idOrCertNumber,role")) {
    				
    			}
    			else {
    				data = line.split(",");
    				new AccountFactory();
					User user = AccountFactory.createUser(data[5], data[1], data[2], data[4]);
    				user.setStatus(data[3]);
    				user.setUserId(UUID.fromString(data[0]));
    				this.users.add(user);
    			}
    		}
    	} catch (IOException e) {
    		System.out.println("Error writing users CSV: " + e.getMessage());
        }
    }

    private void writeEquipmentToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(equipmentFile))) {
            writer.write("equipmentId,description,labLocation,status");
            writer.newLine();

            for (Equipment equipment : equipmentList) {
                writer.write(equipment.getEquipmentId() + "," +
                        equipment.getDescription() + "," +
                        equipment.getLabLocation() + "," +
                        equipment.getStatus());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing equipment CSV: " + e.getMessage());
        }
    }
    
    private void loadEquipmentFromCSV() {
    	String line;
    	String[] data;
    	try (BufferedReader reader = new BufferedReader(new FileReader(usersFile))) {
    		while ((line = reader.readLine()) != null) {
    			if (line.equals("equipmentId,description,labLocation,status")) {
    				
    			}
    			else {
    				data = line.split(",");
    				new EquipmentFactory();
    				Equipment equipment = EquipmentFactory.createEquipment(data[0], data[1], data[2]);
    				equipment.setStatus(data[4]);
    				this.equipmentList.add(equipment);
    			}
    		}
    	} catch (IOException e) {
    		System.out.println("Error writing users CSV: " + e.getMessage());
        }
    }

    private void writeReservationsToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(reservationsFile))) {
            writer.write("reservationId,userId,equipmentId,startTime,endTime,status,hourlyRate,depositAmount,totalCost");
            writer.newLine();

            for (Reservation reservation : reservations) {
                writer.write(reservation.getReservationId() + "," +
                        reservation.getUser().getUserId() + "," +
                        reservation.getEquipment().getEquipmentId() + "," +
                        reservation.getStartTime() + "," +
                        reservation.getEndTime() + "," +
                        reservation.getStatus() + "," +
                        reservation.getHourlyRate() + "," +
                        reservation.getDepositAmount() + "," +
                        reservation.getTotalCost());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing reservations CSV: " + e.getMessage());
        }
    }

    private void writePaymentsToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(paymentsFile))) {
            writer.write("paymentId,amount,method,status,timestamp");
            writer.newLine();

            for (Payment payment : payments) {
                writer.write(payment.getPaymentId() + "," +
                        payment.getAmount() + "," +
                        payment.getMethod() + "," +
                        payment.getStatus() + "," +
                        payment.getTimestamp());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing payments CSV: " + e.getMessage());
        }
    }
}
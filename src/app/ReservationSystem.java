package app;

import factory.AccountFactory;
import factory.EquipmentFactory;
import model.Equipment;
import model.Payment;
import model.Reservation;
import model.SensorUpdate;
import model.User;
import persistence.CSVDataStore;
import strategy.FacultyPricingStrategy;
import strategy.GuestPricingStrategy;
import strategy.PricingStrategy;
import strategy.ResearcherPricingStrategy;
import strategy.StudentPricingStrategy;

import java.time.LocalDateTime;
import java.util.List;

public class ReservationSystem {
    private static ReservationSystem instance;
    private CSVDataStore dataStore;

    private ReservationSystem() {
        dataStore = CSVDataStore.getInstance();
    }

    public static ReservationSystem getInstance() {
        if (instance == null) {
            instance = new ReservationSystem();
        }
        return instance;
    }

    public User registerUser(String role, String email, String passwordHash, String idOrCertNumber) {
        if (dataStore.findUserByEmail(email) != null) {
            throw new IllegalArgumentException("A user with this email already exists.");
        }
        
        if(!passwordHash.matches("^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8}$") ){
        	throw new IllegalArgumentException("Password is too weak. Please include at least one uppercase letter, lowercase letter, number, and special character.");
        }

        User user = AccountFactory.createUser(role, email, passwordHash, idOrCertNumber);
        dataStore.saveUser(user);
        return user;
    }

    public Equipment addEquipment(User user, String equipmentId, String description, String labLocation) {
        if (dataStore.findEquipmentById(equipmentId) != null) {
            throw new IllegalArgumentException("Equipment with this ID already exists.");
        }
        if (!user.getRole().equals("LabManager")) {
        	throw new IllegalArgumentException("Only Lab Managers may add new equipment.");
        }

        Equipment equipment = EquipmentFactory.createEquipment(equipmentId, description, labLocation);
        dataStore.saveEquipment(equipment);
        return equipment;
    }

    public Reservation createReservation(User user, String equipmentId,
                                         LocalDateTime startTime, LocalDateTime endTime) {
        Equipment equipment = dataStore.findEquipmentById(equipmentId);

        if (equipment == null) {
            throw new IllegalArgumentException("Equipment not found.");
        }

        if (!equipment.isAvailable(startTime, endTime, equipmentId)) {
            throw new IllegalArgumentException("Equipment is not available for reservation.");
        }

        PricingStrategy strategy = getPricingStrategyForUser(user);

        Reservation reservation = new Reservation(user, equipment, startTime, endTime, strategy);
        reservation.confirmReservation();
        dataStore.saveReservation(reservation);

        return reservation;
    }

    public void modifyReservation(String reservationId, LocalDateTime newStartTime, LocalDateTime newEndTime) {
        Reservation reservation = dataStore.findReservationById(reservationId);

        if (reservation == null) {
            throw new IllegalArgumentException("Reservation not found.");
        }

        reservation.modifyReservation(newStartTime, newEndTime);
    }

    public void cancelReservation(String reservationId) {
        Reservation reservation = dataStore.findReservationById(reservationId);

        if (reservation == null) {
            throw new IllegalArgumentException("Reservation not found.");
        }

        reservation.cancelReservation();
    }

    public void extendReservation(String reservationId, LocalDateTime newEndTime) {
        Reservation reservation = dataStore.findReservationById(reservationId);

        if (reservation == null) {
            throw new IllegalArgumentException("Reservation not found.");
        }

        reservation.extendReservation(newEndTime);
    }

    public Payment processPayment(String reservationId, double amount, String method) {
        Reservation reservation = dataStore.findReservationById(reservationId);

        if (reservation == null) {
            throw new IllegalArgumentException("Reservation not found.");
        }

        Payment payment = new Payment(amount, method);
        payment.markSuccess();

        reservation.setPayment(payment);
        dataStore.savePayment(payment);

        return payment;
    }

    public void updateEquipmentStatus(User user, String equipmentId, String newStatus) {
        Equipment equipment = dataStore.findEquipmentById(equipmentId);

        if (equipment == null) {
            throw new IllegalArgumentException("Equipment not found.");
        }
        
        if (!user.getRole().equals("LabManager")) {
        	throw new IllegalArgumentException("Only Lab Managers may update equipment status.");
        }

        switch (newStatus.trim().toLowerCase()) {
            case "available":
                equipment.enable();
                break;
            case "disabled":
                equipment.disable();
                break;
            case "maintenance":
                equipment.markMaintenance();
                break;
            default:
                throw new IllegalArgumentException("Invalid equipment status: " + newStatus);
        }
    }

    public void applySensorUpdate(User user, String equipmentId, SensorUpdate update) {
        Equipment equipment = dataStore.findEquipmentById(equipmentId);

        if (equipment == null) {
            throw new IllegalArgumentException("Equipment not found.");
        }
        
        if (!user.getRole().equals("LabManager")) {
        	throw new IllegalArgumentException("Only Lab Managers may update sensor status.");
        }

        equipment.applySensorUpdate(update);
    }

    public List<User> getAllUsers() {
        return dataStore.getUsers();
    }

    public List<Equipment> getAllEquipment() {
        return dataStore.getEquipmentList();
    }

    public List<Reservation> getAllReservations() {
        return dataStore.getReservations();
    }

    public List<Payment> getAllPayments() {
        return dataStore.getPayments();
    }

    private PricingStrategy getPricingStrategyForUser(User user) {
        switch (user.getRole().toLowerCase()) {
            case "student":
                return new StudentPricingStrategy();
            case "faculty":
                return new FacultyPricingStrategy();
            case "researcher":
                return new ResearcherPricingStrategy();
            case "guest":
                return new GuestPricingStrategy();
            default:
                throw new IllegalArgumentException("No pricing strategy found for role: " + user.getRole());
        }
    }

    private boolean checkPassword(User user, String password) {
    	return user.getPasswordHash().equals(password);
    }
}
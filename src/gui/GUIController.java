package gui;

import app.ReservationSystem;
import command.*;
import model.Equipment;
import model.Payment;
import model.Reservation;
import model.SensorUpdate;
import model.User;
import observer.LabManagerDashboard;
import observer.NotificationService;

import java.time.LocalDateTime;
import java.util.List;

public class GUIController {
    private ReservationSystem reservationSystem;

    public GUIController() {
        this.reservationSystem = ReservationSystem.getInstance();
    }

    public User registerUser(String role, String email, String passwordHash, String idOrCertNumber) {
        return reservationSystem.registerUser(role, email, passwordHash, idOrCertNumber);
    }
    
    public void updateIdOrCert(User user, String password, String idOrCert) {
    	Command command = new updateIdOrCertCommand(reservationSystem, user, password, idOrCert);
        command.execute();
    }

    public void addEquipment(User user, String password, String equipmentId, String description, String labLocation) {
        Command command = new AddEquipmentCommand(reservationSystem, user, password, equipmentId, description, labLocation);
        command.execute();
    }

    public void reserveEquipment(User user, String password, String equipmentId, LocalDateTime startTime, LocalDateTime endTime) {
        Command command = new ReserveEquipmentCommand(reservationSystem, user, password, equipmentId, startTime, endTime);
        command.execute();
    }

    public void modifyReservation(User user, String password, String reservationId, LocalDateTime newStartTime, LocalDateTime newEndTime) {
        Command command = new ModifyBookingCommand(reservationSystem, user, password, reservationId, newStartTime, newEndTime);
        command.execute();
    }

    public void cancelReservation(User user, String password, String reservationId) {
        Command command = new CancelBookingCommand(reservationSystem, user, password, reservationId);
        command.execute();
    }

    public void extendReservation(User user, String password, String reservationId, LocalDateTime newEndTime) {
        Command command = new ExtendBookingCommand(reservationSystem, user, password, reservationId, newEndTime);
        command.execute();
    }

    public Payment processPayment(User user, String password, String reservationId, double amount, String method) {
        return reservationSystem.processPayment(user, password, reservationId, amount, method);
    }

    public void updateEquipmentStatus(User user, String password, String equipmentId, String newStatus) {
        Command command = new UpdateEquipmentStatusCommand(reservationSystem, user, password, equipmentId, newStatus);
        command.execute();
    }

    public void applySensorUpdate(User user, String password, String equipmentId, String operationalStatus, String message) {
        SensorUpdate update = new SensorUpdate(operationalStatus, message);
        reservationSystem.applySensorUpdate(user, password, equipmentId, update);
    }
    
    public void AutoGenerateLabManagerCommand(User user, String password, String email) {
        Command command = new AutoGenerateLabManagerCommand(reservationSystem, user, password, email);
        command.execute();
    }

    public List<User> getAllUsers() {
        return reservationSystem.getAllUsers();
    }

    public List<Equipment> getAllEquipment() {
        return reservationSystem.getAllEquipment();
    }

    public List<Reservation> getAllReservations() {
        return reservationSystem.getAllReservations();
    }

    public List<Payment> getAllPayments() {
        return reservationSystem.getAllPayments();
    }

    public User findUserByEmail(String email) {
        for (User user : reservationSystem.getAllUsers()) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }
   
    public void attachDefaultObserversToEquipment(Equipment equipment) {
        equipment.attach(new NotificationService());
        equipment.attach(new LabManagerDashboard());
    }
}
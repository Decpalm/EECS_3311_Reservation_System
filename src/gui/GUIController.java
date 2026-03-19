package gui;

import app.ReservationSystem;
import command.AddEquipmentCommand;
import command.CancelBookingCommand;
import command.Command;
import command.ExtendBookingCommand;
import command.ModifyBookingCommand;
import command.ReserveEquipmentCommand;
import command.UpdateEquipmentStatusCommand;
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

    public void addEquipment(User user, String equipmentId, String description, String labLocation) {
        Command command = new AddEquipmentCommand(reservationSystem, user, equipmentId, description, labLocation);
        command.execute();
    }

    public void reserveEquipment(User user, String equipmentId, LocalDateTime startTime, LocalDateTime endTime) {
        Command command = new ReserveEquipmentCommand(reservationSystem, user, equipmentId, startTime, endTime);
        command.execute();
    }

    public void modifyReservation(String reservationId, LocalDateTime newStartTime, LocalDateTime newEndTime) {
        Command command = new ModifyBookingCommand(reservationSystem, reservationId, newStartTime, newEndTime);
        command.execute();
    }

    public void cancelReservation(String reservationId) {
        Command command = new CancelBookingCommand(reservationSystem, reservationId);
        command.execute();
    }

    public void extendReservation(String reservationId, LocalDateTime newEndTime) {
        Command command = new ExtendBookingCommand(reservationSystem, reservationId, newEndTime);
        command.execute();
    }

    public Payment processPayment(String reservationId, double amount, String method) {
        return reservationSystem.processPayment(reservationId, amount, method);
    }

    public void updateEquipmentStatus(User user, String equipmentId, String newStatus) {
        Command command = new UpdateEquipmentStatusCommand(reservationSystem, user, equipmentId, newStatus);
        command.execute();
    }

    public void applySensorUpdate(User user, String equipmentId, String operationalStatus, String message) {
        SensorUpdate update = new SensorUpdate(operationalStatus, message);
        reservationSystem.applySensorUpdate(user, equipmentId, update);
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
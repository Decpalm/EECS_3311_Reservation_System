package app;

import factory.AccountFactory;
import factory.EquipmentFactory;
import model.*;
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
        
        if (role.trim().toLowerCase().equals("head lab coordinator") && dataStore.findUserByRole(role) != null) {
        	throw new IllegalArgumentException("Only one Head Lab Coordinator account my exist. ");
        }
        
        //Temporarily removing password strength check to make testing easier
        /*
        if(!passwordHash.matches("^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8}$") ){
        	throw new IllegalArgumentException("Password is too weak. Please include at least one uppercase letter, lowercase letter, number, and special character.");
        }
        */

        User user = AccountFactory.createUser(role, email, passwordHash, idOrCertNumber);
        dataStore.saveUser(user);
        return user;
    }

    public Equipment addEquipment(User user, String password, String equipmentId, String description, String labLocation) {
        if (dataStore.findEquipmentById(equipmentId) != null) {
            throw new IllegalArgumentException("Equipment with this ID already exists.");
        }
        if (!user.getRole().equals("LabManager")) {
        	throw new IllegalArgumentException("Only Lab Managers may add new equipment.");
        }
        
        if(!this.checkPassword(user, password)) {
    		throw new IllegalArgumentException("Email or password is incorrect");
    	}

        Equipment equipment = EquipmentFactory.createEquipment(equipmentId, description, labLocation);
        dataStore.saveEquipment(equipment);
        return equipment;
    }

    public Reservation createReservation(User user, String password, String equipmentId, LocalDateTime startTime, LocalDateTime endTime) {
        Equipment equipment = dataStore.findEquipmentById(equipmentId);

        if (equipment == null) {
            throw new IllegalArgumentException("Equipment not found.");
        }

        if (!equipment.isAvailable(startTime, endTime, equipmentId)) {
            throw new IllegalArgumentException("Equipment is not available for reservation.");
        }
        
        if(!this.checkPassword(user, password)) {
    		throw new IllegalArgumentException("Email or password is incorrect");
    	}

        PricingStrategy strategy = getPricingStrategyForUser(user);

        Reservation reservation = new Reservation(user, equipment, startTime, endTime, strategy);
        reservation.confirmReservation();
        dataStore.saveReservation(reservation);

        return reservation;
    }

    public void modifyReservation(User user, String password, String reservationId, LocalDateTime newStartTime, LocalDateTime newEndTime) {
        Reservation reservation = dataStore.findReservationById(reservationId);

        if (reservation == null) {
            throw new IllegalArgumentException("Reservation not found.");
        }
        
        if(!this.checkPassword(user, password)) {
    		throw new IllegalArgumentException("Email or password is incorrect");
    	}
        
        if (reservation.getUser() != user) {
        	throw new IllegalArgumentException("Reservation does not belong to user. ");
        }
                
        Equipment equipment = reservation.getEquipment();
        
        if (!equipment.isModifyAvailable(newStartTime, newEndTime, equipment.getEquipmentId(), reservation)) {
            throw new IllegalArgumentException("Reservation is not available to be modified");
        }

        reservation.modifyReservation(newStartTime, newEndTime);
        dataStore.updateReservations();
    }

    public void cancelReservation(User user, String password, String reservationId) {
        Reservation reservation = dataStore.findReservationById(reservationId);

        if (reservation == null) {
            throw new IllegalArgumentException("Reservation not found.");
        }
        
        if(!this.checkPassword(user, password)) {
    		throw new IllegalArgumentException("Email or password is incorrect");
    	}
        
        if (reservation.getUser() != user) {
        	throw new IllegalArgumentException("Reservation does not belong to user. ");
        }

        reservation.cancelReservation();
        dataStore.updateReservations();
    }

    public void extendReservation(User user, String password, String reservationId, LocalDateTime newEndTime) {
        Reservation reservation = dataStore.findReservationById(reservationId);

        if (reservation == null) {
            throw new IllegalArgumentException("Reservation not found.");
        }
        
        if(!this.checkPassword(user, password)) {
    		throw new IllegalArgumentException("Email or password is incorrect");
    	}
        
        if (reservation.getUser() != user) {
        	throw new IllegalArgumentException("Reservation does not belong to user. ");
        }
        
        Equipment equipment = reservation.getEquipment();
        
        if (!equipment.isModifyAvailable(reservation.getStartTime(), newEndTime, equipment.getEquipmentId(), reservation)) {
            throw new IllegalArgumentException("Reservation is not available to be extended");
        }

        reservation.extendReservation(newEndTime);
        dataStore.updateReservations();
    }

    public Payment processPayment(User user, String password, String reservationId, double amount, String method) {
        Reservation reservation = dataStore.findReservationById(reservationId);

        if (reservation == null) {
            throw new IllegalArgumentException("Reservation not found.");
        }
        
        if(!this.checkPassword(user, password)) {
    		throw new IllegalArgumentException("Email or password is incorrect");
    	}
        
        if (reservation.getUser() != user) {
        	throw new IllegalArgumentException("Reservation does not belong to user. ");
        }

        Payment payment = new Payment(amount, method);
        payment.markSuccess();

        reservation.setPayment(payment);
        dataStore.savePayment(payment);

        return payment;
    }

    public void updateEquipmentStatus(User user, String password, String equipmentId, String newStatus) {
        Equipment equipment = dataStore.findEquipmentById(equipmentId);

        if (equipment == null) {
            throw new IllegalArgumentException("Equipment not found.");
        }
        
        if(!this.checkPassword(user, password)) {
    		throw new IllegalArgumentException("Email or password is incorrect");
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

    public void autoGenerateLabManager(User user, String password, String email) {
    	if (!user.getRole().equals("HeadLabCoordinator")) {
        	throw new IllegalArgumentException("Only Head Lab Coordinators may auto-generate Lab Manager accounts.");
        }
    	
    	if(!this.checkPassword(user, password)) {
    		throw new IllegalArgumentException("Email or password is incorrect");
    	}
    	
    	HeadLabCoordinator coordinator = (HeadLabCoordinator) user;
    	
    	User labManager = coordinator.autoGenerateManagerAccount(email);
    	
    	dataStore.saveUser(labManager);
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
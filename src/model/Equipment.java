package model;

import observer.EquipmentObserver;
import observer.EquipmentSubject;
import persistence.CSVDataStore;
import state.AvailableState;
import state.DisabledState;
import state.EquipmentState;
import state.MaintenanceState;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Equipment implements EquipmentSubject {
    private String equipmentId;
    private String description;
    private String labLocation;
    private String status;
    private EquipmentState currentState;
    private List<EquipmentObserver> observers;

    public Equipment(String equipmentId, String description, String labLocation) {
        this.equipmentId = equipmentId;
        this.description = description;
        this.labLocation = labLocation;
        this.currentState = new AvailableState();
        this.status = currentState.getStateName();
        this.observers = new ArrayList<>();
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public String getDescription() {
        return description;
    }

    public String getLabLocation() {
        return labLocation;
    }

    public String getStatus() {
        return status;
    }

    public EquipmentState getCurrentState() {
        return currentState;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLabLocation(String labLocation) {
        this.labLocation = labLocation;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setState(EquipmentState state) {
        this.currentState = state;
        this.status = state.getStateName();
        notifyObservers();
    }

    public void enable() {
        currentState.enable(this);
        this.status = currentState.getStateName();
        notifyObservers();
    }

    public void disable() {
        currentState.disable(this);
        this.status = currentState.getStateName();
        notifyObservers();
    }

    public void markMaintenance() {
        currentState.markMaintenance(this);
        this.status = currentState.getStateName();
        notifyObservers();
    }

    public boolean isAvailable(LocalDateTime start, LocalDateTime end, String equipmentId) {
    	CSVDataStore data = CSVDataStore.getInstance();
    	List<Reservation> reservations = data.getReservations();
    	
    	for(Reservation reservation : reservations) {
    		if( 	((( start.isAfter(reservation.getStartTime()) || start.equals(reservation.getStartTime())) && (start.isBefore(reservation.getEndTime()) || start.equals(reservation.getEndTime())) ) || //Start time is during another reservation
    				(( end.isAfter(reservation.getStartTime()) 	|| end.equals(reservation.getStartTime())) 	 && (end.isBefore(reservation.getEndTime())   || end.equals(reservation.getEndTime())) )   || //End time is during another reservation
    				(start.isBefore(reservation.getStartTime()) && end.isAfter(reservation.getEndTime())) ) && // existing reservation is between start and end time
    				equipmentId.equals(reservation.getEquipment().getEquipmentId()) //reservation is for the same equipment
    				){
    			return false;
    		}
    	}
    	
        return currentState instanceof AvailableState;
    }
    
    public boolean isModifyAvailable(LocalDateTime start, LocalDateTime end, String equipmentId, Reservation existingReservation) {
    	CSVDataStore data = CSVDataStore.getInstance();
    	List<Reservation> reservations = data.getReservations();
    	
    	for(Reservation reservation : reservations) {
    		if( 	((( start.isAfter(reservation.getStartTime()) || start.equals(reservation.getStartTime())) && (start.isBefore(reservation.getEndTime()) || start.equals(reservation.getEndTime())) ) || //Start time is during another reservation
    				(( end.isAfter(reservation.getStartTime()) 	|| end.equals(reservation.getStartTime())) 	 && (end.isBefore(reservation.getEndTime())   || end.equals(reservation.getEndTime())) )   || //End time is during another reservation
    				(start.isBefore(reservation.getStartTime()) && end.isAfter(reservation.getEndTime())) ) && // existing reservation is between start and end time
    				equipmentId.equals(reservation.getEquipment().getEquipmentId()) && //reservation is for the same equipment
    				reservation != existingReservation // Doesn't check overlap with itself
    				){
    			return false;
    		}
    	}
    	
        return currentState instanceof AvailableState;
    }

    public void applySensorUpdate(SensorUpdate update) {
        String sensorStatus = update.getOperationalStatus().toUpperCase();

        switch (sensorStatus) {
            case "AVAILABLE":
                setState(new AvailableState());
                break;
            case "DISABLED":
                setState(new DisabledState());
                break;
            case "MAINTENANCE":
                setState(new MaintenanceState());
                break;
            default:
                System.out.println("Unknown sensor status: " + sensorStatus);
        }
    }

    @Override
    public void attach(EquipmentObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(EquipmentObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (EquipmentObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipmentId='" + equipmentId + '\'' +
                ", description='" + description + '\'' +
                ", labLocation='" + labLocation + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
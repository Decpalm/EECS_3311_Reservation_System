package model;

import state.ConfirmedState;
import state.PendingState;
import state.ReservationState;
import strategy.PricingStrategy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {
    private UUID reservationId;
    private User user;
    private Equipment equipment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private double hourlyRate;
    private double depositAmount;
    private double totalCost;
    private PricingStrategy pricingStrategy;
    private ReservationState currentState;
    private Payment payment;

    public Reservation(User user, Equipment equipment, LocalDateTime startTime, LocalDateTime endTime,
                       PricingStrategy pricingStrategy) {
        this.reservationId = UUID.randomUUID();
        this.user = user;
        this.equipment = equipment;
        this.startTime = startTime;
        this.endTime = endTime;
        this.pricingStrategy = pricingStrategy;
        this.currentState = new PendingState();
        this.status = currentState.getStateName();
        calculateTotalCost();
    }

    public UUID getReservationId() {
        return reservationId;
    }

    public User getUser() {
        return user;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getStatus() {
        return status;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public ReservationState getCurrentState() {
        return currentState;
    }

    public Payment getPayment() {
        return payment;
    }
    
    public void setReservationId(UUID reservationId) {
        this.reservationId = reservationId;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
        calculateTotalCost();
    }

    public void setState(ReservationState state) {
        this.currentState = state;
        this.status = state.getStateName();
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public double getDurationHours() {
        double hours = Duration.between(startTime, endTime).toHours();
        double minutes = Duration.between(startTime, endTime).toMinutes();
        return hours + ( (minutes-(hours*60)) / 60);
    }

    public void calculateTotalCost() {
        double hours = getDurationHours();
        this.hourlyRate = pricingStrategy.calculateHourlyRate(user);
        this.depositAmount = pricingStrategy.calculateDeposit(user, hours);
        this.totalCost = pricingStrategy.calculateTotal(user, hours);
    }

    public void confirmReservation() {
        setState(new ConfirmedState());
    }

    public void modifyReservation(LocalDateTime newStart, LocalDateTime newEnd) {
        currentState.modify(this);
        this.startTime = newStart;
        this.endTime = newEnd;
        calculateTotalCost();
    }

    public boolean cancelReservation() {
        currentState.cancel(this);
        return "Cancelled".equalsIgnoreCase(status);
    }

    public boolean extendReservation(LocalDateTime newEndTime) {
        currentState.extend(this);
        if (!"Cancelled".equalsIgnoreCase(status)) {
            this.endTime = newEndTime;
            calculateTotalCost();
            return true;
        }
        return false;
    }

    public double calculateRemainingBalance() {
        if (payment == null) {
            return totalCost;
        }

        if ("SUCCESS".equalsIgnoreCase(payment.getStatus())) {
            return 0.0;
        }

        return totalCost;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", user=" + user.getEmail() +
                ", equipment=" + equipment.getEquipmentId() +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", depositAmount=" + depositAmount +
                ", totalCost=" + totalCost +
                '}';
    }
}
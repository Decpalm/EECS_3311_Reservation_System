package state;

import model.Reservation;

public class CancelledState implements ReservationState {

    @Override
    public void modify(Reservation reservation) {
        System.out.println("Cancelled reservation cannot be modified.");
    }

    @Override
    public void cancel(Reservation reservation) {
        System.out.println("Reservation is already cancelled.");
    }

    @Override
    public void extend(Reservation reservation) {
        System.out.println("Cancelled reservation cannot be extended.");
    }

    @Override
    public String getStateName() {
        return "Cancelled";
    }
}
package state;

import model.Reservation;

public class PendingState implements ReservationState {

    @Override
    public void modify(Reservation reservation) {
        System.out.println("Pending reservation modified.");
    }

    @Override
    public void cancel(Reservation reservation) {
        reservation.setState(new CancelledState());
    }

    @Override
    public void extend(Reservation reservation) {
        System.out.println("Pending reservation cannot be extended until confirmed.");
    }

    @Override
    public String getStateName() {
        return "Pending";
    }
}
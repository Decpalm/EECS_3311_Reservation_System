package state;

import model.Reservation;

public class ExtendedState implements ReservationState {

    @Override
    public void modify(Reservation reservation) {
        System.out.println("Extended reservation modified.");
    }

    @Override
    public void cancel(Reservation reservation) {
        reservation.setState(new CancelledState());
    }

    @Override
    public void extend(Reservation reservation) {
        System.out.println("Reservation is already extended.");
    }

    @Override
    public String getStateName() {
        return "Extended";
    }
}
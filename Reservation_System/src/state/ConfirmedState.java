package state;

import model.Reservation;

public class ConfirmedState implements ReservationState {

    @Override
    public void modify(Reservation reservation) {
        System.out.println("Confirmed reservation modified.");
    }

    @Override
    public void cancel(Reservation reservation) {
        reservation.setState(new CancelledState());
    }

    @Override
    public void extend(Reservation reservation) {
        reservation.setState(new ExtendedState());
    }

    @Override
    public String getStateName() {
        return "Confirmed";
    }
}
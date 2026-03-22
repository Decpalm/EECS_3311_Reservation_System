package state;

import model.Reservation;

public interface ReservationState {
    void modify(Reservation reservation);
    void cancel(Reservation reservation);
    void extend(Reservation reservation);
    String getStateName();
}
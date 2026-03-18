package command;

import app.ReservationSystem;

public class CancelBookingCommand implements Command {
    private ReservationSystem reservationSystem;
    private String reservationId;

    public CancelBookingCommand(ReservationSystem reservationSystem, String reservationId) {
        this.reservationSystem = reservationSystem;
        this.reservationId = reservationId;
    }

    @Override
    public void execute() {
        reservationSystem.cancelReservation(reservationId);
    }
}
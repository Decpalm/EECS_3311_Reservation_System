package command;

import app.ReservationSystem;

import java.time.LocalDateTime;

public class ExtendBookingCommand implements Command {
    private ReservationSystem reservationSystem;
    private String reservationId;
    private LocalDateTime newEndTime;

    public ExtendBookingCommand(ReservationSystem reservationSystem, String reservationId,
                                LocalDateTime newEndTime) {
        this.reservationSystem = reservationSystem;
        this.reservationId = reservationId;
        this.newEndTime = newEndTime;
    }

    @Override
    public void execute() {
        reservationSystem.extendReservation(reservationId, newEndTime);
    }
}
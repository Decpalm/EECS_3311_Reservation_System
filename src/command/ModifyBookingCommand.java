package command;

import app.ReservationSystem;

import java.time.LocalDateTime;

public class ModifyBookingCommand implements Command {
    private ReservationSystem reservationSystem;
    private String reservationId;
    private LocalDateTime newStartTime;
    private LocalDateTime newEndTime;

    public ModifyBookingCommand(ReservationSystem reservationSystem, String reservationId,
                                LocalDateTime newStartTime, LocalDateTime newEndTime) {
        this.reservationSystem = reservationSystem;
        this.reservationId = reservationId;
        this.newStartTime = newStartTime;
        this.newEndTime = newEndTime;
    }

    @Override
    public void execute() {
        reservationSystem.modifyReservation(reservationId, newStartTime, newEndTime);
    }
}
package command;

import app.ReservationSystem;
import model.User;

import java.time.LocalDateTime;

public class ModifyBookingCommand implements Command {
    private ReservationSystem reservationSystem;
    private User user;
    private String password;
    private String reservationId;
    private LocalDateTime newStartTime;
    private LocalDateTime newEndTime;

    public ModifyBookingCommand(ReservationSystem reservationSystem, User user, String password, String reservationId,
                                LocalDateTime newStartTime, LocalDateTime newEndTime) {
        this.reservationSystem = reservationSystem;
        this.user = user;
        this.password = password;
        this.reservationId = reservationId;
        this.newStartTime = newStartTime;
        this.newEndTime = newEndTime;
    }

    @Override
    public void execute() {
        reservationSystem.modifyReservation(user, password, reservationId, newStartTime, newEndTime);
    }
}
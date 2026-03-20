package command;

import app.ReservationSystem;
import model.User;

import java.time.LocalDateTime;

public class ExtendBookingCommand implements Command {
    private ReservationSystem reservationSystem;
    private User user;
    private String password;
    private String reservationId;
    private LocalDateTime newEndTime;

    public ExtendBookingCommand(ReservationSystem reservationSystem, User user, String password, String reservationId,
                                LocalDateTime newEndTime) {
        this.reservationSystem = reservationSystem;
        this.user = user;
        this.password = password;
        this.reservationId = reservationId;
        this.newEndTime = newEndTime;
    }

    @Override
    public void execute() {
        reservationSystem.extendReservation(user, password, reservationId, newEndTime);
    }
}
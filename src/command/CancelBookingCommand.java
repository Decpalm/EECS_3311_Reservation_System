package command;

import app.ReservationSystem;
import model.User;

public class CancelBookingCommand implements Command {
    private ReservationSystem reservationSystem;
    private User user;
    private String password;
    private String reservationId;
    
    public CancelBookingCommand(ReservationSystem reservationSystem, User user, String password, String reservationId) {
        this.reservationSystem = reservationSystem;
        this.user = user;
        this.password = password;
        this.reservationId = reservationId;
    }

    @Override
    public void execute() {
        reservationSystem.cancelReservation(user, password, reservationId);
    }
}
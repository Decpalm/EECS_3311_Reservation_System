package command;

import app.ReservationSystem;
import model.User;

import java.time.LocalDateTime;

public class ReserveEquipmentCommand implements Command {
    private ReservationSystem reservationSystem;
    private User user;
    private String password;
    private String equipmentId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public ReserveEquipmentCommand(ReservationSystem reservationSystem, User user, String password, 
                                   String equipmentId, LocalDateTime startTime, LocalDateTime endTime) {
        this.reservationSystem = reservationSystem;
        this.user = user;
        this.password = password;
        this.equipmentId = equipmentId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public void execute() {
        reservationSystem.createReservation(user, password, equipmentId, startTime, endTime);
    }
}
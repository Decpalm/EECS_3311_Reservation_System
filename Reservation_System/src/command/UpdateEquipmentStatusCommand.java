package command;

import app.ReservationSystem;
import model.User;

public class UpdateEquipmentStatusCommand implements Command {
    private ReservationSystem reservationSystem;
    private User user;
    private String password;
    private String equipmentId;
    private String newStatus;

    public UpdateEquipmentStatusCommand(ReservationSystem reservationSystem,
                                        User user, String password, String equipmentId, String newStatus) {
        this.reservationSystem = reservationSystem;
        this.user = user;
        this.password = password;
        this.equipmentId = equipmentId;
        this.newStatus = newStatus;
    }

    @Override
    public void execute() {
        reservationSystem.updateEquipmentStatus(user, password, equipmentId, newStatus);
    }
}
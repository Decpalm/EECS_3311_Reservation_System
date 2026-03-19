package command;

import app.ReservationSystem;
import model.User;

public class AddEquipmentCommand implements Command {
    private ReservationSystem reservationSystem;
    private User user;
    private String equipmentId;
    private String description;
    private String labLocation;

    public AddEquipmentCommand(ReservationSystem reservationSystem, User user, String equipmentId,
                               String description, String labLocation) {
        this.reservationSystem = reservationSystem;
        this.user = user;
        this.equipmentId = equipmentId;
        this.description = description;
        this.labLocation = labLocation;
    }

    @Override
    public void execute() {
        reservationSystem.addEquipment(user, equipmentId, description, labLocation);
    }
}
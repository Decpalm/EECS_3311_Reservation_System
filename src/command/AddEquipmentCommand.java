package command;

import app.ReservationSystem;

public class AddEquipmentCommand implements Command {
    private ReservationSystem reservationSystem;
    private String equipmentId;
    private String description;
    private String labLocation;

    public AddEquipmentCommand(ReservationSystem reservationSystem, String equipmentId,
                               String description, String labLocation) {
        this.reservationSystem = reservationSystem;
        this.equipmentId = equipmentId;
        this.description = description;
        this.labLocation = labLocation;
    }

    @Override
    public void execute() {
        reservationSystem.addEquipment(equipmentId, description, labLocation);
    }
}
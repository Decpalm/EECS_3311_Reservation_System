package command;

import app.ReservationSystem;

public class UpdateEquipmentStatusCommand implements Command {
    private ReservationSystem reservationSystem;
    private String equipmentId;
    private String newStatus;

    public UpdateEquipmentStatusCommand(ReservationSystem reservationSystem,
                                        String equipmentId, String newStatus) {
        this.reservationSystem = reservationSystem;
        this.equipmentId = equipmentId;
        this.newStatus = newStatus;
    }

    @Override
    public void execute() {
        reservationSystem.updateEquipmentStatus(equipmentId, newStatus);
    }
}
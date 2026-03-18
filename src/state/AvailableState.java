package state;

import model.Equipment;

public class AvailableState implements EquipmentState {

    @Override
    public void enable(Equipment equipment) {
        System.out.println("Equipment is already available.");
    }

    @Override
    public void disable(Equipment equipment) {
        equipment.setState(new DisabledState());
    }

    @Override
    public void markMaintenance(Equipment equipment) {
        equipment.setState(new MaintenanceState());
    }

    @Override
    public String getStateName() {
        return "Available";
    }
}
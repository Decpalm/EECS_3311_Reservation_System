package state;

import model.Equipment;

public class DisabledState implements EquipmentState {

    @Override
    public void enable(Equipment equipment) {
        equipment.setState(new AvailableState());
    }

    @Override
    public void disable(Equipment equipment) {
        System.out.println("Equipment is already disabled.");
    }

    @Override
    public void markMaintenance(Equipment equipment) {
        equipment.setState(new MaintenanceState());
    }

    @Override
    public String getStateName() {
        return "Disabled";
    }
}
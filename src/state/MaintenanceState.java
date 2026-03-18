package state;

import model.Equipment;

public class MaintenanceState implements EquipmentState {

    @Override
    public void enable(Equipment equipment) {
        equipment.setState(new AvailableState());
    }

    @Override
    public void disable(Equipment equipment) {
        equipment.setState(new DisabledState());
    }

    @Override
    public void markMaintenance(Equipment equipment) {
        System.out.println("Equipment is already under maintenance.");
    }

    @Override
    public String getStateName() {
        return "Maintenance";
    }
}
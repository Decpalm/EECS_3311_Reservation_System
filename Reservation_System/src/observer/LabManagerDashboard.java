package observer;

import model.Equipment;

public class LabManagerDashboard implements EquipmentObserver {

    @Override
    public void update(Equipment equipment) {
        System.out.println("LabManagerDashboard updated: Equipment "
                + equipment.getEquipmentId() + " is now " + equipment.getStatus());
    }
}
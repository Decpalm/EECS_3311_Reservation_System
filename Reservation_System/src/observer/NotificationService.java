package observer;

import model.Equipment;

public class NotificationService implements EquipmentObserver {

    @Override
    public void update(Equipment equipment) {
        System.out.println("NotificationService received update: Equipment "
                + equipment.getEquipmentId() + " is now " + equipment.getStatus());

        if ("Maintenance".equalsIgnoreCase(equipment.getStatus())) {
            sendMaintenanceAlert(equipment);
        } else {
            sendStatusAlert(equipment);
        }
    }

    public void sendMaintenanceAlert(Equipment equipment) {
        System.out.println("ALERT: Equipment " + equipment.getEquipmentId()
                + " requires maintenance at " + equipment.getLabLocation());
    }

    public void sendStatusAlert(Equipment equipment) {
        System.out.println("STATUS ALERT: Equipment " + equipment.getEquipmentId()
                + " status changed to " + equipment.getStatus());
    }
}
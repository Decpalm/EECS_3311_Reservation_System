package state;

import model.Equipment;

public interface EquipmentState {
    void enable(Equipment equipment);
    void disable(Equipment equipment);
    void markMaintenance(Equipment equipment);
    String getStateName();
}
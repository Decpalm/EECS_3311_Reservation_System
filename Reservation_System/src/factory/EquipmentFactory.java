package factory;

import model.Equipment;

public class EquipmentFactory {

    public static Equipment createEquipment(String equipmentId, String description, String labLocation) {
        if (equipmentId == null || equipmentId.isBlank()) {
            throw new IllegalArgumentException("Equipment ID cannot be empty.");
        }

        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Equipment description cannot be empty.");
        }

        if (labLocation == null || labLocation.isBlank()) {
            throw new IllegalArgumentException("Lab location cannot be empty.");
        }

        return new Equipment(equipmentId, description, labLocation);
    }
}
package model;

public class LabManager extends User {
    private String managerId;

    public LabManager(String email, String passwordHash, String idOrCertNumber, String managerId) {
        super(email, passwordHash, idOrCertNumber);
        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public void addEquipment(Equipment equipment) {
        System.out.println("LabManager added equipment: " + equipment.getEquipmentId());
    }

    public void setEquipmentStatus(Equipment equipment, String newStatus) {
        equipment.setStatus(newStatus);
        System.out.println("LabManager updated equipment status to: " + newStatus);
    }

    public void markMaintenance(Equipment equipment) {
        equipment.markMaintenance();
        System.out.println("LabManager marked equipment for maintenance: " + equipment.getEquipmentId());
    }

    @Override
    public double getHourlyRate() {
        return 0.0;
    }

    @Override
    public String getRole() {
        return "LabManager";
    }
}
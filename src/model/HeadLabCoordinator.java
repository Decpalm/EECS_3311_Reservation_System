package model;

public class HeadLabCoordinator extends User {
    private String coordinatorId;

    public HeadLabCoordinator(String email, String passwordHash, String idOrCertNumber, String coordinatorId) {
        super(email, passwordHash, idOrCertNumber);
        this.coordinatorId = coordinatorId;
    }

    public String getCoordinatorId() {
        return coordinatorId;
    }

    public void setCoordinatorId(String coordinatorId) {
        this.coordinatorId = coordinatorId;
    }

    public LabManager autoGenerateManagerAccount(String email) {
        String defaultPasswordHash = "temp123";
        String defaultCertNumber = "LM-CERT";
        String generatedManagerId = "LM-" + System.currentTimeMillis();

        return new LabManager(email, defaultPasswordHash, defaultCertNumber, generatedManagerId);
    }

    @Override
    public double getHourlyRate() {
        return 0.0;
    }

    @Override
    public String getRole() {
        return "HeadLabCoordinator";
    }
}
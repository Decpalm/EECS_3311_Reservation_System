package model;

public class HeadLabCoordinator extends User {

    public HeadLabCoordinator(String email, String passwordHash, String idOrCertNumber) {
        super(email, passwordHash, idOrCertNumber);
    }

    public LabManager autoGenerateManagerAccount(String email) {
        String defaultPasswordHash = "temp123";
        String defaultCertNumber = "LM-CERT";

        return new LabManager(email, defaultPasswordHash, defaultCertNumber);
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
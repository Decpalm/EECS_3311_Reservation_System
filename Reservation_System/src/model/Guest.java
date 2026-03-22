package model;

public class Guest extends User {

    public Guest(String email, String passwordHash, String idOrCertNumber) {
        super(email, passwordHash, idOrCertNumber);
    }

    @Override
    public double getHourlyRate() {
        return 25.0;
    }

    @Override
    public String getRole() {
        return "Guest";
    }
}
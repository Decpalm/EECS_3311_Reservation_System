package model;

public class Faculty extends User {

    public Faculty(String email, String passwordHash, String idOrCertNumber) {
        super(email, passwordHash, idOrCertNumber);
    }

    @Override
    public double getHourlyRate() {
        return 20.0;
    }

    @Override
    public String getRole() {
        return "Faculty";
    }
}
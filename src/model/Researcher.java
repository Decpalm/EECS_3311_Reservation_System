package model;

public class Researcher extends User {

    public Researcher(String email, String passwordHash, String idOrCertNumber) {
        super(email, passwordHash, idOrCertNumber);
        if(this.getIdOrCertNumber().equals("")) {
        	this.setStatus("INACTIVE");
        }
    }

    @Override
    public double getHourlyRate() {
        return 15.0;
    }

    @Override
    public String getRole() {
        return "Researcher";
    }
}
package model;

public class Student extends User {

    public Student(String email, String passwordHash, String idOrCertNumber) {
        super(email, passwordHash, idOrCertNumber);
    }

    @Override
    public double getHourlyRate() {
        return 10.0;
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
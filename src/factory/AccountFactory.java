package factory;

import model.Faculty;
import model.Guest;
import model.HeadLabCoordinator;
import model.LabManager;
import model.Researcher;
import model.Student;
import model.User;

public class AccountFactory {

    public static User createUser(String role, String email, String passwordHash, String idOrCertNumber) {
        if (role == null) {
            throw new IllegalArgumentException("Role cannot be null.");
        }

        switch (role.trim().toLowerCase()) {
            case "student":
                return new Student(email, passwordHash, idOrCertNumber);

            case "faculty":
                return new Faculty(email, passwordHash, idOrCertNumber);

            case "researcher":
                return new Researcher(email, passwordHash, idOrCertNumber);

            case "guest":
                return new Guest(email, passwordHash, idOrCertNumber);

            default:
                throw new IllegalArgumentException("Invalid user role: " + role);
        }
    }

    public static LabManager createLabManager(String email, String passwordHash,
                                              String idOrCertNumber, String managerId) {
        return new LabManager(email, passwordHash, idOrCertNumber, managerId);
    }

    public static HeadLabCoordinator createHeadLabCoordinator(String email, String passwordHash,
                                                              String idOrCertNumber, String coordinatorId) {
        return new HeadLabCoordinator(email, passwordHash, idOrCertNumber, coordinatorId);
    }
}
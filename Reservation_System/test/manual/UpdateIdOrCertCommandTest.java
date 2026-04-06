package manual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ReservationSystem;
import command.UpdateIdOrCertCommand;
import model.User;
import persistence.CSVDataStore;

public class UpdateIdOrCertCommandTest {

    private ReservationSystem system;
    private User student;

    @BeforeEach
    void setUp() {
        CSVDataStore.resetInstance();
        CSVDataStore dataStore = CSVDataStore.getInstance();

        dataStore.setFilePaths(
            "test_data/users_test.csv",
            "test_data/equipment_test.csv",
            "test_data/reservations_test.csv",
            "test_data/payments_test.csv"
        );

        dataStore.resetTestData();
        ReservationSystem.resetInstance();
        system = ReservationSystem.getInstance();

        student = system.registerUser("student", "student@yorku.ca", "Password123!", "STU001");
    }

    @Test
    void execute_validUpdate_updatesUserId() {
        UpdateIdOrCertCommand command = new UpdateIdOrCertCommand(system, student, "Password123!", "NEWID999");

        command.execute();

        assertEquals("NEWID999", student.getIdOrCertNumber());
        assertTrue(student.isActive());
    }

    @Test
    void execute_wrongPassword_exceptionPropagates() {
        UpdateIdOrCertCommand command = new UpdateIdOrCertCommand(system, student, "wrongpass", "NEWID999");

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }

    @Test
    void execute_emptyId_setsUserInactive() {
        UpdateIdOrCertCommand command = new UpdateIdOrCertCommand(system, student, "Password123!", "");

        command.execute();

        assertFalse(student.isActive());
    }
}
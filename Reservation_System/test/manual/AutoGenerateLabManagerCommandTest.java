package manual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ReservationSystem;
import command.AutoGenerateLabManagerCommand;
import model.User;
import persistence.CSVDataStore;

public class AutoGenerateLabManagerCommandTest {

    private ReservationSystem system;
    private User coordinator;
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

        coordinator = system.registerUser("HeadLabCoordinator", "hlc@yorku.ca", "Password123!", "HLC001");
        student = system.registerUser("student", "student@yorku.ca", "Password123!", "STU001");
    }

    @Test
    void execute_validCoordinator_createsLabManager() {
        AutoGenerateLabManagerCommand command = new AutoGenerateLabManagerCommand(system, coordinator, "Password123!", "newlm@yorku.ca");

        command.execute();

        User created = CSVDataStore.getInstance().findUserByEmail("newlm@yorku.ca");
        assertNotNull(created);
        assertEquals("LabManager", created.getRole());
    }

    @Test
    void execute_invalidUser_exceptionPropagates() {
        AutoGenerateLabManagerCommand command = new AutoGenerateLabManagerCommand(system, student, "Password123!", "newlm2@yorku.ca");

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }

    @Test
    void execute_duplicateEmail_exceptionPropagates() {
        AutoGenerateLabManagerCommand command = new AutoGenerateLabManagerCommand(system, coordinator, "Password123!", "student@yorku.ca");

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }
}
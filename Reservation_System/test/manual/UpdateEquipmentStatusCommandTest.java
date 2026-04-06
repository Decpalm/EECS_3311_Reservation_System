package manual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ReservationSystem;
import command.UpdateEquipmentStatusCommand;
import model.Equipment;
import model.User;
import persistence.CSVDataStore;

public class UpdateEquipmentStatusCommandTest {

    private ReservationSystem system;
    private User labManager;
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

        labManager = system.registerUser("LabManager", "labmanager@yorku.ca", "Password123!", "LM001");
        student = system.registerUser("student", "student@yorku.ca", "Password123!", "STU001");
    }

    @Test
    void execute_validStatusUpdate_updatesEquipment() {
        system.addEquipment(labManager, "Password123!", "EQ600", "Microscope", "Lab A");
        Equipment eq = CSVDataStore.getInstance().findEquipmentById("EQ600");
        eq.disable();

        UpdateEquipmentStatusCommand command = new UpdateEquipmentStatusCommand(system, labManager, "Password123!", "EQ600", "available");

        command.execute();

        assertEquals("Available", eq.getStatus());
    }

    @Test
    void execute_invalidUser_exceptionPropagates() {
        system.addEquipment(labManager, "Password123!", "EQ601", "Oscilloscope", "Lab B");

        UpdateEquipmentStatusCommand command = new UpdateEquipmentStatusCommand(system, student, "Password123!", "EQ601", "available");

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }

    @Test
    void execute_invalidEquipment_exceptionPropagates() {
        UpdateEquipmentStatusCommand command = new UpdateEquipmentStatusCommand(system, labManager, "Password123!", "INVALID_ID", "available");

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }
}
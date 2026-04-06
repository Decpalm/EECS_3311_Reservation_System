package manual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ReservationSystem;
import command.AddEquipmentCommand;
import model.Equipment;
import model.User;
import persistence.CSVDataStore;

public class AddEquipmentCommandTest {

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
    void execute_validCommand_addsEquipmentSuccessfully() {
        AddEquipmentCommand command = new AddEquipmentCommand(system, labManager, "Password123!", "EQ100","Microscope","Lab A" );

        command.execute();

        Equipment eq = CSVDataStore.getInstance().findEquipmentById("EQ100");
        assertNotNull(eq);
        assertEquals("EQ100", eq.getEquipmentId());
        assertEquals("Microscope", eq.getDescription());
        assertEquals("Lab A", eq.getLabLocation());
    }

    @Test
    void execute_invalidUser_exceptionPropagates() {
        AddEquipmentCommand command = new AddEquipmentCommand(system,student,"Password123!","EQ101","Oscilloscope","Lab B");

        assertThrows(IllegalArgumentException.class, () ->
            command.execute()
        );
    }

    @Test
    void execute_duplicateEquipmentId_exceptionPropagates() {
        system.addEquipment(labManager, "Password123!", "EQ102", "Centrifuge", "Lab C");

        AddEquipmentCommand command = new AddEquipmentCommand(system,labManager,"Password123!","EQ102","Another Centrifuge", "Lab D");

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }
}
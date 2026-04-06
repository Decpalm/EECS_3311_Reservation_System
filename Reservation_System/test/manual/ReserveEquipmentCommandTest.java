package manual;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ReservationSystem;
import command.ReserveEquipmentCommand;
import model.Reservation;
import model.User;
import persistence.CSVDataStore;

public class ReserveEquipmentCommandTest {

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
    void execute_validReservation_createsReservation() {
        system.addEquipment(labManager, "Password123!", "EQ500", "Microscope", "Lab A");

        ReserveEquipmentCommand command = new ReserveEquipmentCommand(system, student, "Password123!", "EQ500", LocalDateTime.of(2026, 4, 10, 10, 0), LocalDateTime.of(2026, 4, 10, 12, 0));

        command.execute();

        assertEquals(1, system.getAllReservations().size());
        Reservation r = system.getAllReservations().get(0);
        assertEquals(student, r.getUser());
    }

    @Test
    void execute_invalidEquipment_exceptionPropagates() {
        ReserveEquipmentCommand command = new ReserveEquipmentCommand(system, student, "Password123!", "INVALID_ID", LocalDateTime.of(2026, 4, 10, 10, 0), LocalDateTime.of(2026, 4, 10, 12, 0));

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }

    @Test
    void execute_wrongPassword_exceptionPropagates() {
        system.addEquipment(labManager, "Password123!", "EQ501", "Oscilloscope", "Lab B");

        ReserveEquipmentCommand command = new ReserveEquipmentCommand(system, student, "wrongpass", "EQ501", LocalDateTime.of(2026, 4, 10, 10, 0), LocalDateTime.of(2026, 4, 10, 12, 0));

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }
}
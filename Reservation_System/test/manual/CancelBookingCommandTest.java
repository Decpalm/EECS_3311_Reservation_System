package manual;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ReservationSystem;
import command.CancelBookingCommand;
import model.Reservation;
import model.User;
import persistence.CSVDataStore;

public class CancelBookingCommandTest {

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
    void execute_validReservation_cancelsSuccessfully() {
        system.addEquipment(labManager, "Password123!", "EQ200", "Microscope", "Lab A");
        Reservation r = system.createReservation(student, "Password123!", "EQ200",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        CancelBookingCommand command = new CancelBookingCommand(system, student, "Password123!", r.getReservationId().toString());

        command.execute();

        assertEquals("Cancelled", r.getStatus());
    }

    @Test
    void execute_wrongUser_exceptionPropagates() {
        system.addEquipment(labManager, "Password123!", "EQ201", "Oscilloscope", "Lab B");
        Reservation r = system.createReservation(student, "Password123!", "EQ201",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        User anotherStudent = system.registerUser("student", "other@yorku.ca", "Password123!", "STU002");

        CancelBookingCommand command = new CancelBookingCommand(system, anotherStudent, "Password123!", r.getReservationId().toString());

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }

    @Test
    void execute_invalidReservationId_exceptionPropagates() {
        CancelBookingCommand command = new CancelBookingCommand(system, student, "Password123!", "FAKE_ID");

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }
}
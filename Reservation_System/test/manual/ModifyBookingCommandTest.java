package manual;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ReservationSystem;
import command.ModifyBookingCommand;
import model.Reservation;
import model.User;
import persistence.CSVDataStore;

public class ModifyBookingCommandTest {

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
    void execute_validModification_updatesReservation() {
        system.addEquipment(labManager, "Password123!", "EQ400", "Microscope", "Lab A");
        Reservation r = system.createReservation(student, "Password123!", "EQ400",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        ModifyBookingCommand command = new ModifyBookingCommand(system, student, "Password123!", r.getReservationId().toString(), LocalDateTime.of(2026, 4, 11, 9, 0), LocalDateTime.of(2026, 4, 11, 11, 0));

        command.execute();

        assertEquals(LocalDateTime.of(2026, 4, 11, 9, 0), r.getStartTime());
        assertEquals(LocalDateTime.of(2026, 4, 11, 11, 0), r.getEndTime());
    }

    @Test
    void execute_wrongUser_exceptionPropagates() {
        system.addEquipment(labManager, "Password123!", "EQ401", "Oscilloscope", "Lab B");
        Reservation r = system.createReservation(student, "Password123!", "EQ401",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        User anotherStudent = system.registerUser("student", "other@yorku.ca", "Password123!", "STU002");

        ModifyBookingCommand command = new ModifyBookingCommand(system, anotherStudent, "Password123!", r.getReservationId().toString(), LocalDateTime.of(2026, 4, 11, 9, 0), LocalDateTime.of(2026, 4, 11, 11, 0));

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }

    @Test
    void execute_invalidReservationId_exceptionPropagates() {
        ModifyBookingCommand command = new ModifyBookingCommand(system, student, "Password123!", "FAKE_ID", LocalDateTime.of(2026, 4, 11, 9, 0), LocalDateTime.of(2026, 4, 11, 11, 0));

        assertThrows(IllegalArgumentException.class, () -> command.execute());
    }
}
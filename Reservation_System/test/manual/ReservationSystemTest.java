package manual;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ReservationSystem;
import model.Equipment;
import model.Payment;
import model.Reservation;
import model.SensorUpdate;
import model.User;
import persistence.CSVDataStore;

public class ReservationSystemTest {

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
    void getInstance_returnsSameObject() {
        ReservationSystem s1 = ReservationSystem.getInstance();
        ReservationSystem s2 = ReservationSystem.getInstance();
        assertSame(s1, s2);
    }

    @Test
    void resetInstance_createsNewInstance() {
        ReservationSystem old = ReservationSystem.getInstance();
        ReservationSystem.resetInstance();
        assertNotSame(old, ReservationSystem.getInstance());
    }

    @Test
    void registerUser_throwsExceptionSameEmail() {
        assertThrows(IllegalArgumentException.class, () ->
            system.registerUser("student", "student@yorku.ca", "Password123!", "STU002")
        );
    }

    @Test
    void registerUser_weakPassword_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.registerUser("student", "newstudent@yorku.ca", "123456", "STU003")
        );
    }

    @Test
    void registerUser_onlyOneHeadLabCoordinator_allowed() {
        system.registerUser("Head Lab Coordinator", "hlc@yorku.ca", "Password123!", "HLC001");
        assertThrows(IllegalArgumentException.class, () ->
            system.registerUser("Head Lab Coordinator", "hlc2@yorku.ca", "Password123!", "HLC002")
        );
    }

    @Test
    void updateIdOrCert_wrongPassword_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.updateIdOrCert(student, "wrongpass", "NEWID")
        );
    }

    @Test
    void updateIdOrCert_emptyId_setsUserInactive() {
        system.updateIdOrCert(student, "Password123!", "");
        assertFalse(student.isActive());
    }

    @Test
    void updateIdOrCert_validNewId_updatesSuccessfully() {
        system.updateIdOrCert(student, "Password123!", "NEWID999");
        assertTrue(student.isActive());
        assertEquals("NEWID999", student.getIdOrCertNumber());
    }

    @Test
    void addEquipment_validLabManager_returnsEquipment() {
        Equipment eq = system.addEquipment(labManager, "Password123!", "EQ001", "Microscope", "Lab A");

        assertNotNull(eq);
        assertEquals("EQ001", eq.getEquipmentId());
        assertEquals("Microscope", eq.getDescription());
        assertEquals("Lab A", eq.getLabLocation());
    }

    @Test
    void addEquipment_studentTriesToAdd_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.addEquipment(student, "Password123!", "EQ002", "Oscilloscope", "Lab B")
        );
    }

    @Test
    void addEquipment_duplicateId_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ003", "Microscope", "Lab A");
        assertThrows(IllegalArgumentException.class, () ->
            system.addEquipment(labManager, "Password123!", "EQ003", "Different Equipment", "Lab B")
        );
    }

    @Test
    void addEquipment_wrongPassword_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.addEquipment(labManager, "badpassword", "EQ004", "Centrifuge", "Lab C")
        );
    }

    @Test
    void addEquipment_inactiveLabManager_throwsException() {
        labManager.setActive(false);
        assertThrows(IllegalArgumentException.class, () ->
            system.addEquipment(labManager, "Password123!", "EQ005", "Laser Cutter", "Lab D")
        );
    }

    @Test
    void createReservation_equipmentNotFound_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.createReservation(student, "Password123!", "NONEXISTENT",
                LocalDateTime.of(2026, 4, 10, 10, 0),
                LocalDateTime.of(2026, 4, 10, 12, 0))
        );
    }

    @Test
    void createReservation_wrongPassword_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ010", "Oscilloscope", "Lab B");
        assertThrows(IllegalArgumentException.class, () ->
            system.createReservation(student, "wrongpass", "EQ010",
                LocalDateTime.of(2026, 4, 10, 10, 0),
                LocalDateTime.of(2026, 4, 10, 12, 0))
        );
    }

    @Test
    void createReservation_inactiveUser_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ011", "3D Printer", "Lab C");
        student.setActive(false);
        assertThrows(IllegalArgumentException.class, () ->
            system.createReservation(student, "Password123!", "EQ011",
                LocalDateTime.of(2026, 4, 10, 10, 0),
                LocalDateTime.of(2026, 4, 10, 12, 0))
        );
    }

    @Test
    void createReservation_overlappingTime_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ012", "Thermal Camera", "Lab D");
        User anotherStudent = system.registerUser("student", "another@yorku.ca", "Password123!", "STU004");

        system.createReservation(student, "Password123!", "EQ012",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        assertThrows(IllegalArgumentException.class, () ->
            system.createReservation(anotherStudent, "Password123!", "EQ012",
                LocalDateTime.of(2026, 4, 10, 11, 0),
                LocalDateTime.of(2026, 4, 10, 13, 0))
        );
    }

    @Test
    void createReservation_valid_returnsConfirmedReservation() {
        system.addEquipment(labManager, "Password123!", "EQ013", "Centrifuge", "Lab E");

        Reservation r = system.createReservation(student, "Password123!", "EQ013",
            LocalDateTime.of(2026, 4, 13, 10, 0),
            LocalDateTime.of(2026, 4, 13, 12, 0));

        assertNotNull(r);
        assertEquals("Confirmed", r.getStatus());
        assertEquals(student, r.getUser());
    }

    @Test
    void createReservation_valid_savedInDataStore() {
        system.addEquipment(labManager, "Password123!", "EQ014", "Spectrometer", "Lab F");

        Reservation r = system.createReservation(student, "Password123!", "EQ014",
            LocalDateTime.of(2026, 4, 14, 8, 0),
            LocalDateTime.of(2026, 4, 14, 10, 0));

        assertNotNull(CSVDataStore.getInstance().findReservationById(r.getReservationId().toString()));
    }

    @Test
    void modifyReservation_reservationNotFound_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.modifyReservation(student, "Password123!", "FAKE_ID",
                LocalDateTime.of(2026, 4, 10, 10, 0),
                LocalDateTime.of(2026, 4, 10, 12, 0))
        );
    }

    @Test
    void modifyReservation_wrongUser_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ020", "Microscope", "Lab A");
        User anotherStudent = system.registerUser("student", "other@yorku.ca", "Password123!", "STU005");

        Reservation r = system.createReservation(student, "Password123!", "EQ020",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        assertThrows(IllegalArgumentException.class, () ->
            system.modifyReservation(anotherStudent, "Password123!", r.getReservationId().toString(),
                LocalDateTime.of(2026, 4, 11, 10, 0),
                LocalDateTime.of(2026, 4, 11, 12, 0))
        );
    }

    @Test
    void modifyReservation_inactiveUser_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ021", "Oscilloscope", "Lab B");

        Reservation r = system.createReservation(student, "Password123!", "EQ021",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        student.setActive(false);

        assertThrows(IllegalArgumentException.class, () ->
            system.modifyReservation(student, "Password123!", r.getReservationId().toString(),
                LocalDateTime.of(2026, 4, 11, 10, 0),
                LocalDateTime.of(2026, 4, 11, 12, 0))
        );
    }

    @Test
    void modifyReservation_newTimeOverlapsExisting_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ022", "3D Printer", "Lab C");

        Reservation r1 = system.createReservation(student, "Password123!", "EQ022",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        Reservation r2 = system.createReservation(student, "Password123!", "EQ022",
            LocalDateTime.of(2026, 4, 10, 13, 0),
            LocalDateTime.of(2026, 4, 10, 15, 0));

        // remember this
        assertThrows(IllegalArgumentException.class, () ->
            system.modifyReservation(student, "Password123!", r2.getReservationId().toString(),
                LocalDateTime.of(2026, 4, 10, 11, 0),
                LocalDateTime.of(2026, 4, 10, 13, 0))
        );
    }

    @Test
    void modifyReservation_valid_updatesTime() {
        system.addEquipment(labManager, "Password123!", "EQ023", "Laser Cutter", "Lab D");

        Reservation r = system.createReservation(student, "Password123!", "EQ023",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        system.modifyReservation(student, "Password123!", r.getReservationId().toString(),
            LocalDateTime.of(2026, 4, 11, 9, 0),
            LocalDateTime.of(2026, 4, 11, 11, 0));

        assertEquals(LocalDateTime.of(2026, 4, 11, 9, 0), r.getStartTime());
        assertEquals(LocalDateTime.of(2026, 4, 11, 11, 0), r.getEndTime());
    }
    @Test
    void cancelReservation_reservationNotFound_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.cancelReservation(student, "Password123!", "FAKE_ID")
        );
    }

    @Test
    void cancelReservation_wrongUser_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ030", "Microscope", "Lab A");
        User anotherStudent = system.registerUser("student", "another2@yorku.ca", "Password123!", "STU006");

        Reservation r = system.createReservation(student, "Password123!", "EQ030",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        assertThrows(IllegalArgumentException.class, () ->
            system.cancelReservation(anotherStudent, "Password123!", r.getReservationId().toString())
        );
    }

    @Test
    void cancelReservation_wrongPassword_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ031", "Oscilloscope", "Lab B");

        Reservation r = system.createReservation(student, "Password123!", "EQ031",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        assertThrows(IllegalArgumentException.class, () ->
            system.cancelReservation(student, "badpassword", r.getReservationId().toString())
        );
    }

    @Test
    void cancelReservation_inactiveUser_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ032", "Centrifuge", "Lab C");

        Reservation r = system.createReservation(student, "Password123!", "EQ032",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        student.setActive(false);

        assertThrows(IllegalArgumentException.class, () ->
            system.cancelReservation(student, "Password123!", r.getReservationId().toString())
        );
    }

    @Test
    void cancelReservation_valid_statusIsCancelled() {
        system.addEquipment(labManager, "Password123!", "EQ033", "Thermal Camera", "Lab D");

        Reservation r = system.createReservation(student, "Password123!", "EQ033",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        system.cancelReservation(student, "Password123!", r.getReservationId().toString());

        assertEquals("Cancelled", r.getStatus());

        // also verify it's updated in the data store
        Reservation saved = CSVDataStore.getInstance().findReservationById(r.getReservationId().toString());
        assertEquals("Cancelled", saved.getStatus());
    }
    @Test
    void extendReservation_reservationNotFound_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.extendReservation(student, "Password123!", "FAKE_ID",
                LocalDateTime.of(2026, 4, 10, 14, 0))
        );
    }

    @Test
    void extendReservation_anotherUserTriesToExtend_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ040", "Microscope", "Lab A");
        User anotherStudent = system.registerUser("student", "another3@yorku.ca", "Password123!", "STU007");

        Reservation r = system.createReservation(student, "Password123!", "EQ040",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        assertThrows(IllegalArgumentException.class, () ->
            system.extendReservation(anotherStudent, "Password123!", r.getReservationId().toString(),
                LocalDateTime.of(2026, 4, 10, 14, 0))
        );
    }

    @Test
    void extendReservation_inactiveUser_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ041", "Oscilloscope", "Lab B");

        Reservation r = system.createReservation(student, "Password123!", "EQ041",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        student.setActive(false);

        assertThrows(IllegalArgumentException.class, () ->
            system.extendReservation(student, "Password123!", r.getReservationId().toString(),
                LocalDateTime.of(2026, 4, 10, 14, 0))
        );
    }

    @Test
    void extendReservation_newEndTimeOverlapsNextBooking_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ042", "3D Printer", "Lab C");
        User user2 = system.registerUser("student", "user2@yorku.ca", "Password123!", "STU008");

        Reservation r1 = system.createReservation(student, "Password123!", "EQ042",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));
        system.createReservation(user2, "Password123!", "EQ042",
            LocalDateTime.of(2026, 4, 10, 12, 30),
            LocalDateTime.of(2026, 4, 10, 14, 30));

        assertThrows(IllegalArgumentException.class, () ->
            system.extendReservation(student, "Password123!", r1.getReservationId().toString(),
                LocalDateTime.of(2026, 4, 10, 13, 0))
        );
    }

    @Test
    void extendReservation_valid_updatesEndTimeAndStatus() {
        system.addEquipment(labManager, "Password123!", "EQ043", "Laser Cutter", "Lab D");

        Reservation r = system.createReservation(student, "Password123!", "EQ043",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        system.extendReservation(student, "Password123!", r.getReservationId().toString(),
            LocalDateTime.of(2026, 4, 10, 14, 0));

        assertEquals(LocalDateTime.of(2026, 4, 10, 14, 0), r.getEndTime());
        assertEquals("Extended", r.getStatus());
    }

    @Test
    void processPayment_reservationNotFound_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.processPayment(student, "Password123!", "FAKE_ID", 100.0, "Credit Card")
        );
    }

    @Test
    void processPayment_wrongUser_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ050", "Microscope", "Lab A");
        User anotherStudent = system.registerUser("student", "another4@yorku.ca", "Password123!", "STU009");

        Reservation r = system.createReservation(student, "Password123!", "EQ050",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        assertThrows(IllegalArgumentException.class, () ->
            system.processPayment(anotherStudent, "Password123!", r.getReservationId().toString(), 100.0, "Credit Card")
        );
    }

    @Test
    void processPayment_inactiveUser_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ051", "Oscilloscope", "Lab B");

        Reservation r = system.createReservation(student, "Password123!", "EQ051",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        student.setActive(false);

        assertThrows(IllegalArgumentException.class, () ->
            system.processPayment(student, "Password123!", r.getReservationId().toString(), 100.0, "Credit Card")
        );
    }

    @Test
    void processPayment_valid_returnsCorrectPaymentDetailsAndSavesToDataStore() {
        system.addEquipment(labManager, "Password123!", "EQ052", "Centrifuge", "Lab C");

        Reservation r = system.createReservation(student, "Password123!", "EQ052",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));

        Payment payment = system.processPayment(student, "Password123!", r.getReservationId().toString(), 100.0, "Credit Card");

        assertNotNull(payment);
        assertEquals(100.0, payment.getAmount(), 0.001);
        assertEquals("Credit Card", payment.getMethod());
        assertEquals(payment, r.getPayment());
        assertTrue(CSVDataStore.getInstance().getPayments().contains(payment));
    }

    @Test
    void updateEquipmentStatus_equipmentNotFound_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.updateEquipmentStatus(labManager, "Password123!", "NONEXISTENT", "available")
        );
    }

    @Test
    void updateEquipmentStatus_studentTriesToUpdate_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ060", "Microscope", "Lab A");
        assertThrows(IllegalArgumentException.class, () ->
            system.updateEquipmentStatus(student, "Password123!", "EQ060", "available")
        );
    }

    @Test
    void updateEquipmentStatus_invalidStatus_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ061", "Oscilloscope", "Lab B");
        assertThrows(IllegalArgumentException.class, () ->
            system.updateEquipmentStatus(labManager, "Password123!", "EQ061", "broken")
        );
    }

    @Test
    void updateEquipmentStatus_inactiveLabManager_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ062", "3D Printer", "Lab C");
        labManager.setActive(false);
        assertThrows(IllegalArgumentException.class, () ->
            system.updateEquipmentStatus(labManager, "Password123!", "EQ062", "available")
        );
    }

    @Test
    void updateEquipmentStatus_setToAvailable_works() {
        system.addEquipment(labManager, "Password123!", "EQ063", "Laser Cutter", "Lab D");
        Equipment eq = CSVDataStore.getInstance().findEquipmentById("EQ063");
        eq.disable();

        system.updateEquipmentStatus(labManager, "Password123!", "EQ063", "available");
        assertEquals("Available", eq.getStatus());
    }

    @Test
    void updateEquipmentStatus_setToDisabled_works() {
        system.addEquipment(labManager, "Password123!", "EQ064", "Centrifuge", "Lab E");
        Equipment eq = CSVDataStore.getInstance().findEquipmentById("EQ064");

        system.updateEquipmentStatus(labManager, "Password123!", "EQ064", "disabled");
        assertEquals("Disabled", eq.getStatus());
    }

    @Test
    void updateEquipmentStatus_setToMaintenance_works() {
        system.addEquipment(labManager, "Password123!", "EQ065", "Thermal Camera", "Lab F");
        Equipment eq = CSVDataStore.getInstance().findEquipmentById("EQ065");

        system.updateEquipmentStatus(labManager, "Password123!", "EQ065", "maintenance");
        assertEquals("Maintenance", eq.getStatus());
    }

    @Test
    void updateEquipmentStatus_caseInsensitiveAndTrimmed() {
        system.addEquipment(labManager, "Password123!", "EQ066", "Spectrometer", "Lab G");
        Equipment eq = CSVDataStore.getInstance().findEquipmentById("EQ066");
        eq.disable();

        system.updateEquipmentStatus(labManager, "Password123!", "EQ066", "   AVAILABLE   ");
        assertEquals("Available", eq.getStatus());
    }
    @Test
    void applySensorUpdate_equipmentNotFound_throwsException() {
        SensorUpdate update = new SensorUpdate("temperature", "high");
        assertThrows(IllegalArgumentException.class, () ->
            system.applySensorUpdate(labManager, "Password123!", "NONEXISTENT", update)
        );
    }

    @Test
    void applySensorUpdate_studentTriesToApply_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ070", "Microscope", "Lab A");
        SensorUpdate update = new SensorUpdate("temperature", "high");

        assertThrows(IllegalArgumentException.class, () ->
            system.applySensorUpdate(student, "Password123!", "EQ070", update)
        );
    }

    @Test
    void applySensorUpdate_inactiveLabManager_throwsException() {
        system.addEquipment(labManager, "Password123!", "EQ071", "Oscilloscope", "Lab B");
        SensorUpdate update = new SensorUpdate("temperature", "high");
        labManager.setActive(false);

        assertThrows(IllegalArgumentException.class, () ->
            system.applySensorUpdate(labManager, "Password123!", "EQ071", update)
        );
    }

    @Test
    void applySensorUpdate_maintenanceTrigger_setsStatusToMaintenance() {
        system.addEquipment(labManager, "Password123!", "EQ072", "3D Printer", "Lab C");
        Equipment eq = CSVDataStore.getInstance().findEquipmentById("EQ072");
        SensorUpdate update = new SensorUpdate("maintenance", "high");

        system.applySensorUpdate(labManager, "Password123!", "EQ072", update);
        assertEquals("Maintenance", eq.getStatus());
    }

    @Test
    void autoGenerateLabManager_studentTriesToGenerate_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
            system.autoGenerateLabManager(student, "Password123!", "newlm@yorku.ca")
        );
    }

    @Test
    void autoGenerateLabManager_wrongPassword_throwsException() {
        User coordinator = system.registerUser("HeadLabCoordinator", "hlc@yorku.ca", "Password123!", "HLC001");
        assertThrows(IllegalArgumentException.class, () ->
            system.autoGenerateLabManager(coordinator, "wrongpass", "newlm@yorku.ca")
        );
    }

    @Test
    void autoGenerateLabManager_emailAlreadyExists_throwsException() {
        User coordinator = system.registerUser("HeadLabCoordinator", "hlc2@yorku.ca", "Password123!", "HLC002");
        // student email already registered in setUp
        assertThrows(IllegalArgumentException.class, () ->
            system.autoGenerateLabManager(coordinator, "Password123!", "student@yorku.ca")
        );
    }

    @Test
    void autoGenerateLabManager_inactiveCoordinator_throwsException() {
        User coordinator = system.registerUser("HeadLabCoordinator", "hlc3@yorku.ca", "Password123!", "HLC003");
        coordinator.setActive(false);

        assertThrows(IllegalArgumentException.class, () ->
            system.autoGenerateLabManager(coordinator, "Password123!", "newlm@yorku.ca")
        );
    }

    @Test
    void autoGenerateLabManager_valid_createsLabManagerWithCorrectRoleAndEmail() {
        User coordinator = system.registerUser("HeadLabCoordinator", "hlc4@yorku.ca", "Password123!", "HLC004");

        system.autoGenerateLabManager(coordinator, "Password123!", "newlm@yorku.ca");

        User savedUser = CSVDataStore.getInstance().findUserByEmail("newlm@yorku.ca");
        assertNotNull(savedUser);
        assertEquals("LabManager", savedUser.getRole());
        assertEquals("newlm@yorku.ca", savedUser.getEmail());
    }

   

    @Test
    void getAllUsers_returnsCorrectCount() {
        assertEquals(2, system.getAllUsers().size());
        assertTrue(system.getAllUsers().contains(student));
    }

    @Test
    void getAllEquipment_returnsCorrectCount() {
        system.addEquipment(labManager, "Password123!", "EQ080", "Microscope", "Lab A");
        system.addEquipment(labManager, "Password123!", "EQ081", "Oscilloscope", "Lab B");
        assertEquals(2, system.getAllEquipment().size());
    }

    @Test
    void getAllReservations_returnsCorrectCount() {
        system.addEquipment(labManager, "Password123!", "EQ082", "3D Printer", "Lab C");
        system.createReservation(student, "Password123!", "EQ082",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));
        assertEquals(1, system.getAllReservations().size());
    }

    @Test
    void getAllPayments_returnsCorrectCountAndContainsPayment() {
        system.addEquipment(labManager, "Password123!", "EQ083", "Laser Cutter", "Lab D");
        Reservation r = system.createReservation(student, "Password123!", "EQ083",
            LocalDateTime.of(2026, 4, 10, 10, 0),
            LocalDateTime.of(2026, 4, 10, 12, 0));
        Payment p = system.processPayment(student, "Password123!", r.getReservationId().toString(), 100.0, "Debit Card");

        assertEquals(1, system.getAllPayments().size());
        assertTrue(system.getAllPayments().contains(p));
    }
}
package manual;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Equipment;
import model.LabManager;

import static org.junit.jupiter.api.Assertions.*;


public class LabManagerTest {

    private LabManager manager;
    private Equipment equipment;

    @BeforeEach
    void setUp() {
        manager = new LabManager("lm@y.ca", "p", "LM1");
        equipment = new Equipment("EQ-LM", "Microscope", "Lab 1");
    }

    @Test
    void getRole_returnsLabManager() {
        assertEquals("LabManager", manager.getRole());
    }

    @Test
    void getHourlyRate_isZero() {
        assertEquals(0.0, manager.getHourlyRate(), 0.0001);
    }

    @Test
    void emptyIdOrCert_deactivatesUser() {
        LabManager m = new LabManager("x@y.ca", "p", "");
        assertEquals("INACTIVE", m.getStatus());
    }

    @Test
    void addEquipment_doesNotThrow() {
        assertDoesNotThrow(() -> manager.addEquipment(equipment));
    }

    @Test
    void setEquipmentStatus_updatesEquipmentStatusField() {
        manager.setEquipmentStatus(equipment, "Maintenance");
        assertEquals("Maintenance", equipment.getStatus());
    }

    @Test
    void markMaintenance_setsMaintenanceOnEquipment() {
        manager.markMaintenance(equipment);
        assertEquals("Maintenance", equipment.getStatus());
    }

    @Test
    void toString_containsLabManagerRole() {
        assertTrue(manager.toString().contains("LabManager"));
    }

    @Test
    void getEmail_roundTrip() {
        assertEquals("lm@y.ca", manager.getEmail());
    }

    @Test
    void getUserId_notNull() {
        assertNotNull(manager.getUserId());
    }

    @Test
    void setActive_togglesStatusString() {
        manager.setActive(false);
        assertEquals("INACTIVE", manager.getStatus());
        manager.setActive(true);
        assertEquals("ACTIVE", manager.getStatus());
    }
}

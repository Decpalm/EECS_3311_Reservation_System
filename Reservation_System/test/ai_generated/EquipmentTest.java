package ai_generated;

import factory.EquipmentFactory;
import model.Equipment;
import model.SensorUpdate;
import observer.EquipmentObserver;
import state.AvailableState;
import state.DisabledState;
import state.MaintenanceState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * AI-assisted JUnit 5 test cases for the Equipment model class.
 * Covers: constructor, state transitions (enable/disable/markMaintenance),
 * setState, applySensorUpdate, Observer pattern, and toString.
 * isAvailable() and isModifyAvailable() are omitted here because they
 * internally call CSVDataStore.getInstance() which reads from CSV files
 * (integration-level) — they belong in an integration test.
 */
public class EquipmentTest {

    private Equipment equipment;

    /** Simple spy observer to count how many times it was called. */
    static class CountingObserver implements EquipmentObserver {
        int callCount = 0;
        Equipment lastSeen = null;
        @Override
        public void update(Equipment eq) { callCount++; lastSeen = eq; }
    }

    @BeforeEach
    void setUp() {
        equipment = EquipmentFactory.createEquipment("EQ001", "Oscilloscope", "Lab A");
    }

    // ─── Constructor / Initial State ─────────────────────────────────────────

    @Test
    void constructor_equipmentIdIsSet() {
        assertEquals("EQ001", equipment.getEquipmentId());
    }

    @Test
    void constructor_descriptionIsSet() {
        assertEquals("Oscilloscope", equipment.getDescription());
    }

    @Test
    void constructor_labLocationIsSet() {
        assertEquals("Lab A", equipment.getLabLocation());
    }

    @Test
    void constructor_initialStatusIsAvailable() {
        assertEquals("Available", equipment.getStatus());
    }

    @Test
    void constructor_currentStateIsAvailableState() {
        assertInstanceOf(AvailableState.class, equipment.getCurrentState());
    }

    // ─── Setters ─────────────────────────────────────────────────────────────

    @Test
    void setDescription_updatesDescription() {
        equipment.setDescription("New Oscilloscope");
        assertEquals("New Oscilloscope", equipment.getDescription());
    }

    @Test
    void setLabLocation_updatesLabLocation() {
        equipment.setLabLocation("Lab Z");
        assertEquals("Lab Z", equipment.getLabLocation());
    }

    @Test
    void setStatus_updatesStatusString() {
        equipment.setStatus("Maintenance");
        assertEquals("Maintenance", equipment.getStatus());
    }

    // ─── State transitions ────────────────────────────────────────────────────

    @Test
    void disable_fromAvailable_statusBecomesDisabled() {
        equipment.disable();
        assertEquals("Disabled", equipment.getStatus());
    }

    @Test
    void disable_fromAvailable_stateIsDisabledState() {
        equipment.disable();
        assertInstanceOf(DisabledState.class, equipment.getCurrentState());
    }

    @Test
    void enable_afterDisable_statusBecomesAvailable() {
        equipment.disable();
        equipment.enable();
        assertEquals("Available", equipment.getStatus());
    }

    @Test
    void enable_afterDisable_stateIsAvailableState() {
        equipment.disable();
        equipment.enable();
        assertInstanceOf(AvailableState.class, equipment.getCurrentState());
    }

    @Test
    void markMaintenance_fromAvailable_statusBecomesMaintenance() {
        equipment.markMaintenance();
        assertEquals("Maintenance", equipment.getStatus());
    }

    @Test
    void markMaintenance_fromAvailable_stateIsMaintenanceState() {
        equipment.markMaintenance();
        assertInstanceOf(MaintenanceState.class, equipment.getCurrentState());
    }

    @Test
    void setState_setsCustomState() {
        equipment.setState(new MaintenanceState());
        assertInstanceOf(MaintenanceState.class, equipment.getCurrentState());
        assertEquals("Maintenance", equipment.getStatus());
    }

    // ─── applySensorUpdate ────────────────────────────────────────────────────

    @Test
    void applySensorUpdate_available_setsAvailableState() {
        equipment.disable();
        equipment.applySensorUpdate(new SensorUpdate("AVAILABLE",   "Sensor back online"));
        assertInstanceOf(AvailableState.class, equipment.getCurrentState());
    }

    @Test
    void applySensorUpdate_disabled_setsDisabledState() {
    	equipment.applySensorUpdate(new SensorUpdate("DISABLED",    "Sensor powered off"));
        assertInstanceOf(DisabledState.class, equipment.getCurrentState());
    }

    @Test
    void applySensorUpdate_maintenance_setsMaintenanceState() {
    	equipment.applySensorUpdate(new SensorUpdate("MAINTENANCE", "Scheduled maintenance"));
        assertInstanceOf(MaintenanceState.class, equipment.getCurrentState());
    }

    @Test
    void applySensorUpdate_unknownStatus_doesNotThrow() {
        // unknown status logs to console but must not crash
    	equipment.applySensorUpdate(new SensorUpdate("UNKNOWN_XYZ", "Unknown status received"));
    }

    @Test
    void applySensorUpdate_caseInsensitive_available() {
        equipment.disable();
        equipment.applySensorUpdate(new SensorUpdate("available",   "lowercase test"));
        assertInstanceOf(AvailableState.class, equipment.getCurrentState());
    }

    // ─── Observer pattern ─────────────────────────────────────────────────────

    @Test
    void attach_observer_isNotifiedOnStateChange() {
        CountingObserver obs = new CountingObserver();
        equipment.attach(obs);
        equipment.disable();
        assertEquals(2, obs.callCount); // disable() triggers notifyObservers() twice
    }

    @Test
    void attach_observer_receivesCorrectEquipmentReference() {
        CountingObserver obs = new CountingObserver();
        equipment.attach(obs);
        equipment.disable();
        assertEquals(2, obs.callCount); // confirm both notifications fired
        assertSame(equipment, obs.lastSeen);
    }

    @Test
    void detach_observer_isNoLongerNotified() {
        CountingObserver obs = new CountingObserver();
        equipment.attach(obs);
        equipment.detach(obs);
        equipment.disable();
        assertEquals(0, obs.callCount);
    }

    @Test
    void multipleObservers_allNotified() {
        CountingObserver obs1 = new CountingObserver();
        CountingObserver obs2 = new CountingObserver();
        equipment.attach(obs1);
        equipment.attach(obs2);
        equipment.disable();
        assertEquals(2, obs1.callCount); // two notifications per state change
        assertEquals(2, obs2.callCount);
    }

    @Test
    void notifyObservers_noObservers_doesNotThrow() {
        assertDoesNotThrow(() -> equipment.notifyObservers());
    }

    // ─── toString ─────────────────────────────────────────────────────────────

    @Test
    void toString_containsEquipmentId() {
        assertTrue(equipment.toString().contains("EQ001"));
    }

    @Test
    void toString_containsDescription() {
        assertTrue(equipment.toString().contains("Oscilloscope"));
    }

    @Test
    void toString_containsLabLocation() {
        assertTrue(equipment.toString().contains("Lab A"));
    }

    @Test
    void toString_containsStatus() {
        assertTrue(equipment.toString().contains("Available"));
    }
}

package manual;

import factory.AccountFactory;
import factory.EquipmentFactory;
import model.Equipment;
import model.Reservation;
import model.SensorUpdate;
import model.User;
import observer.EquipmentObserver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistence.CSVDataStore;
import strategy.StudentPricingStrategy;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentTest {

    private Equipment equipment;

    static class CountingObserver implements EquipmentObserver {
        int calls;
        Equipment last;

        @Override
        public void update(Equipment e) {
            calls++;
            last = e;
        }
    }

    @BeforeEach
    void setUp() {
        equipment = EquipmentFactory.createEquipment("EQ-T", "Test device", "Lab X");
    }

    @Test
    void constructor_setsIdDescriptionLocation() {
        assertEquals("EQ-T", equipment.getEquipmentId());
        assertEquals("Test device", equipment.getDescription());
        assertEquals("Lab X", equipment.getLabLocation());
    }

    @Test
    void initialStatus_isAvailable() {
        assertEquals("Available", equipment.getStatus());
    }

    @Test
    void setDescription_updates() {
        equipment.setDescription("New");
        assertEquals("New", equipment.getDescription());
    }

    @Test
    void setLabLocation_updates() {
        equipment.setLabLocation("Lab Z");
        assertEquals("Lab Z", equipment.getLabLocation());
    }

    @Test
    void disable_transitionsToDisabled() {
        equipment.disable();
        assertEquals("Disabled", equipment.getStatus());
    }

    @Test
    void enable_afterDisable_restoresAvailable() {
        equipment.disable();
        equipment.enable();
        assertEquals("Available", equipment.getStatus());
    }

    @Test
    void markMaintenance_setsMaintenanceStatus() {
        equipment.markMaintenance();
        assertEquals("Maintenance", equipment.getStatus());
    }

    @Test
    void attach_notifiesOnStateChange() {
        CountingObserver o = new CountingObserver();
        equipment.attach(o);
        equipment.disable();
        assertTrue(o.calls >= 1);
        assertSame(equipment, o.last);
    }

    @Test
    void detach_stopsNotifications() {
        CountingObserver o = new CountingObserver();
        equipment.attach(o);
        equipment.detach(o);
        o.calls = 0;
        equipment.disable();
        assertEquals(0, o.calls);
    }

    @Test
    void applySensorUpdate_available_upperCase() {
        equipment.disable();
        equipment.applySensorUpdate(new SensorUpdate("AVAILABLE", "ok"));
        assertEquals("Available", equipment.getStatus());
    }

    @Test
    void isAvailable_noConflicts_trueWhenAvailableState() {
        CSVDataStore data = CSVDataStore.getInstance();
        int n = data.getReservations().size();
        User u = AccountFactory.createUser("student", "avail1@y.ca", "p", "S1");
        data.saveUser(u);
        LocalDateTime start = LocalDateTime.of(2030, 1, 1, 9, 0);
        LocalDateTime end = LocalDateTime.of(2030, 1, 1, 10, 0);
        Reservation r = new Reservation(u, equipment, start, end, new StudentPricingStrategy());
        data.saveReservation(r);
        assertTrue(equipment.isAvailable(
                LocalDateTime.of(2030, 1, 2, 9, 0),
                LocalDateTime.of(2030, 1, 2, 10, 0),
                equipment.getEquipmentId()));
        assertEquals(n + 1, data.getReservations().size());
    }

    @Test
    void isModifyAvailable_excludesSameReservation() {
        CSVDataStore data = CSVDataStore.getInstance();
        User u = AccountFactory.createUser("student", "avail2@y.ca", "p", "S2");
        data.saveUser(u);
        Equipment eq = EquipmentFactory.createEquipment("EQ-MOD", "Dev", "L1");
        data.saveEquipment(eq);
        LocalDateTime start = LocalDateTime.of(2031, 6, 1, 8, 0);
        LocalDateTime end = LocalDateTime.of(2031, 6, 1, 12, 0);
        Reservation res = new Reservation(u, eq, start, end, new StudentPricingStrategy());
        data.saveReservation(res);
        assertTrue(eq.isModifyAvailable(start, end, eq.getEquipmentId(), res));
    }

    @Test
    void toString_containsKeyFields() {
        String s = equipment.toString();
        assertTrue(s.contains("EQ-T"));
        assertTrue(s.contains("Test device"));
        assertTrue(s.contains("Lab X"));
    }
}

package ai_generated;

import factory.EquipmentFactory;
import model.Equipment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * AI-assisted JUnit 5 test cases for EquipmentFactory.
 * Tests createEquipment() for valid inputs, invalid/null inputs, and field correctness.
 */
public class EquipmentFactoryTest {

    // ─── Normal / Happy-path tests ──────────────────────────────────────────

    @Test
    void createEquipment_validInputs_returnsEquipmentInstance() {
        Equipment eq = EquipmentFactory.createEquipment("EQ001", "Oscilloscope", "Lab A");
        assertNotNull(eq);
        assertInstanceOf(Equipment.class, eq);
    }

    @Test
    void createEquipment_validInputs_equipmentIdIsSet() {
        Equipment eq = EquipmentFactory.createEquipment("EQ001", "Oscilloscope", "Lab A");
        assertEquals("EQ001", eq.getEquipmentId());
    }

    @Test
    void createEquipment_validInputs_descriptionIsSet() {
        Equipment eq = EquipmentFactory.createEquipment("EQ001", "Oscilloscope", "Lab A");
        assertEquals("Oscilloscope", eq.getDescription());
    }

    @Test
    void createEquipment_validInputs_labLocationIsSet() {
        Equipment eq = EquipmentFactory.createEquipment("EQ001", "Oscilloscope", "Lab A");
        assertEquals("Lab A", eq.getLabLocation());
    }

    @Test
    void createEquipment_validInputs_initialStatusIsAvailable() {
        Equipment eq = EquipmentFactory.createEquipment("EQ002", "Microscope", "Lab B");
        assertEquals("Available", eq.getStatus());
    }

    @Test
    void createEquipment_validInputs_observerListIsInitialised() {
        // ensure no NPE when notifyObservers is called on a fresh object
        Equipment eq = EquipmentFactory.createEquipment("EQ003", "Centrifuge", "Lab C");
        assertDoesNotThrow(eq::notifyObservers);
    }

    // ─── Null / blank equipmentId ────────────────────────────────────────────

    @Test
    void createEquipment_nullEquipmentId_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> EquipmentFactory.createEquipment(null, "Oscilloscope", "Lab A"));
    }

    @Test
    void createEquipment_blankEquipmentId_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> EquipmentFactory.createEquipment("   ", "Oscilloscope", "Lab A"));
    }

    @Test
    void createEquipment_emptyEquipmentId_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> EquipmentFactory.createEquipment("", "Oscilloscope", "Lab A"));
    }

    // ─── Null / blank description ────────────────────────────────────────────

    @Test
    void createEquipment_nullDescription_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> EquipmentFactory.createEquipment("EQ001", null, "Lab A"));
    }

    @Test
    void createEquipment_blankDescription_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> EquipmentFactory.createEquipment("EQ001", "   ", "Lab A"));
    }

    @Test
    void createEquipment_emptyDescription_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> EquipmentFactory.createEquipment("EQ001", "", "Lab A"));
    }

    // ─── Null / blank labLocation ─────────────────────────────────────────────

    @Test
    void createEquipment_nullLabLocation_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> EquipmentFactory.createEquipment("EQ001", "Oscilloscope", null));
    }

    @Test
    void createEquipment_blankLabLocation_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> EquipmentFactory.createEquipment("EQ001", "Oscilloscope", "   "));
    }

    @Test
    void createEquipment_emptyLabLocation_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> EquipmentFactory.createEquipment("EQ001", "Oscilloscope", ""));
    }

    // ─── Multiple distinct instances ─────────────────────────────────────────

    @Test
    void createEquipment_twoCallsWithDifferentIds_returnDistinctObjects() {
        Equipment eq1 = EquipmentFactory.createEquipment("EQ010", "Laser", "Lab D");
        Equipment eq2 = EquipmentFactory.createEquipment("EQ011", "Laser", "Lab D");
        assertNotSame(eq1, eq2);
    }

    @Test
    void createEquipment_longDescriptionAndLocation_createsSuccessfully() {
        String longDesc = "High-precision electron beam scanning tunneling microscope v3";
        String longLoc  = "Building 12, Floor 3, Room 301, Section B";
        Equipment eq = EquipmentFactory.createEquipment("EQ099", longDesc, longLoc);
        assertEquals(longDesc, eq.getDescription());
        assertEquals(longLoc,  eq.getLabLocation());
    }
}

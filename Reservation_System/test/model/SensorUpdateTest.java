package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SensorUpdateTest {

    @Test
    void constructor_setsOperationalStatusAndMessage() {
        SensorUpdate u = new SensorUpdate("AVAILABLE", "All good");
        assertEquals("AVAILABLE", u.getOperationalStatus());
        assertEquals("All good", u.getMessage());
    }

    @Test
    void getUpdateId_notNull() {
        assertNotNull(new SensorUpdate("X", "m").getUpdateId());
    }

    @Test
    void getTimestamp_notNull() {
        assertNotNull(new SensorUpdate("X", "m").getTimestamp());
    }

    @Test
    void setOperationalStatus_updates() {
        SensorUpdate u = new SensorUpdate("A", "m");
        u.setOperationalStatus("B");
        assertEquals("B", u.getOperationalStatus());
    }

    @Test
    void setMessage_updates() {
        SensorUpdate u = new SensorUpdate("A", "old");
        u.setMessage("new");
        assertEquals("new", u.getMessage());
    }

    @Test
    void toString_containsStatusAndMessage() {
        SensorUpdate u = new SensorUpdate("DISABLED", "Power loss");
        String s = u.toString();
        assertTrue(s.contains("DISABLED"));
        assertTrue(s.contains("Power loss"));
    }

    @Test
    void twoUpdates_distinctIds() {
        SensorUpdate a = new SensorUpdate("A", "1");
        SensorUpdate b = new SensorUpdate("B", "2");
        assertNotEquals(a.getUpdateId(), b.getUpdateId());
    }

    @Test
    void emptyMessage_allowed() {
        SensorUpdate u = new SensorUpdate("OK", "");
        assertEquals("", u.getMessage());
    }

    @Test
    void lowercaseStatus_preserved() {
        SensorUpdate u = new SensorUpdate("available", "x");
        assertEquals("available", u.getOperationalStatus());
    }

    @Test
    void longMessage_roundTrip() {
        String msg = "x".repeat(200);
        SensorUpdate u = new SensorUpdate("M", msg);
        assertEquals(msg, u.getMessage());
    }
}

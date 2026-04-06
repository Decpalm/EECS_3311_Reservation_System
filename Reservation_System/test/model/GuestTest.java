package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuestTest {

    @Test
    void getRole_returnsGuest() {
        Guest g = new Guest("g@y.ca", "p", "");
        assertEquals("Guest", g.getRole());
    }

    @Test
    void getHourlyRate_returnsTwentyFive() {
        Guest g = new Guest("g@y.ca", "p", "");
        assertEquals(25.0, g.getHourlyRate(), 0.0001);
    }

    @Test
    void emptyId_doesNotDeactivateGuest() {
        Guest g = new Guest("g@y.ca", "p", "");
        assertEquals("ACTIVE", g.getStatus());
        assertTrue(g.isActive());
    }

    @Test
    void getEmail_roundTrip() {
        Guest g = new Guest("guest@y.ca", "pw", "G1");
        assertEquals("guest@y.ca", g.getEmail());
    }

    @Test
    void getUserId_notNull() {
        assertNotNull(new Guest("e@e.e", "p", "x").getUserId());
    }

    @Test
    void toString_containsGuestRole() {
        Guest g = new Guest("g@g.g", "p", "1");
        assertTrue(g.toString().contains("Guest"));
    }

    @Test
    void setEmail_updates() {
        Guest g = new Guest("a@a.a", "p", "1");
        g.setEmail("b@b.b");
        assertEquals("b@b.b", g.getEmail());
    }

    @Test
    void setActive_false_marksInactive() {
        Guest g = new Guest("g@y.ca", "p", "1");
        g.setActive(false);
        assertEquals("INACTIVE", g.getStatus());
    }

    @Test
    void getIdOrCertNumber_roundTrip() {
        Guest g = new Guest("g@y.ca", "p", "CERT");
        assertEquals("CERT", g.getIdOrCertNumber());
    }

    @Test
    void getPasswordHash_roundTrip() {
        Guest g = new Guest("g@y.ca", "secret", "1");
        assertEquals("secret", g.getPasswordHash());
    }
}

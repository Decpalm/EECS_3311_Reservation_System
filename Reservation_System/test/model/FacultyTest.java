package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FacultyTest {

    @Test
    void getRole_returnsFaculty() {
        Faculty f = new Faculty("f@y.ca", "p", "F1");
        assertEquals("Faculty", f.getRole());
    }

    @Test
    void getHourlyRate_returnsTwenty() {
        Faculty f = new Faculty("f@y.ca", "p", "F1");
        assertEquals(20.0, f.getHourlyRate(), 0.0001);
    }

    @Test
    void emptyIdOrCert_deactivatesUser() {
        Faculty f = new Faculty("f@y.ca", "p", "");
        assertEquals("INACTIVE", f.getStatus());
        assertFalse(f.isActive());
    }

    @Test
    void nonEmptyId_staysActive() {
        Faculty f = new Faculty("f@y.ca", "p", "ID");
        assertEquals("ACTIVE", f.getStatus());
    }

    @Test
    void toString_containsFacultyRole() {
        Faculty f = new Faculty("fac@test.ca", "pw", "F9");
        assertTrue(f.toString().contains("Faculty"));
    }

    @Test
    void setActive_canRestoreAfterEmptyId() {
        Faculty f = new Faculty("f@y.ca", "p", "");
        f.setActive(true);
        assertEquals("ACTIVE", f.getStatus());
    }

    @Test
    void getEmail_roundTrip() {
        Faculty f = new Faculty("a@b.c", "x", "1");
        assertEquals("a@b.c", f.getEmail());
    }

    @Test
    void getUserId_notNull() {
        assertNotNull(new Faculty("e@e.e", "p", "1").getUserId());
    }

    @Test
    void getPasswordHash_roundTrip() {
        Faculty f = new Faculty("f@y.ca", "hash", "1");
        assertEquals("hash", f.getPasswordHash());
    }

    @Test
    void getIdOrCertNumber_roundTrip() {
        Faculty f = new Faculty("f@y.ca", "p", "CERT-1");
        assertEquals("CERT-1", f.getIdOrCertNumber());
    }
}

package manual;

import org.junit.jupiter.api.Test;

import model.Researcher;

import static org.junit.jupiter.api.Assertions.*;


public class ResearcherTest {

    @Test
    void getRole_returnsResearcher() {
        Researcher r = new Researcher("r@y.ca", "p", "R1");
        assertEquals("Researcher", r.getRole());
    }

    @Test
    void getHourlyRate_returnsFifteen() {
        Researcher r = new Researcher("r@y.ca", "p", "R1");
        assertEquals(15.0, r.getHourlyRate(), 0.0001);
    }

    @Test
    void emptyIdOrCert_deactivatesUser() {
        Researcher r = new Researcher("r@y.ca", "p", "");
        assertEquals("INACTIVE", r.getStatus());
        assertFalse(r.isActive());
    }

    @Test
    void nonEmptyId_staysActive() {
        Researcher r = new Researcher("r@y.ca", "p", "RID");
        assertEquals("ACTIVE", r.getStatus());
    }

    @Test
    void toString_containsResearcherRole() {
        Researcher r = new Researcher("res@test.ca", "pw", "R9");
        assertTrue(r.toString().contains("Researcher"));
    }

    @Test
    void setActive_canRestoreAfterEmptyId() {
        Researcher r = new Researcher("r@y.ca", "p", "");
        r.setActive(true);
        assertEquals("ACTIVE", r.getStatus());
    }

    @Test
    void getEmail_roundTrip() {
        Researcher r = new Researcher("a@b.c", "x", "1");
        assertEquals("a@b.c", r.getEmail());
    }

    @Test
    void getUserId_notNull() {
        assertNotNull(new Researcher("e@e.e", "p", "1").getUserId());
    }

    @Test
    void getPasswordHash_roundTrip() {
        Researcher r = new Researcher("r@y.ca", "secret", "1");
        assertEquals("secret", r.getPasswordHash());
    }

    @Test
    void getIdOrCertNumber_roundTrip() {
        Researcher r = new Researcher("r@y.ca", "p", "LAB-7");
        assertEquals("LAB-7", r.getIdOrCertNumber());
    }
}

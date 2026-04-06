package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 tests for {@link Student}.
 *
 * @author sal1818
 */
public class StudentTest {

    @Test
    void getRole_returnsStudent() {
        Student s = new Student("s@y.ca", "p", "1");
        assertEquals("Student", s.getRole());
    }

    @Test
    void getHourlyRate_returnsTen() {
        Student s = new Student("s@y.ca", "p", "1");
        assertEquals(10.0, s.getHourlyRate(), 0.0001);
    }

    @Test
    void emptyIdOrCert_deactivatesUser() {
        Student s = new Student("s@y.ca", "p", "");
        assertEquals("INACTIVE", s.getStatus());
        assertFalse(s.isActive());
    }

    @Test
    void nonEmptyId_staysActive() {
        Student s = new Student("s@y.ca", "p", "ID1");
        assertEquals("ACTIVE", s.getStatus());
        assertTrue(s.isActive());
    }

    @Test
    void toString_includesRoleStudent() {
        Student s = new Student("stu@test.ca", "pw", "S1");
        assertTrue(s.toString().contains("Student"));
    }

    @Test
    void setActive_afterEmptyId_canReactivate() {
        Student s = new Student("s@y.ca", "p", "");
        s.setActive(true);
        assertEquals("ACTIVE", s.getStatus());
    }

    @Test
    void getEmail_roundTrip() {
        Student s = new Student("a@b.c", "x", "1");
        assertEquals("a@b.c", s.getEmail());
    }

    @Test
    void getUserId_notNull() {
        assertNotNull(new Student("e@e.e", "p", "1").getUserId());
    }

    @Test
    void twoStudents_distinctUserIds() {
        Student a = new Student("a@a.a", "p", "1");
        Student b = new Student("b@b.b", "p", "2");
        assertNotEquals(a.getUserId(), b.getUserId());
    }

    @Test
    void getPasswordHash_preserved() {
        Student s = new Student("e@e.e", "hash!", "1");
        assertEquals("hash!", s.getPasswordHash());
    }
}

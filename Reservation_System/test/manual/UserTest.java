package manual;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Student;
import model.User;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


public class UserTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("user@yorku.ca", "Secret1!", "U100");
    }

    @Test
    void constructor_assignsNonNullUserId() {
        assertNotNull(student.getUserId());
    }

    @Test
    void constructor_defaultStatusIsActive() {
        assertEquals("ACTIVE", student.getStatus());
    }

    @Test
    void constructor_isActiveTrueWhenIdPresent() {
        assertTrue(student.isActive());
    }

    @Test
    void getEmail_returnsConstructorEmail() {
        assertEquals("user@yorku.ca", student.getEmail());
    }

    @Test
    void getPasswordHash_returnsConstructorHash() {
        assertEquals("Secret1!", student.getPasswordHash());
    }

    @Test
    void getIdOrCertNumber_returnsConstructorValue() {
        assertEquals("U100", student.getIdOrCertNumber());
    }

    @Test
    void setEmail_updatesStoredEmail() {
        student.setEmail("new@yorku.ca");
        assertEquals("new@yorku.ca", student.getEmail());
    }

    @Test
    void setPasswordHash_updatesStoredHash() {
        student.setPasswordHash("X");
        assertEquals("X", student.getPasswordHash());
    }

    @Test
    void setIdOrCertNumber_updatesStoredId() {
        student.setIdOrCertNumber("Z9");
        assertEquals("Z9", student.getIdOrCertNumber());
    }

    @Test
    void setUserId_updatesStoredUuid() {
        UUID id = UUID.randomUUID();
        student.setUserId(id);
        assertEquals(id, student.getUserId());
    }

    @Test
    void setActive_false_setsStatusInactive() {
        student.setActive(false);
        assertEquals("INACTIVE", student.getStatus());
        assertFalse(student.isActive());
    }

    @Test
    void setActive_true_restoresActiveStatus() {
        student.setActive(false);
        student.setActive(true);
        assertEquals("ACTIVE", student.getStatus());
        assertTrue(student.isActive());
    }

    @Test
    void toString_containsEmailStatusRoleAndId() {
        String s = student.toString();
        assertTrue(s.contains("user@yorku.ca"));
        assertTrue(s.contains("ACTIVE"));
        assertTrue(s.contains("Student"));
        assertTrue(s.contains("U100"));
    }
}

package ai_generated;

import factory.AccountFactory;
import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

/**
 * AI-assisted JUnit 5 test cases for the User abstract class.
 * Tested through its concrete subclasses (Student, Faculty, Researcher, Guest)
 * so that no mocking framework is required.
 */
public class UserTest {

    private Student student;
    private Faculty faculty;
    private Researcher researcher;
    private Guest guest;

    @BeforeEach
    void setUp() {
        student    = (Student)    AccountFactory.createUser("student",    "stu@yorku.ca",  "Pass1!abc", "STU123");
        faculty    = (Faculty)    AccountFactory.createUser("faculty",    "fac@yorku.ca",  "Pass1!abc", "FAC456");
        researcher = (Researcher) AccountFactory.createUser("researcher", "res@yorku.ca",  "Pass1!abc", "RES789");
        guest      = (Guest)      AccountFactory.createUser("guest",      "gst@yorku.ca",  "Pass1!abc", "");
    }

    // ─── Constructor / Initial State ─────────────────────────────────────────

    @Test
    void user_newStudent_hasNonNullUserId() {
        assertNotNull(student.getUserId());
    }

    @Test
    void user_newStudent_statusIsActive() {
        assertEquals("ACTIVE", student.getStatus());
    }

    @Test
    void user_newStudent_isActiveIsTrue() {
        assertTrue(student.isActive());
    }

    @Test
    void user_newStudent_emailIsCorrect() {
        assertEquals("stu@yorku.ca", student.getEmail());
    }

    @Test
    void user_newStudent_passwordHashIsCorrect() {
        assertEquals("Pass1!abc", student.getPasswordHash());
    }

    @Test
    void user_newStudent_idOrCertNumberIsCorrect() {
        assertEquals("STU123", student.getIdOrCertNumber());
    }

    // ─── setActive transitions ────────────────────────────────────────────────

    @Test
    void setActive_falseOnStudent_setsStatusInactive() {
        student.setActive(false);
        assertEquals("INACTIVE", student.getStatus());
    }

    @Test
    void setActive_falseOnStudent_isActiveFalse() {
        student.setActive(false);
        assertFalse(student.isActive());
    }

    @Test
    void setActive_trueAfterDeactivation_restoresActiveStatus() {
        student.setActive(false);
        student.setActive(true);
        assertEquals("ACTIVE", student.getStatus());
        assertTrue(student.isActive());
    }

    // ─── Setters ─────────────────────────────────────────────────────────────

    @Test
    void setEmail_updatesEmail() {
        student.setEmail("new@yorku.ca");
        assertEquals("new@yorku.ca", student.getEmail());
    }

    @Test
    void setPasswordHash_updatesPasswordHash() {
        student.setPasswordHash("NewPass1!");
        assertEquals("NewPass1!", student.getPasswordHash());
    }

    @Test
    void setIdOrCertNumber_updatesIdOrCertNumber() {
        student.setIdOrCertNumber("NEW999");
        assertEquals("NEW999", student.getIdOrCertNumber());
    }

    @Test
    void setUserId_updatesUserId() {
        UUID newId = UUID.randomUUID();
        student.setUserId(newId);
        assertEquals(newId, student.getUserId());
    }

    // ─── Role / HourlyRate (abstract methods via subclasses) ─────────────────

    @Test
    void getRole_student_returnsStudent() {
        assertEquals("Student", student.getRole());
    }

    @Test
    void getRole_faculty_returnsFaculty() {
        assertEquals("Faculty", faculty.getRole());
    }

    @Test
    void getRole_researcher_returnsResearcher() {
        assertEquals("Researcher", researcher.getRole());
    }

    @Test
    void getRole_guest_returnsGuest() {
        assertEquals("Guest", guest.getRole());
    }

    @Test
    void getHourlyRate_student_isPositive() {
        assertTrue(student.getHourlyRate() > 0);
    }

    @Test
    void getHourlyRate_faculty_isPositive() {
        assertTrue(faculty.getHourlyRate() > 0);
    }

    @Test
    void getHourlyRate_researcher_isPositive() {
        assertTrue(researcher.getHourlyRate() > 0);
    }

    @Test
    void getHourlyRate_guest_isPositive() {
        assertTrue(guest.getHourlyRate() > 0);
    }

    // ─── toString ─────────────────────────────────────────────────────────────

    @Test
    void toString_containsEmail() {
        assertTrue(student.toString().contains("stu@yorku.ca"));
    }

    @Test
    void toString_containsRole() {
        assertTrue(student.toString().contains("Student"));
    }

    @Test
    void toString_containsStatus() {
        assertTrue(student.toString().contains("ACTIVE"));
    }
}

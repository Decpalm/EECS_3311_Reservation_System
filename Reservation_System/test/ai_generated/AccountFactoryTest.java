package ai_generated;

import factory.AccountFactory;
import model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * AI-assisted JUnit 5 test cases for AccountFactory.
 * Tests factory method createUser() for all roles, edge cases, and invalid inputs.
 */
public class AccountFactoryTest {

    // ─── Normal / Happy-path tests ──────────────────────────────────────────

    @Test
    void createUser_studentRole_returnsStudentInstance() {
        User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
        assertNotNull(user);
        assertInstanceOf(Student.class, user);
    }

    @Test
    void createUser_facultyRole_returnsFacultyInstance() {
        User user = AccountFactory.createUser("faculty", "fac@yorku.ca", "Pass1!abc", "FAC456");
        assertNotNull(user);
        assertInstanceOf(Faculty.class, user);
    }

    @Test
    void createUser_researcherRole_returnsResearcherInstance() {
        User user = AccountFactory.createUser("researcher", "res@yorku.ca", "Pass1!abc", "RES789");
        assertNotNull(user);
        assertInstanceOf(Researcher.class, user);
    }

    @Test
    void createUser_guestRole_returnsGuestInstance() {
        User user = AccountFactory.createUser("guest", "guest@yorku.ca", "Pass1!abc", "");
        assertNotNull(user);
        assertInstanceOf(Guest.class, user);
    }

    @Test
    void createUser_headLabCoordinatorRole_returnsHeadLabCoordinatorInstance() {
        User user = AccountFactory.createUser("Head Lab Coordinator", "hlc@yorku.ca", "Pass1!abc", "HLC001");
        assertNotNull(user);
        assertInstanceOf(HeadLabCoordinator.class, user);
    }

    @Test
    void createUser_labManagerRole_returnsLabManagerInstance() {
        User user = AccountFactory.createUser("LabManager", "lm@yorku.ca", "Pass1!abc", "LM001");
        assertNotNull(user);
        assertInstanceOf(LabManager.class, user);
    }

    // ─── Email and fields are correctly set ─────────────────────────────────

    @Test
    void createUser_student_emailIsSetCorrectly() {
        User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
        assertEquals("stu@yorku.ca", user.getEmail());
    }

    @Test
    void createUser_student_passwordHashIsSetCorrectly() {
        User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
        assertEquals("Pass1!abc", user.getPasswordHash());
    }

    @Test
    void createUser_student_idOrCertNumberIsSetCorrectly() {
        User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
        assertEquals("STU123", user.getIdOrCertNumber());
    }

    @Test
    void createUser_student_initialStatusIsActive() {
        User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
        assertEquals("ACTIVE", user.getStatus());
    }

    @Test
    void createUser_student_userIdIsNotNull() {
        User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
        assertNotNull(user.getUserId());
    }

    // ─── Role string normalisation (whitespace / case) ───────────────────────

    @Test
    void createUser_roleWithUpperCase_isAccepted() {
        User user = AccountFactory.createUser("STUDENT", "s@yorku.ca", "Pass1!abc", "S1");
        assertInstanceOf(Student.class, user);
    }

    @Test
    void createUser_roleWithMixedCase_isAccepted() {
        User user = AccountFactory.createUser("FaCuLtY", "f@yorku.ca", "Pass1!abc", "F1");
        assertInstanceOf(Faculty.class, user);
    }

    @Test
    void createUser_roleWithInternalSpaces_isAccepted() {
        User user = AccountFactory.createUser("Head Lab Coordinator", "h@yorku.ca", "Pass1!abc", "H1");
        assertInstanceOf(HeadLabCoordinator.class, user);
    }

    // ─── Invalid / edge-case inputs ──────────────────────────────────────────

    @Test
    void createUser_nullRole_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> AccountFactory.createUser(null, "x@y.ca", "Pass1!abc", "X1"));
    }

    @Test
    void createUser_unknownRole_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> AccountFactory.createUser("admin", "x@y.ca", "Pass1!abc", "X1"));
    }

    @Test
    void createUser_emptyRole_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> AccountFactory.createUser("", "x@y.ca", "Pass1!abc", "X1"));
    }

    // ─── Role method is correct ──────────────────────────────────────────────

    @Test
    void createUser_student_getRoleReturnsStudent() {
        User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "S1");
        assertEquals("Student", user.getRole());
    }

    @Test
    void createUser_faculty_getRoleReturnsFaculty() {
        User user = AccountFactory.createUser("faculty", "fac@yorku.ca", "Pass1!abc", "F1");
        assertEquals("Faculty", user.getRole());
    }

    @Test
    void createUser_researcher_getRoleReturnsResearcher() {
        User user = AccountFactory.createUser("researcher", "res@yorku.ca", "Pass1!abc", "R1");
        assertEquals("Researcher", user.getRole());
    }

    @Test
    void createUser_guest_getRoleReturnsGuest() {
        User user = AccountFactory.createUser("guest", "g@yorku.ca", "Pass1!abc", "");
        assertEquals("Guest", user.getRole());
    }
}

package manual;

import org.junit.jupiter.api.Test;

import model.HeadLabCoordinator;
import model.LabManager;

import static org.junit.jupiter.api.Assertions.*;

public class HeadLabCoordinatorTest {

    @Test
    void getRole_returnsHeadLabCoordinator() {
        HeadLabCoordinator h = new HeadLabCoordinator("h@y.ca", "p", "H1");
        assertEquals("HeadLabCoordinator", h.getRole());
    }

    @Test
    void getHourlyRate_isZero() {
        HeadLabCoordinator h = new HeadLabCoordinator("h@y.ca", "p", "H1");
        assertEquals(0.0, h.getHourlyRate(), 0.0001);
    }

    @Test
    void autoGenerateManagerAccount_returnsLabManagerWithSameEmail() {
        HeadLabCoordinator h = new HeadLabCoordinator("h@y.ca", "p", "H1");
        LabManager lm = h.autoGenerateManagerAccount("newmgr@y.ca");
        assertEquals("newmgr@y.ca", lm.getEmail());
    }

    @Test
    void autoGenerateManagerAccount_setsDefaultPassword() {
        HeadLabCoordinator h = new HeadLabCoordinator("h@y.ca", "p", "H1");
        LabManager lm = h.autoGenerateManagerAccount("m@y.ca");
        assertEquals("Temp123!", lm.getPasswordHash());
    }

    @Test
    void autoGenerateManagerAccount_setsDefaultCert() {
        HeadLabCoordinator h = new HeadLabCoordinator("h@y.ca", "p", "H1");
        LabManager lm = h.autoGenerateManagerAccount("m2@y.ca");
        assertEquals("LM-CERT", lm.getIdOrCertNumber());
    }

    @Test
    void autoGenerateManagerAccount_managerIsActive() {
        HeadLabCoordinator h = new HeadLabCoordinator("h@y.ca", "p", "H1");
        LabManager lm = h.autoGenerateManagerAccount("m3@y.ca");
        assertTrue(lm.isActive());
        assertEquals("ACTIVE", lm.getStatus());
    }

    @Test
    void emptyIdOrCert_deactivatesCoordinator() {
        HeadLabCoordinator h = new HeadLabCoordinator("h@y.ca", "p", "");
        assertEquals("INACTIVE", h.getStatus());
    }

    @Test
    void toString_containsRole() {
        HeadLabCoordinator h = new HeadLabCoordinator("coord@test.ca", "pw", "C1");
        assertTrue(h.toString().contains("HeadLabCoordinator"));
    }

    @Test
    void getUserId_notNull() {
        assertNotNull(new HeadLabCoordinator("e@e.e", "p", "1").getUserId());
    }

    @Test
    void generatedManager_hasLabManagerRole() {
        HeadLabCoordinator h = new HeadLabCoordinator("h@y.ca", "p", "H1");
        LabManager lm = h.autoGenerateManagerAccount("mgr@y.ca");
        assertEquals("LabManager", lm.getRole());
    }
}

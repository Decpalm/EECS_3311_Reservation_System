package manual;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Equipment;
import observer.NotificationService;

public class NotificationServiceTest {

    private NotificationService notificationService;
    private Equipment equipment;

    @BeforeEach
    void setUp() {
        notificationService = new NotificationService();
        equipment = new Equipment("EQ700", "Microscope", "Lab A");
    }

    @Test
    void update_maintenanceStatus_printsMaintenanceAlert() {
        equipment.setStatus("Maintenance");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        notificationService.update(equipment);

        System.setOut(originalOut);

        String result = output.toString();
        assertTrue(result.contains("NotificationService received update: Equipment EQ700 is now Maintenance"));
        assertTrue(result.contains("ALERT: Equipment EQ700 requires maintenance at Lab A"));
    }

    @Test
    void update_nonMaintenanceStatus_printsStatusAlert() {
        equipment.setStatus("Available");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        notificationService.update(equipment);

        System.setOut(originalOut);

        String result = output.toString();
        assertTrue(result.contains("NotificationService received update: Equipment EQ700 is now Available"));
        assertTrue(result.contains("STATUS ALERT: Equipment EQ700 status changed to Available"));
    }

    @Test
    void sendStatusAlert_validEquipment_printsStatusMessage() {
        equipment.setStatus("Disabled");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        notificationService.sendStatusAlert(equipment);

        System.setOut(originalOut);

        String result = output.toString();
        assertTrue(result.contains("STATUS ALERT: Equipment EQ700 status changed to Disabled"));
    }
}
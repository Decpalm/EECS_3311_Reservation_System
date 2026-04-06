package manual;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Equipment;
import observer.LabManagerDashboard;

public class LabManagerDashboardTest {

    private LabManagerDashboard dashboard;
    private Equipment equipment;

    @BeforeEach
    void setUp() {
        dashboard = new LabManagerDashboard();
        equipment = new Equipment("EQ800", "Microscope", "Lab A");
        equipment.setStatus("Available");
    }

    @Test
    void update_validEquipment_printsCorrectMessage() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        dashboard.update(equipment);

        System.setOut(originalOut);

        String result = output.toString();
        assertTrue(result.contains("LabManagerDashboard updated: Equipment EQ800 is now Available"));
    }
}
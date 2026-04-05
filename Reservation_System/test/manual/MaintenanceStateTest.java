package manual;

import model.Equipment;
import state.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MaintenanceStateTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
	
	@Test
	public void MaintenanceStateTest1() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new MaintenanceState();
			state.enable(equipment);
			
			assertEquals(equipment.getStatus(), "Available");	
			
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void MaintenanceStateTest2() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new MaintenanceState();
			state.disable(equipment);
			
			assertEquals(equipment.getStatus(), "Disabled");		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void MaintenanceStateTest3() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new MaintenanceState();
			state.markMaintenance(equipment);
			
			assertTrue(outContent.toString().contains("Equipment is already under maintenance."));

		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void MaintenanceStateTest4() {
		try {
			EquipmentState state = new MaintenanceState();
			
			assertEquals(state.getStateName(), "Maintenance");		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void MaintenanceStateTest5() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new MaintenanceState();
			equipment.disable();
			state.disable(equipment);
			
			assertTrue(equipment.getCurrentState() instanceof DisabledState);		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void MaintenanceStateTest6() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new MaintenanceState();
			equipment.markMaintenance();
			state.markMaintenance(equipment);
			
			assertTrue(equipment.getCurrentState() instanceof MaintenanceState);		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void MaintenanceStateTest7() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new MaintenanceState();
			state.enable(equipment);
			
			assertTrue(equipment.getCurrentState() instanceof AvailableState);		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void MaintenanceStateTest8() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new MaintenanceState();
			state.enable(equipment);
			
			assertTrue(outContent.toString().equals(""));
			
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void MaintenanceStateTest9() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new MaintenanceState();
			state.disable(equipment);
			
			assertTrue(outContent.toString().equals(""));
			
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void MaintenanceStateTest10() {
		try {
			EquipmentState state = new MaintenanceState();
			state.getStateName();
			
			assertTrue(outContent.toString().equals(""));
			
		} catch(Exception e) {
			fail();
		}

	}

}

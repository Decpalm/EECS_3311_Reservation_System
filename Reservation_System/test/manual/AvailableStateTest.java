package manual;

import model.Equipment;
import state.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AvailableStateTest {
	
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
	public void AvailableStateTest1() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new AvailableState();
			state.enable(equipment);
			
			assertTrue(outContent.toString().contains("Equipment is already available."));
			
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AvailableStateTest2() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new AvailableState();
			state.disable(equipment);
			
			assertEquals(equipment.getStatus(), "Disabled");		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AvailableStateTest3() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new AvailableState();
			state.markMaintenance(equipment);
			
			assertEquals(equipment.getStatus(), "Maintenance");		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AvailableStateTest4() {
		try {
			EquipmentState state = new AvailableState();
			
			assertEquals(state.getStateName(), "Available");		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AvailableStateTest5() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new AvailableState();
			state.disable(equipment);
			
			assertTrue(equipment.getCurrentState() instanceof DisabledState);		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AvailableStateTest6() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new AvailableState();
			state.markMaintenance(equipment);
			
			assertTrue(equipment.getCurrentState() instanceof MaintenanceState);		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AvailableStateTest7() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new AvailableState();
			state.enable(equipment);
			
			assertTrue(equipment.getCurrentState() instanceof AvailableState);		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AvailableStateTest8() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new AvailableState();
			state.disable(equipment);
			
			assertTrue(outContent.toString().equals(""));
			
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AvailableStateTest9() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new AvailableState();
			state.markMaintenance(equipment);
			
			assertTrue(outContent.toString().equals(""));
			
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AvailableStateTest10() {
		try {
			EquipmentState state = new AvailableState();
			state.getStateName();
			
			assertTrue(outContent.toString().equals(""));
			
		} catch(Exception e) {
			fail();
		}

	}

}

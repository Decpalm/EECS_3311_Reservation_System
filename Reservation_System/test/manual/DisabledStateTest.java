package manual;

import model.Equipment;
import state.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DisabledStateTest {
	
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
	public void DisabledStateTest1() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new DisabledState();
			state.enable(equipment);
			
			assertEquals(equipment.getStatus(), "Available");	
			
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void DisabledStateTest2() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new DisabledState();
			state.disable(equipment);
			
			assertTrue(outContent.toString().contains("Equipment is already disabled."));
	
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void DisabledStateTest3() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new DisabledState();
			state.markMaintenance(equipment);
			
			assertEquals(equipment.getStatus(), "Maintenance");		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void DisabledStateTest4() {
		try {
			EquipmentState state = new DisabledState();
			
			assertEquals(state.getStateName(), "Disabled");		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void DisabledStateTest5() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new DisabledState();
			equipment.disable();
			state.disable(equipment);
			
			assertTrue(equipment.getCurrentState() instanceof DisabledState);		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void DisabledStateTest6() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new DisabledState();
			state.markMaintenance(equipment);
			
			assertTrue(equipment.getCurrentState() instanceof MaintenanceState);		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void DisabledStateTest7() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new DisabledState();
			state.enable(equipment);
			
			assertTrue(equipment.getCurrentState() instanceof AvailableState);		
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void DisabledStateTest8() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new DisabledState();
			state.enable(equipment);
			
			assertTrue(outContent.toString().equals(""));
			
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void DisabledStateTest9() {
		try {
			Equipment equipment = new Equipment("1", "1", "1");
			EquipmentState state = new DisabledState();
			state.markMaintenance(equipment);
			
			assertTrue(outContent.toString().equals(""));
			
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void DisabledStateTest10() {
		try {
			EquipmentState state = new DisabledState();
			state.getStateName();
			
			assertTrue(outContent.toString().equals(""));
			
		} catch(Exception e) {
			fail();
		}

	}

}

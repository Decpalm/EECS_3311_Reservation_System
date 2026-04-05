package manual;

import org.junit.Test;
import static org.junit.Assert.*;

import factory.EquipmentFactory;
import model.Equipment;

public class EquipmentFactoryTest {
	
	@Test
	public void EquipmentFactoryTest1() {
		try {
		Equipment equipment = EquipmentFactory.createEquipment("", "", "");
		} catch(Exception e) {
			assertEquals(e.getMessage(), "Equipment ID cannot be empty.");
		}
	}
	
	@Test
	public void EquipmentFactoryTest2() {
		try {
			Equipment equipment = EquipmentFactory.createEquipment(null, null, null);
			} catch(Exception e) {
				assertEquals(e.getMessage(), "Equipment ID cannot be empty.");
			}
	}
	
	@Test
	public void EquipmentFactoryTest3() {
		try {
			Equipment equipment = EquipmentFactory.createEquipment("1", "", "");
			} catch(Exception e) {
				assertEquals(e.getMessage(), "Equipment description cannot be empty.");
			}
	}
	
	@Test
	public void EquipmentFactoryTest4() {
		try {
			Equipment equipment = EquipmentFactory.createEquipment("1", null, null);
			} catch(Exception e) {
				assertEquals(e.getMessage(), "Equipment description cannot be empty.");
			}
	}
	
	@Test
	public void EquipmentFactoryTest5() {
		try {
			Equipment equipment = EquipmentFactory.createEquipment("1", "1", "");
			} catch(Exception e) {
				assertEquals(e.getMessage(), "Lab location cannot be empty.");
			}
	}
	
	@Test
	public void EquipmentFactoryTest6() {
		try {
			Equipment equipment = EquipmentFactory.createEquipment("1", "1", "");
			} catch(Exception e) {
				assertEquals(e.getMessage(), "Lab location cannot be empty.");
			}
	}
	
	@Test
	public void EquipmentFactoryTest7() {
		try {
			Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
			assertEquals(equipment.getEquipmentId(), "1");
			} catch(Exception e) {
				fail();
			}
	}
	
	@Test
	public void EquipmentFactoryTest8() {
		try {
			Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
			assertEquals(equipment.getDescription(), "1");
			} catch(Exception e) {
				fail();
			}

	}
	
	@Test
	public void EquipmentFactoryTest9() {
		try {
			Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
			assertEquals(equipment.getLabLocation(), "1");
			} catch(Exception e) {
				fail();
			}
	}
	
	@Test
	public void EquipmentFactoryTest10() {
		try {
			Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
			assertEquals(equipment.getStatus(), "Available");
			} catch(Exception e) {
				fail();
			}
	}

}

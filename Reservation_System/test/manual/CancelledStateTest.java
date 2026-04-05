package manual;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

import org.junit.Test;

import factory.AccountFactory;
import factory.EquipmentFactory;
import model.Equipment;
import model.Reservation;
import model.User;
import state.*;
import strategy.*;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

public class CancelledStateTest {
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
    public void CancelledStateTest1() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new CancelledState();
        	
        	state.cancel(reservation);
        	
        	assertTrue(outContent.toString().contains("Reservation is already cancelled."));
    	} catch(Exception e) {
    		fail();
    	}
    }

    @Test
    public void CancelledStateTest2() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new CancelledState();
        	
        	state.modify(reservation);
        	
        	assertTrue(outContent.toString().contains("Cancelled reservation cannot be modified."));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void CancelledStateTest3() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new CancelledState();
        	
        	state.extend(reservation);
        	
        	assertTrue(outContent.toString().contains("Cancelled reservation cannot be extended."));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void CancelledStateTest4() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new CancelledState();
        	
        	assertTrue(state.getStateName().equals("Cancelled"));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void CancelledStateTest5() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new CancelledState();
        	
        	state.extend(reservation);
        	
        	assertTrue(!outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void CancelledStateTest6() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new CancelledState();
        	
        	state.cancel(reservation);
        	
        	assertTrue(!outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void CancelledStateTest7() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new CancelledState();
        	
        	state.modify(reservation);
        	
        	assertTrue(!outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void CancelledStateTest8() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new CancelledState();
        	
        	assertTrue(state instanceof CancelledState);
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void CancelledStateTest9() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new CancelledState();
        	
        	reservation.setState(state);
        	assertTrue(reservation.getCurrentState() instanceof CancelledState);
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void CancelledStateTest10() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new CancelledState();
        	
        	reservation.setState(state);
        	assertTrue(reservation.getStatus().equals("Cancelled"));
        	
    	} catch(Exception e) {
    		fail();
    	}
    }
}

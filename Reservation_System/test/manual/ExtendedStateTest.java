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

public class ExtendedStateTest {
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
    public void ExtendedStateTest1() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ExtendedState();
        	
        	state.cancel(reservation);
        	
        	assertTrue(reservation.getCurrentState() instanceof CancelledState);
    	} catch(Exception e) {
    		fail();
    	}
    }

    @Test
    public void ExtendedStateTest2() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ExtendedState();
        	
        	state.modify(reservation);
        	
        	assertTrue(outContent.toString().contains("Extended reservation modified."));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ExtendedStateTest3() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ExtendedState();
        	
        	state.extend(reservation);
        	
        	assertTrue(outContent.toString().contains("Reservation is already extended."));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ExtendedStateTest4() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ExtendedState();
        	
        	assertTrue(state.getStateName().equals("Extended"));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ExtendedStateTest5() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ExtendedState();
        	
        	state.extend(reservation);
        	
        	assertTrue(!outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ExtendedStateTest6() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ExtendedState();
        	
        	state.cancel(reservation);
        	
        	assertTrue(outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ExtendedStateTest7() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ExtendedState();
        	
        	state.modify(reservation);
        	
        	assertTrue(!outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ExtendedStateTest8() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ExtendedState();
        	
        	assertTrue(state instanceof ExtendedState);
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ExtendedStateTest9() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ExtendedState();
        	
        	reservation.setState(state);
        	assertTrue(reservation.getCurrentState() instanceof ExtendedState);
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ExtendedStateTest10() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ExtendedState();
        	
        	reservation.setState(state);
        	assertTrue(reservation.getStatus().equals("Extended"));
        	
    	} catch(Exception e) {
    		fail();
    	}
    }
}

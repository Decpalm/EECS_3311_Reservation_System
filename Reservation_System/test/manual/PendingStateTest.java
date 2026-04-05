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

public class PendingStateTest {
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
    public void PendingStateTest1() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new PendingState();
        	
        	state.cancel(reservation);
        	
        	assertTrue(reservation.getCurrentState() instanceof CancelledState);
    	} catch(Exception e) {
    		fail();
    	}
    }

    @Test
    public void PendingStateTest2() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new PendingState();
        	
        	state.modify(reservation);
        	
        	assertTrue(outContent.toString().contains("Pending reservation modified."));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void PendingStateTest3() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new PendingState();
        	
        	state.extend(reservation);
        	
        	assertTrue(outContent.toString().contains("Pending reservation cannot be extended until confirmed."));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void PendingStateTest4() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new PendingState();
        	
        	assertTrue(state.getStateName().equals("Pending"));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void PendingStateTest5() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new PendingState();
        	
        	state.extend(reservation);
        	
        	assertTrue(!outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void PendingStateTest6() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new PendingState();
        	
        	state.cancel(reservation);
        	
        	assertTrue(outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void PendingStateTest7() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new PendingState();
        	
        	state.modify(reservation);
        	
        	assertTrue(!outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void PendingStateTest8() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new PendingState();
        	
        	assertTrue(state instanceof PendingState);
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void PendingStateTest9() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new PendingState();
        	
        	reservation.setState(state);
        	assertTrue(reservation.getCurrentState() instanceof PendingState);
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void PendingStateTest10() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new PendingState();
        	
        	reservation.setState(state);
        	assertTrue(reservation.getStatus().equals("Pending"));
        	
    	} catch(Exception e) {
    		fail();
    	}
    }
}

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

public class ConfirmedStateTest {
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
    public void ConfirmedStateTest1() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ConfirmedState();
        	
        	state.cancel(reservation);
        	
        	assertTrue(reservation.getCurrentState() instanceof CancelledState);
    	} catch(Exception e) {
    		fail();
    	}
    }

    @Test
    public void ConfirmedStateTest2() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ConfirmedState();
        	
        	state.modify(reservation);
        	
        	assertTrue(outContent.toString().contains("Confirmed reservation modified."));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ConfirmedStateTest3() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ConfirmedState();
        	
        	state.extend(reservation);
        	
        	assertTrue(reservation.getCurrentState() instanceof ExtendedState);
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ConfirmedStateTest4() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ConfirmedState();
        	
        	assertTrue(state.getStateName().equals("Confirmed"));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ConfirmedStateTest5() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ConfirmedState();
        	
        	state.extend(reservation);
        	
        	assertTrue(outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ConfirmedStateTest6() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ConfirmedState();
        	
        	state.cancel(reservation);
        	
        	assertTrue(outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ConfirmedStateTest7() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ConfirmedState();
        	
        	state.modify(reservation);
        	
        	assertTrue(!outContent.toString().equals(""));
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ConfirmedStateTest8() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ConfirmedState();
        	
        	assertTrue(state instanceof ConfirmedState);
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ConfirmedStateTest9() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ConfirmedState();
        	
        	reservation.setState(state);
        	assertTrue(reservation.getCurrentState() instanceof ConfirmedState);
    	} catch(Exception e) {
    		fail();
    	}
    }
    
    @Test
    public void ConfirmedStateTest10() {
    	try {
    		User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
    		Equipment equipment = EquipmentFactory.createEquipment("1", "1", "1");
        	Reservation reservation  = new Reservation(user, equipment, LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30), new StudentPricingStrategy() );
        	
        	ReservationState state = new ConfirmedState();
        	
        	reservation.setState(state);
        	assertTrue(reservation.getStatus().equals("Confirmed"));
        	
    	} catch(Exception e) {
    		fail();
    	}
    }
}

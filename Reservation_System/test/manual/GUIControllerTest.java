package manual;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import app.ReservationSystem;
import gui.*;
import model.Equipment;
import model.Payment;
import model.Reservation;
import model.User;
import state.DisabledState;

public class GUIControllerTest {
	
	@Test
	public void GUIControllerTest1(){
		GUIController controller = new GUIController();
		ReservationSystem reservationSystem = ReservationSystem.getInstance();
		
		User user = controller.registerUser("student", "1@yorku.ca", "Pass1!abc", "");
		
		try {
			controller.updateIdOrCert(user, "Pass1!abc", "STU123");
			
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void GUIControllerTest2(){
		GUIController controller = new GUIController();
		ReservationSystem reservationSystem = ReservationSystem.getInstance();
		
		User user = controller.registerUser("lab manager", "2@yorku.ca", "Pass1!abc", "cert1");
		
		controller.addEquipment(user, "Pass1!abc", "1", "1", "1");
		
		boolean found = false;
		for (Equipment e : controller.getAllEquipment()) {
			if(e.getEquipmentId().equals("1")) {
				found = true;
			}
		}
		assertTrue(found);
	}
	
	@Test
	public void GUIControllerTest3(){
		GUIController controller = new GUIController();
		ReservationSystem reservationSystem = ReservationSystem.getInstance();
		
		User user = controller.registerUser("student", "3@yorku.ca", "Pass1!abc", "cert1");
		User user2 = controller.registerUser("lab manager", "4@yorku.ca", "Pass1!abc", "cert1");
		
		controller.addEquipment(user2, "Pass1!abc", "2", "2", "2");
		
		controller.reserveEquipment(user, "Pass1!abc", "2", LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30));
		
		boolean found = false;
		for (Reservation e : controller.getAllReservations()) {
			if(e.getEquipment().getEquipmentId().equals("2") && e.getStartTime().equals(LocalDateTime.of(2025, 12, 15, 10 ,30))) {
				found = true;
			}
		}
		assertTrue(found);
	}
	
	@Test
	public void GUIControllerTest4(){
		GUIController controller = new GUIController();
		ReservationSystem reservationSystem = ReservationSystem.getInstance();
		
		User user = controller.registerUser("student", "5@yorku.ca", "Pass1!abc", "cert1");
		User user2 = controller.registerUser("lab manager", "6@yorku.ca", "Pass1!abc", "cert1");
		
		controller.addEquipment(user2, "Pass1!abc", "3", "3", "3");
		
		controller.reserveEquipment(user, "Pass1!abc", "3", LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30));
		
		String resID = "";
		for (Reservation e : controller.getAllReservations()) {
			if(e.getEquipment().getEquipmentId().equals("3") && e.getStartTime().equals(LocalDateTime.of(2025, 12, 15, 10 ,30))) {
				resID = e.getReservationId().toString();
			}
		}
		
		controller.modifyReservation(user, "Pass1!abc", resID, LocalDateTime.of(2025, 12, 15, 11 ,30), LocalDateTime.of(2025, 12, 15, 11 ,30));
		
		boolean found = false;
		for (Reservation e : controller.getAllReservations()) {
			if(e.getEquipment().getEquipmentId().equals("3") && e.getStartTime().equals(LocalDateTime.of(2025, 12, 15, 11 ,30))) {
				found = true;
			}
		}
		assertTrue(found);
	}
	
	@Test
	public void GUIControllerTest5(){
		GUIController controller = new GUIController();
		ReservationSystem reservationSystem = ReservationSystem.getInstance();
		
		User user = controller.registerUser("student", "7@yorku.ca", "Pass1!abc", "cert1");
		User user2 = controller.registerUser("lab manager", "8@yorku.ca", "Pass1!abc", "cert1");
		
		controller.addEquipment(user2, "Pass1!abc", "4", "4", "4");
		
		controller.reserveEquipment(user, "Pass1!abc", "4", LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30));
		
		String resID = "";
		for (Reservation e : controller.getAllReservations()) {
			if(e.getEquipment().getEquipmentId().equals("4") && e.getStartTime().equals(LocalDateTime.of(2025, 12, 15, 10 ,30))) {
				resID = e.getReservationId().toString();
			}
		}
		
		controller.cancelReservation(user, "Pass1!abc", resID);
		
		boolean found = false;
		for (Reservation e : controller.getAllReservations()) {
			if(e.getEquipment().getEquipmentId().equals("4") && e.getStartTime().equals(LocalDateTime.of(2025, 12, 15, 10 ,30))) {
				if(e.getStatus().equals("Cancelled")) {
					found = true;
				}
			}
		}
		assertTrue(found);
	}
	
	@Test
	public void GUIControllerTest6(){
		GUIController controller = new GUIController();
		ReservationSystem reservationSystem = ReservationSystem.getInstance();
		
		User user = controller.registerUser("student", "9@yorku.ca", "Pass1!abc", "cert1");
		User user2 = controller.registerUser("lab manager", "10@yorku.ca", "Pass1!abc", "cert1");
		
		controller.addEquipment(user2, "Pass1!abc", "5", "5", "5");
		
		controller.reserveEquipment(user, "Pass1!abc", "5", LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 10 ,30));
		
		String resID = "";
		for (Reservation e : controller.getAllReservations()) {
			if(e.getEquipment().getEquipmentId().equals("5") && e.getStartTime().equals(LocalDateTime.of(2025, 12, 15, 10 ,30))) {
				resID = e.getReservationId().toString();
			}
		}
		
		controller.extendReservation(user, "Pass1!abc", resID, LocalDateTime.of(2025, 12, 15, 11 ,30));
		
		boolean found = false;
		for (Reservation e : controller.getAllReservations()) {
			if(e.getEquipment().getEquipmentId().equals("5") && e.getEndTime().equals(LocalDateTime.of(2025, 12, 15, 11 ,30))) {
				found = true;
			}
		}
		assertTrue(found);
	}
	
	@Test
	public void GUIControllerTest7(){
		GUIController controller = new GUIController();
		ReservationSystem reservationSystem = ReservationSystem.getInstance();
		
		User user = controller.registerUser("student", "11@yorku.ca", "Pass1!abc", "cert1");
		User user2 = controller.registerUser("lab manager", "12@yorku.ca", "Pass1!abc", "cert1");
		
		controller.addEquipment(user2, "Pass1!abc", "6", "6", "6");
		
		controller.reserveEquipment(user, "Pass1!abc", "6", LocalDateTime.of(2025, 12, 15, 10 ,30), LocalDateTime.of(2025, 12, 15, 11 ,30));
		
		String resID = "";
		for (Reservation e : controller.getAllReservations()) {
			if(e.getEquipment().getEquipmentId().equals("6") && e.getStartTime().equals(LocalDateTime.of(2025, 12, 15, 10 ,30))) {
				resID = e.getReservationId().toString();
			}
		}
		
		Payment payment = controller.processPayment(user, "Pass1!abc", resID, 10, "Credit");
		assertTrue(payment.getAmount() == 10.0);
		assertTrue(controller.getAllPayments().size()==1);
		
	}
	
	@Test
	public void GUIControllerTest8(){
		GUIController controller = new GUIController();
		ReservationSystem reservationSystem = ReservationSystem.getInstance();
		
		User user = controller.registerUser("lab manager", "13@yorku.ca", "Pass1!abc", "cert1");
		
		controller.addEquipment(user, "Pass1!abc", "7", "7", "7");
				
		controller.updateEquipmentStatus(user, "Pass1!abc", "7", "Disabled");
		
		boolean found = false;
		for (Equipment e : controller.getAllEquipment()) {
			if(e.getEquipmentId().equals("7")) {
				if(e.getCurrentState() instanceof DisabledState) {
					found = true;
				}
			}
		}
		assertTrue(found);
		
	}
	
	@Test
	public void GUIControllerTest9(){
		GUIController controller = new GUIController();
		ReservationSystem reservationSystem = ReservationSystem.getInstance();
		
		User user = controller.registerUser("lab manager", "14@yorku.ca", "Pass1!abc", "cert1");
		
		controller.addEquipment(user, "Pass1!abc", "8", "8", "8");
				
		controller.applySensorUpdate(user, "Pass1!abc", "8", "Disabled", "Equipment 8 Disabled");
		
		boolean found = false;
		for (Equipment e : controller.getAllEquipment()) {
			if(e.getEquipmentId().equals("8")) {
				if(e.getCurrentState() instanceof DisabledState) {
					found = true;
				}
			}
		}
		assertTrue(found);
		
	}
	
	@Test
	public void GUIControllerTest10(){
		GUIController controller = new GUIController();
		ReservationSystem reservationSystem = ReservationSystem.getInstance();
		
		User user = controller.registerUser("head lab coordinator", "15@yorku.ca", "Pass1!abc", "cert1");
		
		controller.AutoGenerateLabManagerCommand(user, "Pass1!abc", "man1@gmail.com");
				
		boolean found = false;
		for (User e : controller.getAllUsers()) {
			if(e.getEmail().equals("man1@gmail.com")) {
				found = true;
			}
		}
		assertTrue(found);
		
	}

}

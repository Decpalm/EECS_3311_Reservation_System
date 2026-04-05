package manual;

import org.junit.Test;
import static org.junit.Assert.*;

import factory.AccountFactory;
import model.User;

public class AccountFactoryTest {
	
	@Test
	public void AccountFactoryTest1() {
		try {
			User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
	        assertNotNull(user);
	        assertEquals(user.getStatus(), "ACTIVE");
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AccountFactoryTest2() {
		try {
			User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "");
	        assertNotNull(user);
	        assertEquals(user.getStatus(), "INACTIVE");
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AccountFactoryTest3() {
		try {
			User user = AccountFactory.createUser("student", "stu@yorku.ca", "Pass1!abc", "STU123");
	        assertNotNull(user);
	        assertEquals(user.getEmail(), "stu@yorku.ca");
	        assertEquals(user.getRole(), "Student");
	        
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AccountFactoryTest4() {
		try {
			User user = AccountFactory.createUser("faculty", "fac@yorku.ca", "Pass1!abc", "FAC123");
	        assertNotNull(user);
	        assertEquals(user.getStatus(), "ACTIVE");
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AccountFactoryTest5() {
		try {
			User user = AccountFactory.createUser("researcher", "fac@yorku.ca", "Pass1!abc", "RES123");
	        assertNotNull(user);
	        assertEquals(user.getStatus(), "ACTIVE");
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AccountFactoryTest6() {
		try {
			User user = AccountFactory.createUser("guest", "fac@yorku.ca", "Pass1!abc", "GUE123");
	        assertNotNull(user);
	        assertEquals(user.getStatus(), "ACTIVE");
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AccountFactoryTest7() {
		try {
			User user = AccountFactory.createUser("headlabcoordinator", "fac@yorku.ca", "Pass1!abc", "HEAD123");
	        assertNotNull(user);
	        assertEquals(user.getStatus(), "ACTIVE");
		} catch(Exception e) {
			fail();
		}
	}
	
	@Test
	public void AccountFactoryTest8() {
		try {
			User user = AccountFactory.createUser("labmanager", "fac@yorku.ca", "Pass1!abc", "MAN123");
	        assertNotNull(user);
	        assertEquals(user.getStatus(), "ACTIVE");
		} catch(Exception e) {
			fail();
		}
	}
	@Test
	public void AccountFactoryTest9() {
		try {
			User user = AccountFactory.createUser("invalid", "fac@yorku.ca", "Pass1!abc", "INV123");
	        fail();
		} catch(Exception e) {
			
		}
	}
	
	@Test
	public void AccountFactoryTest10() {
		try {
			User user = AccountFactory.createUser(null, "stu@yorku.ca", "Pass1!abc", "INV123");
	        fail();
		} catch(Exception e) {
			
		}
	}

}

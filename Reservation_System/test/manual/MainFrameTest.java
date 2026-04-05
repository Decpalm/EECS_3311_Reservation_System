package manual;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import app.ReservationSystem;

import javax.swing.*;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import gui.MainFrame;
import model.Equipment;
import model.Reservation;
import model.User;



public class MainFrameTest {
	
	private MainFrame frame;

    @Before
    public void setUp() throws InvocationTargetException, InterruptedException {
        SwingUtilities.invokeAndWait(() -> {
            frame = new MainFrame();
            frame.setVisible(false);
        });
    }
    
    private <T extends Component> List<T> findAll(Container root, Class<T> type) {
        List<T> result = new ArrayList<>();
        for (Component c : root.getComponents()) {
            if (type.isInstance(c)) result.add(type.cast(c));
            if (c instanceof Container) result.addAll(findAll((Container) c, type));
        }
        return result;
    }
    
    private JPanel getTab(int index) {
        JTabbedPane tabs = findAll(frame, JTabbedPane.class).get(0);
        return (JPanel) tabs.getComponentAt(index);
    }

    @Test
    public void MainFrameTest1() {
        assertEquals("YorkU Lab Equipment Reservation Platform", frame.getTitle());
    }

    @Test 
    public void MainFrameTest2(){
    	assertEquals(frame.getHeight(), 800);
    	assertEquals(frame.getWidth(), 1200);
    }
    
    @Test 
    public void MainFrameTest3(){
    	JTabbedPane tabs = findAll(frame, JTabbedPane.class).get(0);
        assertEquals(9, tabs.getTabCount());
    }
    
    @Test
    public void MainFrameTest4() {
        JTabbedPane tabs = findAll(frame, JTabbedPane.class).get(0);
        assertEquals("Register User", tabs.getTitleAt(0));
        assertEquals("Add/Change ID/Cert", tabs.getTitleAt(1));
        assertEquals("Add Equipment", tabs.getTitleAt(2));
        assertEquals("Reserve Equipment", tabs.getTitleAt(3));
        assertEquals("Modify/Cancel/Extend", tabs.getTitleAt(4));
        assertEquals("Process Payment", tabs.getTitleAt(5));
        assertEquals("Equipment Status", tabs.getTitleAt(6));
        assertEquals("Auto-Generate Lab Manager Account", tabs.getTitleAt(7));
        assertEquals("View Data", tabs.getTitleAt(8));
    }
    
    @Test
    public void MainFrameTest5() {
    	ReservationSystem sys = ReservationSystem.getInstance();
        JPanel tab = getTab(0);
        List<JTextField> fields = findAll(tab, JTextField.class);
        List<JComboBox> box = findAll(tab, JComboBox.class);
        List<JButton> buttons = findAll(tab, JButton.class);
        
        try {
			SwingUtilities.invokeAndWait(() -> {
			    box.get(0).setSelectedIndex(0);
			    fields.get(0).setText("20@gmail.com");
			    fields.get(1).setText("Pass1!abc");
			    fields.get(2).setText("cert1");
			    buttons.get(1).doClick();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        boolean found = false;
        for(User e : sys.getAllUsers()) {
        	if(e.getEmail().equals("20@gmail.com")) {
        		found = true;
        	}
        }
        assertTrue(found);
    }
    
    @Test
    public void MainFrameTest6() {
    	ReservationSystem sys = ReservationSystem.getInstance();
        JPanel tab = getTab(1);
        List<JTextField> fields = findAll(tab, JTextField.class);
        List<JButton> buttons = findAll(tab, JButton.class);
        
        try {
			SwingUtilities.invokeAndWait(() -> {
			    fields.get(0).setText("20@gmail.com");
			    fields.get(1).setText("Pass1!abc");
			    fields.get(2).setText("cert2");
			    buttons.get(0).doClick();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        boolean found = false;
        for(User e : sys.getAllUsers()) {
        	if(e.getEmail().equals("20@gmail.com")) {
        		if(e.getIdOrCertNumber().equals("cert2")) {
        			found = true;
        		}
        	}
        }
        assertTrue(found);
    }
    
    @Test
    public void MainFrameTest7() {
    	ReservationSystem sys = ReservationSystem.getInstance();
        JPanel tab = getTab(2);
        List<JTextField> fields = findAll(tab, JTextField.class);
        List<JButton> buttons = findAll(tab, JButton.class);
        
        sys.registerUser("lab manager", "man2@gmail.com", "Pass1!abc", "cert1");
        
        try {
			SwingUtilities.invokeAndWait(() -> {
			    fields.get(0).setText("man2@gmail.com");
			    fields.get(1).setText("Pass1!abc");
			    fields.get(2).setText("20");
			    fields.get(3).setText("20");
			    fields.get(4).setText("20");
			    buttons.get(0).doClick();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        boolean found = false;
        for(Equipment e : sys.getAllEquipment()) {
        	if(e.getEquipmentId().equals("20")) {
        		found = true;
        	}
        }
        assertTrue(found);
    }
    
    @Test
    public void MainFrameTest8() {
    	ReservationSystem sys = ReservationSystem.getInstance();
        JPanel tab = getTab(3);
        List<JTextField> fields = findAll(tab, JTextField.class);
        List<JButton> buttons = findAll(tab, JButton.class);
        
        try {
			SwingUtilities.invokeAndWait(() -> {
			    fields.get(0).setText("20@gmail.com");
			    fields.get(1).setText("Pass1!abc");
			    fields.get(2).setText("20");
			    buttons.get(0).doClick();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        boolean found = false;
        for(Reservation e : sys.getAllReservations()) {
        	if(e.getStartTime().equals(LocalDateTime.parse("2026-03-20T10:00"))) {
        		found = true;
        	}
        }
        assertTrue(found);
    }
    
    @Test
    public void MainFrameTest9() {
    	ReservationSystem sys = ReservationSystem.getInstance();
        JPanel tab = getTab(4);
        List<JTextField> fields = findAll(tab, JTextField.class);
        List<JButton> buttons = findAll(tab, JButton.class);
        
        final String[] resID = new String[1];
        resID[0] = "";
        for (Reservation e : sys.getAllReservations()) {
            if (e.getEquipment().getEquipmentId().equals("20") &&
                e.getStartTime().equals(LocalDateTime.parse("2026-03-20T10:00"))) {
                resID[0] = e.getReservationId().toString();
            }
        }
		
        try {
			SwingUtilities.invokeAndWait(() -> {
			    fields.get(0).setText("20@gmail.com");
			    fields.get(1).setText("Pass1!abc");
			    fields.get(2).setText(resID[0]);
			    fields.get(3).setText("2026-03-20T11:00");
			    fields.get(4).setText("2026-03-20T13:00");
			    buttons.get(0).doClick();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        boolean found = false;
        for(Reservation e : sys.getAllReservations()) {
        	if(e.getStartTime().equals(LocalDateTime.parse("2026-03-20T11:00"))) {
        		found = true;
        	}
        }
        assertTrue(found);
    }
    
    @Test
    public void MainFrameTest10() {
    	ReservationSystem sys = ReservationSystem.getInstance();
        JPanel tab = getTab(4);
        List<JTextField> fields = findAll(tab, JTextField.class);
        List<JButton> buttons = findAll(tab, JButton.class);
        
        final String[] resID = new String[1];
        resID[0] = "";
        for (Reservation e : sys.getAllReservations()) {
            if (e.getEquipment().getEquipmentId().equals("20") &&
                e.getStartTime().equals(LocalDateTime.parse("2026-03-20T11:00"))) {
                resID[0] = e.getReservationId().toString();
            }
        }
		
        try {
			SwingUtilities.invokeAndWait(() -> {
			    fields.get(0).setText("20@gmail.com");
			    fields.get(1).setText("Pass1!abc");
			    fields.get(2).setText(resID[0]);
			    fields.get(3).setText("2026-03-20T11:00");
			    fields.get(4).setText("2026-03-20T14:00");
			    buttons.get(2).doClick();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        boolean found = false;
        for(Reservation e : sys.getAllReservations()) {
        	if(e.getEndTime().equals(LocalDateTime.parse("2026-03-20T14:00"))) {
        		found = true;
        	}
        }
        assertTrue(found);
    }
    
    @Test
    public void MainFrameTest11() {
    	ReservationSystem sys = ReservationSystem.getInstance();
        JPanel tab = getTab(4);
        List<JTextField> fields = findAll(tab, JTextField.class);
        List<JButton> buttons = findAll(tab, JButton.class);
        
        final String[] resID = new String[1];
        resID[0] = "";
        for (Reservation e : sys.getAllReservations()) {
            if (e.getEquipment().getEquipmentId().equals("20") &&
                e.getStartTime().equals(LocalDateTime.parse("2026-03-20T11:00"))) {
                resID[0] = e.getReservationId().toString();
            }
        }
		
        try {
			SwingUtilities.invokeAndWait(() -> {
			    fields.get(0).setText("20@gmail.com");
			    fields.get(1).setText("Pass1!abc");
			    fields.get(2).setText(resID[0]);
			    fields.get(3).setText("2026-03-20T11:00");
			    fields.get(4).setText("2026-03-20T14:00");
			    buttons.get(1).doClick();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        boolean found = false;
        for(Reservation e : sys.getAllReservations()) {
        	if(e.getStartTime().equals(LocalDateTime.parse("2026-03-20T11:00"))) {
        		if(e.getStatus().equals("Cancelled")){
        			found = true;     			
        		}

        	}
        }
        assertTrue(found);
    }
    
    @Test
    public void MainFrameTest12() {
    	ReservationSystem sys = ReservationSystem.getInstance();
        JPanel tab = getTab(5);
        List<JTextField> fields = findAll(tab, JTextField.class);
        List<JButton> buttons = findAll(tab, JButton.class);
        List<JComboBox> box = findAll(tab, JComboBox.class);
        
        final String[] resID = new String[1];
        resID[0] = "";
        for (Reservation e : sys.getAllReservations()) {
            if (e.getEquipment().getEquipmentId().equals("20") &&
                e.getStartTime().equals(LocalDateTime.parse("2026-03-20T11:00"))) {
                resID[0] = e.getReservationId().toString();
            }
        }
		
        try {
			SwingUtilities.invokeAndWait(() -> {
			    fields.get(0).setText("20@gmail.com");
			    fields.get(1).setText("Pass1!abc");
			    fields.get(2).setText(resID[0]);
			    fields.get(3).setText("10");
			    box.get(0).setSelectedIndex(0);
			    buttons.get(1).doClick();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        boolean found = false;
        for(Reservation e : sys.getAllReservations()) {
        	if(e.getStartTime().equals(LocalDateTime.parse("2026-03-20T11:00"))) {
        		if(e.getPayment() != null){
        			found = true;     			
        		}

        	}
        }
        assertTrue(found);
    }
    
    @Test
    public void MainFrameTest13() {
    	ReservationSystem sys = ReservationSystem.getInstance();
        JPanel tab = getTab(8);
        List<JButton> buttons = findAll(tab, JButton.class);
		
        try {
			SwingUtilities.invokeAndWait(() -> {
			    buttons.get(0).doClick();
			    buttons.get(1).doClick();
			    buttons.get(2).doClick();
			    buttons.get(3).doClick();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        JTextArea output = findAll(frame, JTextArea.class).get(0);
        assertTrue(output.getText().contains("---- USERS ----\n"));
        assertTrue(output.getText().contains("---- EQUIPMENT ----\n"));
        assertTrue(output.getText().contains("---- RESERVATIONS ----\n"));
        assertTrue(output.getText().contains("---- PAYMENTS ----\n"));
    }


    @After
    public void tearDown() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            frame.dispose();
        });
    }

    

}

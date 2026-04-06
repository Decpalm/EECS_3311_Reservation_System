package manual;

import factory.AccountFactory;
import factory.EquipmentFactory;
import model.*;
import persistence.CSVDataStore;

import org.junit.jupiter.api.Test;
import strategy.StudentPricingStrategy;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


public class CSVDataStoreTest {

    @Test
    void getInstance_returnsNonNull() {
        assertNotNull(CSVDataStore.getInstance());
    }

    @Test
    void getInstance_isSingleton() {
        CSVDataStore a = CSVDataStore.getInstance();
        CSVDataStore b = CSVDataStore.getInstance();
        assertSame(a, b);
    }

    @Test
    void getUsers_neverNull() {
        assertNotNull(CSVDataStore.getInstance().getUsers());
    }

    @Test
    void getEquipmentList_neverNull() {
        assertNotNull(CSVDataStore.getInstance().getEquipmentList());
    }

    @Test
    void getReservations_neverNull() {
        assertNotNull(CSVDataStore.getInstance().getReservations());
    }

    @Test
    void getPayments_neverNull() {
        assertNotNull(CSVDataStore.getInstance().getPayments());
    }

    @Test
    void saveUser_findUserByEmail() {
        CSVDataStore data = CSVDataStore.getInstance();
        String email = "csvuser-" + UUID.randomUUID() + "@y.ca";
        User u = AccountFactory.createUser("student", email, "p", "ID-X");
        int before = data.getUsers().size();
        data.saveUser(u);
        assertEquals(before + 1, data.getUsers().size());
        assertEquals(email, data.findUserByEmail(email).getEmail());
    }

    @Test
    void findUserByEmail_isCaseInsensitive() {
        CSVDataStore data = CSVDataStore.getInstance();
        String email = "Mixed-" + UUID.randomUUID() + "@YorkU.ca";
        User u = AccountFactory.createUser("student", email, "p", "M1");
        data.saveUser(u);
        assertNotNull(data.findUserByEmail(email.toLowerCase()));
    }

    @Test
    void findUserById_stringUuid() {
        CSVDataStore data = CSVDataStore.getInstance();
        User u = AccountFactory.createUser("student", "idfind-" + UUID.randomUUID() + "@y.ca", "p", "I1");
        data.saveUser(u);
        User found = data.findUserById(u.getUserId().toString());
        assertEquals(u.getUserId(), found.getUserId());
    }

    @Test
    void findUserByRole_returnsFirstMatch() {
        CSVDataStore data = CSVDataStore.getInstance();
        User u = AccountFactory.createUser("student", "rolefind-" + UUID.randomUUID() + "@y.ca", "p", "R1");
        data.saveUser(u);
        User byRole = data.findUserByRole("student");
        assertNotNull(byRole);
        assertEquals("Student", byRole.getRole());
    }

    @Test
    void saveEquipment_findEquipmentById() {
        CSVDataStore data = CSVDataStore.getInstance();
        String id = "EQ-CSV-" + UUID.randomUUID().toString().substring(0, 8);
        Equipment e = EquipmentFactory.createEquipment(id, "Desc", "Lab");
        int before = data.getEquipmentList().size();
        data.saveEquipment(e);
        assertEquals(before + 1, data.getEquipmentList().size());
        assertEquals(id, data.findEquipmentById(id).getEquipmentId());
    }

    @Test
    void saveReservation_findReservationById() {
        CSVDataStore data = CSVDataStore.getInstance();
        User u = AccountFactory.createUser("student", "rsvcsv-" + UUID.randomUUID() + "@y.ca", "p", "RS1");
        data.saveUser(u);
        String eqId = "EQ-RSV-" + UUID.randomUUID().toString().substring(0, 8);
        Equipment eq = EquipmentFactory.createEquipment(eqId, "Tool", "L2");
        data.saveEquipment(eq);
        LocalDateTime start = LocalDateTime.of(2040, 3, 1, 9, 0);
        LocalDateTime end = LocalDateTime.of(2040, 3, 1, 10, 0);
        Reservation r = new Reservation(u, eq, start, end, new StudentPricingStrategy());
        int rb = data.getReservations().size();
        data.saveReservation(r);
        assertEquals(rb + 1, data.getReservations().size());
        assertNotNull(data.findReservationById(r.getReservationId().toString()));
    }

    @Test
    void savePayment_appendsToPayments() {
        CSVDataStore data = CSVDataStore.getInstance();
        Payment p = new Payment(12.34, "CASH");
        int before = data.getPayments().size();
        data.savePayment(p);
        assertEquals(before + 1, data.getPayments().size());
        boolean found = data.getPayments().stream()
                .anyMatch(x -> x.getPaymentId().equals(p.getPaymentId()));
        assertTrue(found);
    }

    @Test
    void updateUsers_doesNotThrow() {
        CSVDataStore data = CSVDataStore.getInstance();
        assertDoesNotThrow(data::updateUsers);
    }

    @Test
    void updateReservations_doesNotThrow() {
        CSVDataStore data = CSVDataStore.getInstance();
        assertDoesNotThrow(data::updateReservations);
    }
}

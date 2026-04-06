package manual;

import factory.AccountFactory;
import factory.EquipmentFactory;
import model.Equipment;
import model.Payment;
import model.Reservation;
import model.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.ConfirmedState;
import state.PendingState;
import strategy.ResearcherPricingStrategy;
import strategy.StudentPricingStrategy;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 tests for {@link Reservation}.
 *
 * @author sal1818
 */
public class ReservationTest {

    private User student;
    private Equipment equipment;
    private LocalDateTime start;
    private LocalDateTime end;
    private StudentPricingStrategy studentStrategy;
    private ResearcherPricingStrategy researcherStrategy;
    private Reservation reservation;

    @BeforeEach
    void setUp() {
        student = AccountFactory.createUser("student", "rsv@y.ca", "p", "ST1");
        equipment = EquipmentFactory.createEquipment("EQ-R", "Scope", "Lab A");
        studentStrategy = new StudentPricingStrategy();
        researcherStrategy = new ResearcherPricingStrategy();
        start = LocalDateTime.of(2026, 7, 1, 9, 0);
        end = LocalDateTime.of(2026, 7, 1, 11, 0);
        reservation = new Reservation(student, equipment, start, end, studentStrategy);
    }

    @Test
    void constructor_setsPendingStatus() {
        assertEquals("Pending", reservation.getStatus());
        assertInstanceOf(PendingState.class, reservation.getCurrentState());
    }

    @Test
    void getDurationHours_twoHours() {
        assertEquals(2.0, reservation.getDurationHours(), 0.001);
    }

    @Test
    void calculateTotalCost_studentTwoHours() {
        assertEquals(20.0, reservation.getTotalCost(), 0.001);
        assertEquals(10.0, reservation.getHourlyRate(), 0.001);
    }

    @Test
    void setPricingStrategy_recalculates() {
        reservation.setPricingStrategy(researcherStrategy);
        assertEquals(30.0, reservation.getTotalCost(), 0.001);
    }

    @Test
    void confirmReservation_setsConfirmed() {
        reservation.confirmReservation();
        assertEquals("Confirmed", reservation.getStatus());
        assertInstanceOf(ConfirmedState.class, reservation.getCurrentState());
    }

    @Test
    void cancelReservation_returnsTrueAndCancelled() {
        assertTrue(reservation.cancelReservation());
        assertEquals("Cancelled", reservation.getStatus());
    }

    @Test
    void modifyReservation_updatesTimesAndCost() {
        LocalDateTime ns = LocalDateTime.of(2026, 8, 1, 10, 0);
        LocalDateTime ne = LocalDateTime.of(2026, 8, 1, 14, 0);
        reservation.modifyReservation(ns, ne);
        assertEquals(ns, reservation.getStartTime());
        assertEquals(ne, reservation.getEndTime());
        assertEquals(40.0, reservation.getTotalCost(), 0.001);
    }

    @Test
    void extendReservation_updatesEndAndCost() {
        LocalDateTime ne = end.plusHours(1);
        assertTrue(reservation.extendReservation(ne));
        assertEquals(ne, reservation.getEndTime());
        assertEquals(30.0, reservation.getTotalCost(), 0.001);
    }

    @Test
    void calculateRemainingBalance_noPaymentEqualsTotal() {
        assertEquals(reservation.getTotalCost(), reservation.calculateRemainingBalance(), 0.001);
    }

    @Test
    void calculateRemainingBalance_successPaymentZero() {
        Payment pay = new Payment(reservation.getTotalCost(), "CARD");
        pay.markSuccess();
        reservation.setPayment(pay);
        assertEquals(0.0, reservation.calculateRemainingBalance(), 0.001);
    }

    @Test
    void setReservationId_roundTrip() {
        java.util.UUID id = java.util.UUID.randomUUID();
        reservation.setReservationId(id);
        assertEquals(id, reservation.getReservationId());
    }

    @Test
    void toString_containsEmailAndEquipment() {
        assertTrue(reservation.toString().contains("rsv@y.ca"));
        assertTrue(reservation.toString().contains("EQ-R"));
    }
}

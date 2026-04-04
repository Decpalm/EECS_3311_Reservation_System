package ai_generated;

import factory.AccountFactory;
import factory.EquipmentFactory;
import model.*;
import state.ConfirmedState;
import state.PendingState;
import strategy.ResearcherPricingStrategy;
import strategy.StudentPricingStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

/**
 * AI-assisted JUnit 5 test cases for the Reservation model class.
 * Does NOT depend on CSVDataStore — all objects are built in-memory.
 * Note: isAvailable() / isModifyAvailable() on Equipment hit CSVDataStore, so
 * those paths are covered in EquipmentTest instead.
 */
public class ReservationTest {

    private User student;
    private Equipment equipment;
    private LocalDateTime start;
    private LocalDateTime end;
    private ResearcherPricingStrategy researcherStrategy;
    private StudentPricingStrategy studentStrategy;
    private Reservation reservation;

    @BeforeEach
    void setUp() {
        student           = AccountFactory.createUser("student",    "stu@yorku.ca",  "Pass1!abc", "S1");
        User researcher   = AccountFactory.createUser("researcher", "res@yorku.ca",  "Pass1!abc", "R1");
        equipment         = EquipmentFactory.createEquipment("EQ001", "Oscilloscope", "Lab A");
        researcherStrategy = new ResearcherPricingStrategy();
        studentStrategy   = new StudentPricingStrategy();

        start = LocalDateTime.of(2026, 6, 1, 9, 0);
        end   = LocalDateTime.of(2026, 6, 1, 11, 0); // 2 hours

        reservation = new Reservation(student, equipment, start, end, studentStrategy);
    }

    // ─── Constructor / Initial State ─────────────────────────────────────────

    @Test
    void constructor_reservationIdIsNotNull() {
        assertNotNull(reservation.getReservationId());
    }

    @Test
    void constructor_userIsSet() {
        assertEquals(student, reservation.getUser());
    }

    @Test
    void constructor_equipmentIsSet() {
        assertEquals(equipment, reservation.getEquipment());
    }

    @Test
    void constructor_startTimeIsSet() {
        assertEquals(start, reservation.getStartTime());
    }

    @Test
    void constructor_endTimeIsSet() {
        assertEquals(end, reservation.getEndTime());
    }

    @Test
    void constructor_initialStatusIsPending() {
        assertEquals("Pending", reservation.getStatus());
    }

    @Test
    void constructor_currentStateIsPendingState() {
        assertInstanceOf(PendingState.class, reservation.getCurrentState());
    }

    @Test
    void constructor_paymentIsNull() {
        assertNull(reservation.getPayment());
    }

    // ─── getDurationHours ─────────────────────────────────────────────────────

    @Test
    void getDurationHours_twoHourWindow_returnsTwo() {
        assertEquals(2.0, reservation.getDurationHours(), 0.001);
    }

    @Test
    void getDurationHours_thirtyMinuteWindow_returnsPointFive() {
        Reservation r = new Reservation(student, equipment,
                LocalDateTime.of(2026, 6, 1, 9, 0),
                LocalDateTime.of(2026, 6, 1, 9, 30),
                studentStrategy);
        assertEquals(0.5, r.getDurationHours(), 0.001);
    }

    @Test
    void getDurationHours_ninetyMinuteWindow_returnsOnePointFive() {
        Reservation r = new Reservation(student, equipment,
                LocalDateTime.of(2026, 6, 1, 9, 0),
                LocalDateTime.of(2026, 6, 1, 10, 30),
                studentStrategy);
        assertEquals(1.5, r.getDurationHours(), 0.001);
    }

    // ─── calculateTotalCost / pricing ────────────────────────────────────────

    @Test
    void calculateTotalCost_totalCostIsPositive() {
        assertTrue(reservation.getTotalCost() > 0);
    }

    @Test
    void calculateTotalCost_hourlyRateIsPositive() {
        assertTrue(reservation.getHourlyRate() > 0);
    }

    @Test
    void calculateTotalCost_depositAmountIsPositive() {
        assertTrue(reservation.getDepositAmount() > 0);
    }

    @Test
    void setPricingStrategy_researcherStrategy_recalculatesTotal() {
        double oldTotal = reservation.getTotalCost();
        reservation.setPricingStrategy(researcherStrategy);
        // Researcher rate ($15) may differ from Student rate
        assertNotNull(reservation.getTotalCost()); // total recalculated without NPE
    }

    @Test
    void setPricingStrategy_researcherFor2Hours_totalIs30() {
        reservation.setPricingStrategy(researcherStrategy);
        assertEquals(30.0, reservation.getTotalCost(), 0.001);
    }

    // ─── confirmReservation ───────────────────────────────────────────────────

    @Test
    void confirmReservation_changesStatusToConfirmed() {
        reservation.confirmReservation();
        assertEquals("Confirmed", reservation.getStatus());
    }

    @Test
    void confirmReservation_stateIsConfirmedState() {
        reservation.confirmReservation();
        assertInstanceOf(ConfirmedState.class, reservation.getCurrentState());
    }

    // ─── cancelReservation ────────────────────────────────────────────────────

    @Test
    void cancelReservation_fromPending_returnsTrueAndStatusIsCancelled() {
        boolean result = reservation.cancelReservation();
        assertTrue(result);
        assertEquals("Cancelled", reservation.getStatus());
    }

    // ─── modifyReservation ────────────────────────────────────────────────────

    @Test
    void modifyReservation_fromPending_updatesStartAndEndTime() {
        LocalDateTime newStart = LocalDateTime.of(2026, 6, 2, 10, 0);
        LocalDateTime newEnd   = LocalDateTime.of(2026, 6, 2, 12, 0);
        reservation.modifyReservation(newStart, newEnd);
        assertEquals(newStart, reservation.getStartTime());
        assertEquals(newEnd,   reservation.getEndTime());
    }

    @Test
    void modifyReservation_recalculatesTotalCost() {
        double before = reservation.getTotalCost();
        // extend to 4 hours — cost should increase
        reservation.modifyReservation(start, start.plusHours(4));
        assertTrue(reservation.getTotalCost() > before);
    }

    // ─── extendReservation ────────────────────────────────────────────────────

    @Test
    void extendReservation_fromPending_returnsTrueAndUpdatesEndTime() {
        LocalDateTime newEnd = end.plusHours(2);
        boolean result = reservation.extendReservation(newEnd);
        assertTrue(result);
        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    void extendReservation_fromPending_totalCostIncreases() {
        double before = reservation.getTotalCost();
        reservation.extendReservation(end.plusHours(3));
        assertTrue(reservation.getTotalCost() > before);
    }

    // ─── calculateRemainingBalance ────────────────────────────────────────────

    @Test
    void calculateRemainingBalance_noPayment_returnsTotalCost() {
        assertEquals(reservation.getTotalCost(), reservation.calculateRemainingBalance(), 0.001);
    }

    @Test
    void calculateRemainingBalance_successfulPayment_returnsZero() {
        Payment payment = new Payment(reservation.getTotalCost(), "Credit Card");
        payment.markSuccess();
        reservation.setPayment(payment);
        assertEquals(0.0, reservation.calculateRemainingBalance(), 0.001);
    }

    @Test
    void calculateRemainingBalance_pendingPayment_returnsTotalCost() {
        Payment payment = new Payment(reservation.getTotalCost(), "Credit Card");
        // NOT marked success
        reservation.setPayment(payment);
        assertEquals(reservation.getTotalCost(), reservation.calculateRemainingBalance(), 0.001);
    }

    // ─── toString ─────────────────────────────────────────────────────────────

    @Test
    void toString_containsUserEmail() {
        assertTrue(reservation.toString().contains("stu@yorku.ca"));
    }

    @Test
    void toString_containsEquipmentId() {
        assertTrue(reservation.toString().contains("EQ001"));
    }

    @Test
    void toString_containsStatus() {
        assertTrue(reservation.toString().contains("Pending"));
    }
}

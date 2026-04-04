package ai_generated;

import factory.AccountFactory;
import model.Researcher;
import model.User;
import strategy.ResearcherPricingStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * AI-assisted JUnit 5 test cases for ResearcherPricingStrategy.
 * Hourly rate = $15.00
 * Deposit = rate * hours  if hours < 1, else rate (= $15)
 * Total   = rate * hours
 */
public class ResearcherPricingStrategyTest {

    private ResearcherPricingStrategy strategy;
    private User researcher;

    @BeforeEach
    void setUp() {
        strategy   = new ResearcherPricingStrategy();
        researcher = AccountFactory.createUser("researcher", "res@yorku.ca", "Pass1!abc", "R1");
    }

    // ─── calculateHourlyRate ──────────────────────────────────────────────────

    @Test
    void calculateHourlyRate_returnsFixedRate15() {
        assertEquals(15.0, strategy.calculateHourlyRate(researcher), 0.001);
    }

    @Test
    void calculateHourlyRate_isIndependentOfUser() {
        User other = AccountFactory.createUser("researcher", "r2@yorku.ca", "Pass1!abc", "R2");
        assertEquals(strategy.calculateHourlyRate(researcher),
                     strategy.calculateHourlyRate(other), 0.001);
    }

    // ─── calculateDeposit ────────────────────────────────────────────────────

    @Test
    void calculateDeposit_lessThanOneHour_returnsProportionalAmount() {
        // 0.5 h → 15 * 0.5 = 7.50
        assertEquals(7.50, strategy.calculateDeposit(researcher, 0.5), 0.001);
    }

    @Test
    void calculateDeposit_exactly1Hour_returnsFlatRate() {
        // hours == 1 → takes the else branch → deposit = rate = 15
        assertEquals(15.0, strategy.calculateDeposit(researcher, 1.0), 0.001);
    }

    @Test
    void calculateDeposit_moreThan1Hour_returnsFlatRate() {
        // hours == 5 → deposit = rate = 15
        assertEquals(15.0, strategy.calculateDeposit(researcher, 5.0), 0.001);
    }

    @Test
    void calculateDeposit_zeroHours_returnsZero() {
        assertEquals(0.0, strategy.calculateDeposit(researcher, 0.0), 0.001);
    }

    @Test
    void calculateDeposit_fractionalLessThanOne_isCorrect() {
        // 0.25 h → 15 * 0.25 = 3.75
        assertEquals(3.75, strategy.calculateDeposit(researcher, 0.25), 0.001);
    }

    @Test
    void calculateDeposit_justUnderOneHour_isCorrect() {
        // 0.999 h → 15 * 0.999 = 14.985  (< 1, proportional branch)
        assertEquals(14.985, strategy.calculateDeposit(researcher, 0.999), 0.001);
    }

    // ─── calculateTotal ───────────────────────────────────────────────────────

    @Test
    void calculateTotal_oneHour_returns15() {
        assertEquals(15.0, strategy.calculateTotal(researcher, 1.0), 0.001);
    }

    @Test
    void calculateTotal_twoHours_returns30() {
        assertEquals(30.0, strategy.calculateTotal(researcher, 2.0), 0.001);
    }

    @Test
    void calculateTotal_halfHour_returns7point5() {
        assertEquals(7.5, strategy.calculateTotal(researcher, 0.5), 0.001);
    }

    @Test
    void calculateTotal_zeroHours_returnsZero() {
        assertEquals(0.0, strategy.calculateTotal(researcher, 0.0), 0.001);
    }

    @Test
    void calculateTotal_largeHours_isCorrect() {
        // 40 h * 15 = 600
        assertEquals(600.0, strategy.calculateTotal(researcher, 40.0), 0.001);
    }

    @Test
    void calculateTotal_fractionalHours_isCorrect() {
        // 1.5 h * 15 = 22.50
        assertEquals(22.5, strategy.calculateTotal(researcher, 1.5), 0.001);
    }

    // ─── Total ≥ Deposit invariant ────────────────────────────────────────────

    @Test
    void totalIsAlwaysGreaterThanOrEqualToDeposit_shortReservation() {
        double hours = 0.5;
        double deposit = strategy.calculateDeposit(researcher, hours);
        double total   = strategy.calculateTotal(researcher, hours);
        assertTrue(total >= deposit);
    }

    @Test
    void totalIsAlwaysGreaterThanOrEqualToDeposit_longReservation() {
        double hours = 8.0;
        double deposit = strategy.calculateDeposit(researcher, hours);
        double total   = strategy.calculateTotal(researcher, hours);
        assertTrue(total >= deposit);
    }
}

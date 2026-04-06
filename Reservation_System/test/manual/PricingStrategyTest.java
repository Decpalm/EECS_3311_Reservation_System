package manual;

import factory.AccountFactory;
import model.User;
import strategy.PricingStrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PricingStrategyTest {

    /** Minimal implementation used only to exercise the interface contract. */
    static class FixedPricingStrategy implements PricingStrategy {
        @Override
        public double calculateHourlyRate(User user) {
            return 5.0;
        }

        @Override
        public double calculateDeposit(User user, double hours) {
            return hours < 1 ? hours * 5.0 : 5.0;
        }

        @Override
        public double calculateTotal(User user, double hours) {
            return 5.0 * hours;
        }
    }

    private FixedPricingStrategy strategy;
    private User user;

    @BeforeEach
    void setUp() {
        strategy = new FixedPricingStrategy();
        user = AccountFactory.createUser("student", "ps@y.ca", "p", "S");
    }

    @Test
    void calculateHourlyRate_returnsStubValue() {
        assertEquals(5.0, strategy.calculateHourlyRate(user), 0.001);
    }

    @Test
    void calculateTotal_oneHour_equalsRate() {
        assertEquals(5.0, strategy.calculateTotal(user, 1.0), 0.001);
    }

    @Test
    void calculateTotal_twoHours_doubleRate() {
        assertEquals(10.0, strategy.calculateTotal(user, 2.0), 0.001);
    }

    @Test
    void calculateTotal_zeroHours_zero() {
        assertEquals(0.0, strategy.calculateTotal(user, 0.0), 0.001);
    }

    @Test
    void calculateDeposit_lessThanOneHour_proportional() {
        assertEquals(2.5, strategy.calculateDeposit(user, 0.5), 0.001);
    }

    @Test
    void calculateDeposit_oneHour_flat() {
        assertEquals(5.0, strategy.calculateDeposit(user, 1.0), 0.001);
    }

    @Test
    void calculateDeposit_manyHours_flat() {
        assertEquals(5.0, strategy.calculateDeposit(user, 10.0), 0.001);
    }

    @Test
    void strategy_ignoresUserForHourlyRate() {
        User other = AccountFactory.createUser("faculty", "f@y.ca", "p", "F");
        assertEquals(strategy.calculateHourlyRate(user), strategy.calculateHourlyRate(other), 0.001);
    }

    @Test
    void totalMatchesRateTimesHours() {
        double h = 3.25;
        assertEquals(strategy.calculateHourlyRate(user) * h, strategy.calculateTotal(user, h), 0.001);
    }

    @Test
    void depositNeverExceedsTotalForPositiveHours() {
        double h = 0.75;
        double dep = strategy.calculateDeposit(user, h);
        double tot = strategy.calculateTotal(user, h);
        assertTrue(dep <= tot);
    }
}

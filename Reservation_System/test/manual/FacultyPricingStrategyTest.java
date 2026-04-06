package manual;

import factory.AccountFactory;
import model.User;
import strategy.FacultyPricingStrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 tests for {@link FacultyPricingStrategy}.
 *
 * @author sal1818
 */
public class FacultyPricingStrategyTest {

    private FacultyPricingStrategy strategy;
    private User faculty;

    @BeforeEach
    void setUp() {
        strategy = new FacultyPricingStrategy();
        faculty = AccountFactory.createUser("faculty", "fac-strat@y.ca", "p", "F1");
    }

    @Test
    void hourlyRate_isTwenty() {
        assertEquals(20.0, strategy.calculateHourlyRate(faculty), 0.001);
    }

    @Test
    void deposit_underOneHour_scaled() {
        assertEquals(10.0, strategy.calculateDeposit(faculty, 0.5), 0.001);
    }

    @Test
    void deposit_oneHour_flatTwenty() {
        assertEquals(20.0, strategy.calculateDeposit(faculty, 1.0), 0.001);
    }

    @Test
    void deposit_manyHours_flatTwenty() {
        assertEquals(20.0, strategy.calculateDeposit(faculty, 5.0), 0.001);
    }

    @Test
    void total_threeHours_sixty() {
        assertEquals(60.0, strategy.calculateTotal(faculty, 3.0), 0.001);
    }

    @Test
    void total_zero_zero() {
        assertEquals(0.0, strategy.calculateTotal(faculty, 0.0), 0.001);
    }

    @Test
    void total_oneHour_twenty() {
        assertEquals(20.0, strategy.calculateTotal(faculty, 1.0), 0.001);
    }

    @Test
    void deposit_pointTwoFive_hours() {
        assertEquals(5.0, strategy.calculateDeposit(faculty, 0.25), 0.001);
    }

    @Test
    void hourlyRate_independentOfUserIdentity() {
        User f2 = AccountFactory.createUser("faculty", "f2@y.ca", "p", "F2");
        assertEquals(strategy.calculateHourlyRate(faculty), strategy.calculateHourlyRate(f2), 0.001);
    }

    @Test
    void total_linearity() {
        assertEquals(200.0, strategy.calculateTotal(faculty, 10.0), 0.001);
    }
}

package manual;

import factory.AccountFactory;
import model.User;
import strategy.ResearcherPricingStrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ResearcherPricingStrategyTest {

    private ResearcherPricingStrategy strategy;
    private User researcher;

    @BeforeEach
    void setUp() {
        strategy = new ResearcherPricingStrategy();
        researcher = AccountFactory.createUser("researcher", "res-strat@y.ca", "p", "R1");
    }

    @Test
    void hourlyRate_isFifteen() {
        assertEquals(15.0, strategy.calculateHourlyRate(researcher), 0.001);
    }

    @Test
    void deposit_underOneHour_scaled() {
        assertEquals(7.5, strategy.calculateDeposit(researcher, 0.5), 0.001);
    }

    @Test
    void deposit_oneHour_flatFifteen() {
        assertEquals(15.0, strategy.calculateDeposit(researcher, 1.0), 0.001);
    }

    @Test
    void deposit_manyHours_flatFifteen() {
        assertEquals(15.0, strategy.calculateDeposit(researcher, 6.0), 0.001);
    }

    @Test
    void total_fourHours_sixty() {
        assertEquals(60.0, strategy.calculateTotal(researcher, 4.0), 0.001);
    }

    @Test
    void total_zero_zero() {
        assertEquals(0.0, strategy.calculateTotal(researcher, 0.0), 0.001);
    }

    @Test
    void total_fractional() {
        assertEquals(22.5, strategy.calculateTotal(researcher, 1.5), 0.001);
    }

    @Test
    void deposit_pointNineNine() {
        assertEquals(14.985, strategy.calculateDeposit(researcher, 0.999), 0.001);
    }

    @Test
    void twoResearchers_sameHourly() {
        User r2 = AccountFactory.createUser("researcher", "r2@y.ca", "p", "R2");
        assertEquals(strategy.calculateHourlyRate(researcher), strategy.calculateHourlyRate(r2), 0.001);
    }

    @Test
    void total_coversDepositForLongBooking() {
        double h = 5.0;
        assertTrue(strategy.calculateTotal(researcher, h) >= strategy.calculateDeposit(researcher, h));
    }
}

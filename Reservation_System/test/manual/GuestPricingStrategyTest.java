package manual;

import factory.AccountFactory;
import model.User;
import strategy.GuestPricingStrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class GuestPricingStrategyTest {

    private GuestPricingStrategy strategy;
    private User guest;

    @BeforeEach
    void setUp() {
        strategy = new GuestPricingStrategy();
        guest = AccountFactory.createUser("guest", "gst-strat@y.ca", "p", "G1");
    }

    @Test
    void hourlyRate_isTwentyFive() {
        assertEquals(25.0, strategy.calculateHourlyRate(guest), 0.001);
    }

    @Test
    void deposit_underOneHour_scaled() {
        assertEquals(12.5, strategy.calculateDeposit(guest, 0.5), 0.001);
    }

    @Test
    void deposit_oneHour_flatTwentyFive() {
        assertEquals(25.0, strategy.calculateDeposit(guest, 1.0), 0.001);
    }

    @Test
    void deposit_manyHours_flatTwentyFive() {
        assertEquals(25.0, strategy.calculateDeposit(guest, 8.0), 0.001);
    }

    @Test
    void total_twoHours_fifty() {
        assertEquals(50.0, strategy.calculateTotal(guest, 2.0), 0.001);
    }

    @Test
    void total_zero_zero() {
        assertEquals(0.0, strategy.calculateTotal(guest, 0.0), 0.001);
    }

    @Test
    void total_pointOneHours() {
        assertEquals(2.5, strategy.calculateTotal(guest, 0.1), 0.001);
    }

    @Test
    void deposit_zero_zero() {
        assertEquals(0.0, strategy.calculateDeposit(guest, 0.0), 0.001);
    }

    @Test
    void sameRateForTwoGuests() {
        User g2 = AccountFactory.createUser("guest", "g2@y.ca", "p", "G2");
        assertEquals(strategy.calculateHourlyRate(guest), strategy.calculateHourlyRate(g2), 0.001);
    }

    @Test
    void total_largeHours() {
        assertEquals(2500.0, strategy.calculateTotal(guest, 100.0), 0.001);
    }
}

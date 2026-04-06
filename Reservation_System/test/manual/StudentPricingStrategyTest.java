package manual;

import factory.AccountFactory;
import model.User;
import strategy.StudentPricingStrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentPricingStrategyTest {

    private StudentPricingStrategy strategy;
    private User student;

    @BeforeEach
    void setUp() {
        strategy = new StudentPricingStrategy();
        student = AccountFactory.createUser("student", "stu-strat@y.ca", "p", "S1");
    }

    @Test
    void hourlyRate_isTen() {
        assertEquals(10.0, strategy.calculateHourlyRate(student), 0.001);
    }

    @Test
    void deposit_underOneHour_scaled() {
        assertEquals(5.0, strategy.calculateDeposit(student, 0.5), 0.001);
    }

    @Test
    void deposit_oneHour_flatTen() {
        assertEquals(10.0, strategy.calculateDeposit(student, 1.0), 0.001);
    }

    @Test
    void deposit_overOneHour_flatTen() {
        assertEquals(10.0, strategy.calculateDeposit(student, 3.0), 0.001);
    }

    @Test
    void total_twoHours_twenty() {
        assertEquals(20.0, strategy.calculateTotal(student, 2.0), 0.001);
    }

    @Test
    void total_zero_zero() {
        assertEquals(0.0, strategy.calculateTotal(student, 0.0), 0.001);
    }

    @Test
    void total_fractionalHours() {
        assertEquals(15.0, strategy.calculateTotal(student, 1.5), 0.001);
    }

    @Test
    void deposit_zeroHours_zero() {
        assertEquals(0.0, strategy.calculateDeposit(student, 0.0), 0.001);
    }

    @Test
    void hourlyRate_sameForDifferentStudents() {
        User s2 = AccountFactory.createUser("student", "s2@y.ca", "p", "S2");
        assertEquals(strategy.calculateHourlyRate(student), strategy.calculateHourlyRate(s2), 0.001);
    }

    @Test
    void totalGreaterOrEqualDeposit_shortBooking() {
        double h = 0.4;
        assertTrue(strategy.calculateTotal(student, h) >= strategy.calculateDeposit(student, h));
    }
}

package strategy;

import model.User;

public class StudentPricingStrategy implements PricingStrategy {

    @Override
    public double calculateHourlyRate(User user) {
        return 10.0;
    }

    @Override
    public double calculateDeposit(User user, double hours) {
        return 5.0 * hours;
    }

    @Override
    public double calculateTotal(User user, double hours) {
        double rate = calculateHourlyRate(user);
        return rate * hours + calculateDeposit(user, hours);
    }
}
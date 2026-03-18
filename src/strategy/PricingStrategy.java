package strategy;

import model.User;

public interface PricingStrategy {
    double calculateHourlyRate(User user);
    double calculateDeposit(User user, double hours);
    double calculateTotal(User user, double hours);
}
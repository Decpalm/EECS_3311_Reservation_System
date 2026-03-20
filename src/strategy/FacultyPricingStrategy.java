package strategy;

import model.User;

public class FacultyPricingStrategy implements PricingStrategy {

    @Override
    public double calculateHourlyRate(User user) {
        return 20.0;
    }

    @Override
    public double calculateDeposit(User user, double hours) {
    	double rate = calculateHourlyRate(user);
    	if (hours < 1) {
    		return hours * rate;
    	}
    	else {
    		return rate;
    	}
    }

    @Override
    public double calculateTotal(User user, double hours) {
        double rate = calculateHourlyRate(user);
        return rate * hours;
    }
}
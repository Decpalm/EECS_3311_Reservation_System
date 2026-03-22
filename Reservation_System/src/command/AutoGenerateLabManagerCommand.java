package command;

import app.ReservationSystem;
import model.User;

public class AutoGenerateLabManagerCommand implements Command{
	private ReservationSystem reservationSystem;
    private User user;
    private String password;
    private String email;
	
	public AutoGenerateLabManagerCommand(ReservationSystem reservationSystem, 
										 User user, String password, String email) {
		this.reservationSystem = reservationSystem;
        this.user = user;
        this.password = password;
        this.email = email;
	}
	
	@Override
	public void execute() {
		reservationSystem.autoGenerateLabManager(user, password, email);
	}

}

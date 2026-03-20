package command;

import app.ReservationSystem;
import model.User;

public class updateIdOrCertCommand implements Command{
	private ReservationSystem reservationSystem;
    private User user;
    private String password;
    private String idOrCert;

    public updateIdOrCertCommand(ReservationSystem reservationSystem, User user, String password, String idOrCert) {
        this.reservationSystem = reservationSystem;
        this.user = user;
        this.password = password;
        this.idOrCert = idOrCert;
    }

    @Override
    public void execute() {
        reservationSystem.updateIdOrCert(user, password, idOrCert);
    }

}

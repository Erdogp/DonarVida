package pe.edu.upc.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ReservaCitas")
public class Reservar_Cita implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CCita;
	private Date DCita;
	private Date DReservaCita;
	
	@ManyToOne
	@JoinColumn(name = "NUser", nullable = false)
	private User NUser;
	
	@ManyToOne
	@JoinColumn(name = "CHospital", nullable = false)
	private Hospital CHospital;

	public Reservar_Cita() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservar_Cita(int cCita, Date dCita, Date dReservaCita, User nUser, Hospital cHospital) {
		super();
		CCita = cCita;
		DCita = dCita;
		DReservaCita = dReservaCita;
		NUser = nUser;
		CHospital = cHospital;
	}

	public int getCCita() {
		return CCita;
	}

	public void setCCita(int cCita) {
		CCita = cCita;
	}

	public Date getDCita() {
		return DCita;
	}

	public void setDCita(Date dCita) {
		DCita = dCita;
	}

	public Date getDReservaCita() {
		return DReservaCita;
	}

	public void setDReservaCita(Date dReservaCita) {
		DReservaCita = dReservaCita;
	}

	public User getNUser() {
		return NUser;
	}

	public void setNUser(User nUser) {
		NUser = nUser;
	}

	public Hospital getCHospital() {
		return CHospital;
	}

	public void setCHospital(Hospital cHospital) {
		CHospital = cHospital;
	}
	
	
}

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
	@JoinColumn(name = "CUser", nullable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "CHospital", nullable = false)
	private Hospital hospital;

	public Reservar_Cita() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservar_Cita(int cCita, Date dCita, Date dReservaCita, User user, Hospital hospital) {
		super();
		CCita = cCita;
		DCita = dCita;
		DReservaCita = dReservaCita;
		this.user = user;
		this.hospital = hospital;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}


	
}

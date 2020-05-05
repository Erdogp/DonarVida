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
@Table(name="Users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String NUser;
	
	@Column(name = "NContra", nullable = false, length = 20)
	private String NContra;
	
	private Date DCreacion;
	
	@Column(name = "TEmail", nullable = false, length = 40)
	private String TEmail;
	
	@ManyToOne
	@JoinColumn(name = "CDonante", nullable = false)
	private Donante CDonante;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String nUser, String nContra, Date dCreacion, String tEmail, Donante cDonante) {
		super();
		NUser = nUser;
		NContra = nContra;
		DCreacion = dCreacion;
		TEmail = tEmail;
		CDonante = cDonante;
	}

	public String getNUser() {
		return NUser;
	}

	public void setNUser(String nUser) {
		NUser = nUser;
	}

	public String getNContra() {
		return NContra;
	}

	public void setNContra(String nContra) {
		NContra = nContra;
	}

	public Date getDCreacion() {
		return DCreacion;
	}

	public void setDCreacion(Date dCreacion) {
		DCreacion = dCreacion;
	}

	public String getTEmail() {
		return TEmail;
	}

	public void setTEmail(String tEmail) {
		TEmail = tEmail;
	}

	public Donante getCDonante() {
		return CDonante;
	}

	public void setCDonante(Donante cDonante) {
		CDonante = cDonante;
	}
	
	
}

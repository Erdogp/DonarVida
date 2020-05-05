package pe.edu.upc.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int CUser;
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "CDonante", nullable = false)
	private Donante donante;
	
	@Column(name = "NContra", nullable = false, length = 20)
	private String NContra;
	
	private Date DCreacion;
	
	@Column(name = "TEmail", nullable = false, length = 40)
	private String TEmail;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
	private Ficha ficha;
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(int cUser, Donante donante, String nContra, Date dCreacion, String tEmail) {
		super();
		CUser = cUser;
		this.donante = donante;
		NContra = nContra;
		DCreacion = dCreacion;
		TEmail = tEmail;
	}



	public int getCUser() {
		return CUser;
	}



	public void setCUser(int cUser) {
		CUser = cUser;
	}



	public Donante getDonante() {
		return donante;
	}



	public void setDonante(Donante donante) {
		this.donante = donante;
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

	
	
}

package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Donantes")
public class Donante implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CDonante;
	
	@Column(name = "NNombres", nullable = false, length = 20)
	private String NNombres;
	
	@Column(name = "NApellidos", nullable = false, length = 20)
	private String NApellidos;
	
	@Column(name = "TTiposangr", nullable = false, length = 5)
	private String TTiposangr;
	
	@Column(name = "TDireccion", nullable = false, length = 20)
	private String TDireccion;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "donante")
	private User user;
	
	private Date FNacimiento;
	private int CDNI;
	
	//constructores
	public Donante() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Donante(int cDonante, String nNombres, String nApellidos, String tTiposangr, String tDireccion,
			Date fNacimiento, int cDNI) {
		super();
		CDonante = cDonante;
		NNombres = nNombres;
		NApellidos = nApellidos;
		TTiposangr = tTiposangr;
		TDireccion = tDireccion;
		FNacimiento = fNacimiento;
		CDNI = cDNI;
	}

	//getters y setters
	
	public int getCDonante() {
		return CDonante;
	}

	public void setCDonante(int cDonante) {
		CDonante = cDonante;
	}

	public String getNNombres() {
		return NNombres;
	}

	public void setNNombres(String nNombres) {
		NNombres = nNombres;
	}

	public String getNApellidos() {
		return NApellidos;
	}

	public void setNApellidos(String nApellidos) {
		NApellidos = nApellidos;
	}

	public String getTTiposangr() {
		return TTiposangr;
	}

	public void setTTiposangr(String tTiposangr) {
		TTiposangr = tTiposangr;
	}

	public String getTDireccion() {
		return TDireccion;
	}

	public void setTDireccion(String tDireccion) {
		TDireccion = tDireccion;
	}

	public Date getFNacimiento() {
		return FNacimiento;
	}

	public void setFNacimiento(Date fNacimiento) {
		FNacimiento = fNacimiento;
	}

	public int getCDNI() {
		return CDNI;
	}

	public void setCDNI(int cDNI) {
		CDNI = cDNI;
	}
	
}

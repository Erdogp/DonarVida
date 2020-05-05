package pe.edu.upc.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hospitales")
public class Hospital implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CHospital;
	
	@Column(name = "NHospital", nullable = false, length = 40)
	private String NHospital;
	@Column(name = "TDireccionH", nullable = false, length = 40)
	private String TDireccionH;
	private int NumTelefon;
	private Date DApertura;
	private Date DCierre;
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(int cHospital, String nHospital, String tDireccionH, int numTelefon, Date dApertura, Date dCierre) {
		super();
		CHospital = cHospital;
		NHospital = nHospital;
		TDireccionH = tDireccionH;
		NumTelefon = numTelefon;
		DApertura = dApertura;
		DCierre = dCierre;
	}
	public int getCHospital() {
		return CHospital;
	}
	public void setCHospital(int cHospital) {
		CHospital = cHospital;
	}
	public String getNHospital() {
		return NHospital;
	}
	public void setNHospital(String nHospital) {
		NHospital = nHospital;
	}
	public String getTDireccionH() {
		return TDireccionH;
	}
	public void setTDireccionH(String tDireccionH) {
		TDireccionH = tDireccionH;
	}
	public int getNumTelefon() {
		return NumTelefon;
	}
	public void setNumTelefon(int numTelefon) {
		NumTelefon = numTelefon;
	}
	public Date getDApertura() {
		return DApertura;
	}
	public void setDApertura(Date dApertura) {
		DApertura = dApertura;
	}
	public Date getDCierre() {
		return DCierre;
	}
	public void setDCierre(Date dCierre) {
		DCierre = dCierre;
	}
	
	
}

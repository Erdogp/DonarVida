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
@Table(name = "LicenciadoLaboratorios")
public class Licenciado_Laboratorio implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CLicLab;
	
	@Column(name = "NNombreLicLab", nullable = false, length = 20)
	private String NNombreLicLab;
	
	@Column(name = "NApellidoLicLab", nullable = false, length = 20)
	private String NApellidoLicLab;

	private int NumTelefono;
	
	@ManyToOne
	@JoinColumn(name = "CHospital", nullable = false)
	private Hospital CHospital;

	public Licenciado_Laboratorio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Licenciado_Laboratorio(int cLicLab, String nNombreLicLab, String nApellidoLicLab, int numTelefono,
			Hospital cHospital) {
		super();
		CLicLab = cLicLab;
		NNombreLicLab = nNombreLicLab;
		NApellidoLicLab = nApellidoLicLab;
		NumTelefono = numTelefono;
		CHospital = cHospital;
	}

	public int getCLicLab() {
		return CLicLab;
	}

	public void setCLicLab(int cLicLab) {
		CLicLab = cLicLab;
	}

	public String getNNombreLicLab() {
		return NNombreLicLab;
	}

	public void setNNombreLicLab(String nNombreLicLab) {
		NNombreLicLab = nNombreLicLab;
	}

	public String getNApellidoLicLab() {
		return NApellidoLicLab;
	}

	public void setNApellidoLicLab(String nApellidoLicLab) {
		NApellidoLicLab = nApellidoLicLab;
	}

	public int getNumTelefono() {
		return NumTelefono;
	}

	public void setNumTelefono(int numTelefono) {
		NumTelefono = numTelefono;
	}

	public Hospital getCHospital() {
		return CHospital;
	}

	public void setCHospital(Hospital cHospital) {
		CHospital = cHospital;
	}
	
	
}

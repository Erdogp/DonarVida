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
@Table(name = "Fichas")
public class Ficha implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CFicha;
	
	@ManyToOne
	@JoinColumn(name = "NUser", nullable = false)
	private User NUser;
	
	private int BETS;
	private int QHemoglobina;
	private int BApto;
	
	@ManyToOne
	@JoinColumn(name = "CLicLab", nullable = false)
	private Licenciado_Laboratorio CLicLab;
	
	@Column(name = "TTipoSangre", nullable = false, length = 5)
	private String TTipoSangre;

	public Ficha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ficha(int cFicha, User nUser, int bETS, int qHemoglobina, int bApto, Licenciado_Laboratorio cLicLab,
			String tTipoSangre) {
		super();
		CFicha = cFicha;
		NUser = nUser;
		BETS = bETS;
		QHemoglobina = qHemoglobina;
		BApto = bApto;
		CLicLab = cLicLab;
		TTipoSangre = tTipoSangre;
	}

	public int getCFicha() {
		return CFicha;
	}

	public void setCFicha(int cFicha) {
		CFicha = cFicha;
	}

	public User getNUser() {
		return NUser;
	}

	public void setNUser(User nUser) {
		NUser = nUser;
	}

	public int getBETS() {
		return BETS;
	}

	public void setBETS(int bETS) {
		BETS = bETS;
	}

	public int getQHemoglobina() {
		return QHemoglobina;
	}

	public void setQHemoglobina(int qHemoglobina) {
		QHemoglobina = qHemoglobina;
	}

	public int getBApto() {
		return BApto;
	}

	public void setBApto(int bApto) {
		BApto = bApto;
	}

	public Licenciado_Laboratorio getCLicLab() {
		return CLicLab;
	}

	public void setCLicLab(Licenciado_Laboratorio cLicLab) {
		CLicLab = cLicLab;
	}

	public String getTTipoSangre() {
		return TTipoSangre;
	}

	public void setTTipoSangre(String tTipoSangre) {
		TTipoSangre = tTipoSangre;
	}
	
}

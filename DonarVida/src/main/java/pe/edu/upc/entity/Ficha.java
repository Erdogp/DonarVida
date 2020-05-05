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
@Table(name = "Fichas")
public class Ficha implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private int CFicha;
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "CUser", nullable = false)
	private User user;
	
	private int BETS;
	private int QHemoglobina;
	private int BApto;
	
	@ManyToOne
	@JoinColumn(name = "CLicLab", nullable = false)
	private Licenciado_Laboratorio licenciado;
	
	@Column(name = "TTipoSangre", nullable = false, length = 5)
	private String TTipoSangre;

	public Ficha() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Ficha(int cFicha, User user, int bETS, int qHemoglobina, int bApto, Licenciado_Laboratorio licenciado,
			String tTipoSangre) {
		super();
		CFicha = cFicha;
		this.user = user;
		BETS = bETS;
		QHemoglobina = qHemoglobina;
		BApto = bApto;
		this.licenciado = licenciado;
		TTipoSangre = tTipoSangre;
	}

	public int getCFicha() {
		return CFicha;
	}

	public void setCFicha(int cFicha) {
		CFicha = cFicha;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public Licenciado_Laboratorio getLicenciado() {
		return licenciado;
	}

	public void setLicenciado(Licenciado_Laboratorio licenciado) {
		this.licenciado = licenciado;
	}

	public String getTTipoSangre() {
		return TTipoSangre;
	}

	public void setTTipoSangre(String tTipoSangre) {
		TTipoSangre = tTipoSangre;
	}


	
}

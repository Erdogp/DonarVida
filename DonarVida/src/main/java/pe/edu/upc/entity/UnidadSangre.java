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
@Table(name="UnidadesSangre")
public class UnidadSangre implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CUnidad;
	
	private Date DFechaVencimiento;
	private int NumLote;
	
	
	public UnidadSangre() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UnidadSangre(int cUnidad, Date dFechaVencimiento, int numLote) {
		super();
		CUnidad = cUnidad;
		DFechaVencimiento = dFechaVencimiento;
		NumLote = numLote;
	}


	public int getCUnidad() {
		return CUnidad;
	}


	public void setCUnidad(int cUnidad) {
		CUnidad = cUnidad;
	}


	public Date getDFechaVencimiento() {
		return DFechaVencimiento;
	}


	public void setDFechaVencimiento(Date dFechaVencimiento) {
		DFechaVencimiento = dFechaVencimiento;
	}


	public int getNumLote() {
		return NumLote;
	}


	public void setNumLote(int numLote) {
		NumLote = numLote;
	}
	
	
}

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
@Table(name="Donaciones")
public class Donacion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "CCita", nullable = false)
	private Reservar_Cita cita;

	@ManyToOne
	@JoinColumn(name = "CUnidad", nullable = false)
	private UnidadSangre unidad;
	
	private Date DDonacion;

	public Donacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Donacion(Reservar_Cita cita, UnidadSangre unidad, Date dDonacion) {
		super();
		this.cita = cita;
		this.unidad = unidad;
		DDonacion = dDonacion;
	}

	public Reservar_Cita getCita() {
		return cita;
	}

	public void setCita(Reservar_Cita cita) {
		this.cita = cita;
	}

	public UnidadSangre getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadSangre unidad) {
		this.unidad = unidad;
	}

	public Date getDDonacion() {
		return DDonacion;
	}

	public void setDDonacion(Date dDonacion) {
		DDonacion = dDonacion;
	}


}

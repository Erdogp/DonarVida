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

	@ManyToOne
	@JoinColumn(name = "CCita", nullable = false)
	private Reservar_Cita CCita;
	
	@ManyToOne
	@JoinColumn(name = "CUnidad", nullable = false)
	private UnidadSangre CUnidad;
	
	private Date DDonacion;

	public Donacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donacion(Reservar_Cita cCita, UnidadSangre cUnidad, Date dDonacion) {
		super();
		CCita = cCita;
		CUnidad = cUnidad;
		DDonacion = dDonacion;
	}

	public Reservar_Cita getCCita() {
		return CCita;
	}

	public void setCCita(Reservar_Cita cCita) {
		CCita = cCita;
	}

	public UnidadSangre getCUnidad() {
		return CUnidad;
	}

	public void setCUnidad(UnidadSangre cUnidad) {
		CUnidad = cUnidad;
	}

	public Date getDDonacion() {
		return DDonacion;
	}

	public void setDDonacion(Date dDonacion) {
		DDonacion = dDonacion;
	}
	
}

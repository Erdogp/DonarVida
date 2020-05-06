package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Hospital;
import pe.edu.upc.serviceinterface.IHospitalService;
@Named
@RequestScoped
public class HospitalController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IHospitalService ihospitalserv;
	
	private String mensaje;
	private Hospital ehospital;
	List<Hospital> listahospital;
	
	// constructor
		@PostConstruct
		public void init() {
			this.listahospital = new ArrayList<Hospital>();
			this.ehospital = new Hospital();
			this.list();
		}
		
		// Metodos
		public String newHospital() {
			this.setEhospital(new Hospital());
			return "type.xhtml";  //xhtml de los hospitales
		}
		
		public void insert() {
			try {
				ihospitalserv.insert(ehospital);
				this.init();
				this.list();
			} catch (Exception e) {
				e.getMessage();
			}
		}
	
		public void list() {
			try {
				listahospital = ihospitalserv.list();
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
		public void delete(Hospital ti) {
			try {
				ihospitalserv.delete(ti.getCHospital());
				list();
				mensaje = "se eliminó correctamente";
			} catch (Exception e) {
				e.getMessage();
				mensaje = "No se eliminó";

			}
		}
		//gette rsetter
		public String getMensaje() {
			return mensaje;
		}

		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}

		public Hospital getEhospital() {
			return ehospital;
		}

		public void setEhospital(Hospital ehospital) {
			this.ehospital = ehospital;
		}

		public List<Hospital> getListahospital() {
			return listahospital;
		}

		public void setListahospital(List<Hospital> listahospital) {
			this.listahospital = listahospital;
		}	
	
	
}

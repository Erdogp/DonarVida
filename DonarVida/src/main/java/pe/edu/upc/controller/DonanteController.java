package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Donante;
import pe.edu.upc.entity.Hospital;
import pe.edu.upc.serviceinterface.IDonanteService;

@Named
@RequestScoped
public class DonanteController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDonanteService idonanteserv;
	private String mensaje;
	private Donante edonante;
	List<Donante> listadonante;
			// constructor
			@PostConstruct
			public void init() {
				this.listadonante = new ArrayList<Donante>();
				this.edonante = new Donante();
				this.list();
			}
			
			// Metodos
			public String newDonante() {
				this.setEdonante(edonante);
				return "Registro-Usuarios.xhtml";  //xhtml de los hospitales
			}
			
			public void insert() {
				try {
					idonanteserv.insert(edonante);
					this.init();
					this.list();
				} catch (Exception e) {
					e.getMessage();
				}
			}
		
			public void list() {
				try {
					listadonante = idonanteserv.list();
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			public void delete(Donante ti) {
				try {
					idonanteserv.delete(ti.getCDonante());
					list();
					mensaje = "se eliminó correctamente";
				} catch (Exception e) {
					e.getMessage();
					mensaje = "No se eliminó";

				}
			}
			
			
			//getters y setters
			
			public String getMensaje() {
				return mensaje;
			}
			public void setMensaje(String mensaje) {
				this.mensaje = mensaje;
			}
			public Donante getEdonante() {
				return edonante;
			}
			public void setEdonante(Donante edonante) {
				this.edonante = edonante;
			}
			public List<Donante> getListadonante() {
				return listadonante;
			}
			public void setListadonante(List<Donante> listadonante) {
				this.listadonante = listadonante;
			}
			

	
}

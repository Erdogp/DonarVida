package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Donacion;

public interface IDonacionService {
	public void insert(Donacion donacion);

	public List<Donacion> list();

	public List<Donacion> finByNameInfectiousAgent(Donacion ia);


}

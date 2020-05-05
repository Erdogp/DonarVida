package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Donacion;

public interface IDonacionDao {
	
	public void insert(Donacion donacion);

	public List<Donacion> list();

	public List<Donacion> finByNameInfectiousAgent(Donacion ia);


}

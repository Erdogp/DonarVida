package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Reservar_Cita;

public interface IReservaDao {
	public void insert(Reservar_Cita cita);

	public List<Reservar_Cita> list();

	public void delete(int CCita);

	public List<Reservar_Cita> finByNameInfectiousAgent(Reservar_Cita ia);

}

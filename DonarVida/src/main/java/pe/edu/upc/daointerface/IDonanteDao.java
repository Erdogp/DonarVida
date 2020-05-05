package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Donante;

public interface IDonanteDao {
	public void insert(Donante donante);

	public List<Donante> list();

	public void delete(int CDonante);

	public List<Donante> finByNameDonante(Donante ia);

	public void modificar(Donante ia);
}

package pe.edu.upc.serviceinterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.Donante;

public interface IDonanteService {
	public void insert(Donante donante);

	public void modificar(Donante ia);

	public void delete(int CDonante);
	
	public List<Donante> list();

	public List<Donante> finByNameDonante(Donante ia);

	Optional<Donante> findByDNI(Donante donante) throws Exception;
}

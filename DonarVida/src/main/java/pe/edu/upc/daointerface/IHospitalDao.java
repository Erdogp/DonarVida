package pe.edu.upc.daointerface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.Hospital;

public interface IHospitalDao {
	
	public void insert(Hospital hospital);

	public List<Hospital> list();

	public void delete(int CHospital);

	public List<Hospital> finByNameHospital(Hospital ia);

	public void editar(Hospital ia);
	
	Optional<Hospital> findById(Hospital hospital) throws Exception;
}

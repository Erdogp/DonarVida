package pe.edu.upc.serviceinterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.Hospital;

public interface IHospitalService {
	
	public void insert(Hospital hospital);
	public void editar(Hospital ia);
	public void delete(int CHospital);
	
	public List<Hospital> list();
	public List<Hospital> finByNameHospital(Hospital ia);
	Optional<Hospital> findById(Hospital hospital) throws Exception;
}

package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IHospitalDao;
import pe.edu.upc.entity.Hospital;
import pe.edu.upc.serviceinterface.IHospitalService;

@Named
@RequestScoped
public class HospitalServiceImpl  implements IHospitalService, Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject
	private IHospitalDao cD;
	@Override
	public void insert(Hospital hospital) {
		// TODO Auto-generated method stub
		try {
			cD.insert(hospital);

		} catch (Exception e) {
			System.out.println("Error en el service al insertar un infectious agent");
		}
	}

	@Override
	public void editar(Hospital ia) {
		// TODO Auto-generated method stub
		cD.editar(ia);
	}

	@Override
	public void delete(int CHospital) {
		// TODO Auto-generated method stub
		cD.delete(CHospital);
	}

	@Override
	public List<Hospital> list() {
		// TODO Auto-generated method stub
		return cD.list();
	}

	@Override
	public List<Hospital> finByNameHospital(Hospital ia) {
		// TODO Auto-generated method stub
		return cD.finByNameHospital(ia);
	}

	@Override
	public Optional<Hospital> findById(Hospital hospital) throws Exception {
		// TODO Auto-generated method stub
		return cD.findById(hospital);
	}

}

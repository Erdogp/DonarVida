package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IDonanteDao;
import pe.edu.upc.entity.Donante;
import pe.edu.upc.serviceinterface.IDonanteService;

@Named
@RequestScoped
public class DonanteServiceImpl implements  IDonanteService, Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private IDonanteDao cD;
	
	@Override
	public void insert(Donante donante) {
		// TODO Auto-generated method stub
		try {
			cD.insert(donante);

		} catch (Exception e) {
			System.out.println("Error en el service al insertar un infectious agent");
		}
	}

	@Override
	public void modificar(Donante ia) {
		// TODO Auto-generated method stub
		cD.modificar(ia);
	}

	@Override
	public void delete(int CDonante) {
		// TODO Auto-generated method stub
		cD.delete(CDonante);
	}

	@Override
	public List<Donante> list() {
		// TODO Auto-generated method stub
		return cD.list();
	}

	@Override
	public List<Donante> finByNameDonante(Donante ia) {
		// TODO Auto-generated method stub
		return cD.finByNameDonante(ia);
	}

	@Override
	public Optional<Donante> findByDNI(Donante donante) throws Exception {
		// TODO Auto-generated method stub
		return cD.findByDNI(donante);
	}

	
}

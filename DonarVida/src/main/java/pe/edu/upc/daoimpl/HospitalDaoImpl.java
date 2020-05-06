package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IHospitalDao;
import pe.edu.upc.entity.Hospital;


public class HospitalDaoImpl implements IHospitalDao, Serializable{
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "donavida")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Hospital hospital) {
		// TODO Auto-generated method stub
		try {
			em.persist(hospital);
		} catch (Exception e) {
			System.out.println("Error insert DAOImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hospital> list() {
		// TODO Auto-generated method stub
		List<Hospital> lista = new ArrayList<Hospital>();
		try {
			Query q = em.createQuery("select i from Hospitales i");
			lista = (List<Hospital>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar DAOImpl");
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void delete(int chospital) {
		// TODO Auto-generated method stub
		Hospital ia = new Hospital();
		try {
			ia = em.getReference(Hospital.class, chospital);
			em.remove(ia);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Hospital> finByNameHospital(Hospital ia) {
		// TODO Auto-generated method stub
		List<Hospital> lista = new ArrayList<Hospital>();
		try {
			Query q = em.createQuery("from Hospitales i where i.NHospital like ?1");
			q.setParameter(1, "%" + ia.getNHospital() + "%");
			lista = (List<Hospital>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void editar(Hospital ia) {
		// TODO Auto-generated method stub
		try {
			em.merge(ia);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Optional<Hospital> findById(Hospital hospital) throws Exception {
		// TODO Auto-generated method stub
		Hospital HospitalFound = new Hospital();

		List<Hospital> Hospitals = new ArrayList<Hospital>();
		Query q = em.createQuery("FROM Hospitales c where c.chospital = ?1");
		q.setParameter(1, hospital.getCHospital());

		Hospitals = (List<Hospital>) q.getResultList();

		if (Hospitals != null && !Hospitals.isEmpty()) {
			HospitalFound = Hospitals.get(0);
		}

		return Optional.of(HospitalFound);
	}

	
	
}

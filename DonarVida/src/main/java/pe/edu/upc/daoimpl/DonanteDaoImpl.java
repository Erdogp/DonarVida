package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IDonanteDao;
import pe.edu.upc.entity.Donante;



public class DonanteDaoImpl implements IDonanteDao, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "DonarVida")
	private EntityManager em;

	@Transactional
	public void insert(Donante donante) {
		try {
			em.persist(donante);
		} catch (Exception e) {
			System.out.println("Error insert DAOImpl");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Donante> list() {
		List<Donante> lista = new ArrayList<Donante>();
		try {
			Query q = em.createQuery("select i from Donantes i");
			lista = (List<Donante>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar DAOImpl");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idDonante) {
		Donante ia = new Donante();
		try {
			ia = em.getReference(Donante.class, idDonante);
			em.remove(ia);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Donante> finByNameDonante(Donante ia) {
		List<Donante> lista = new ArrayList<Donante>();
		try {
			Query q = em.createQuery("from Donantes i where i.NNombres like ?1");
			q.setParameter(1, "%" + ia.getNNombres() + "%");
			lista = (List<Donante>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void modificar(Donante ia) {
		try {
			em.merge(ia);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Optional<Donante> findByDNI(Donante donante) throws Exception {
		// TODO Auto-generated method stub
		Donante encontrado= new Donante();
		List<Donante> donantes = new ArrayList<Donante>();
		Query q= em.createQuery("From Donantes s where s.cdni = ?1");
		q.setParameter(1,donante.getCDNI());
		if (donantes != null && !donantes.isEmpty()) {
			encontrado = donantes.get(0);
		}

		return Optional.of(encontrado);
	}
}

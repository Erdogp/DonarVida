package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IDonanteDao;
import pe.edu.upc.entity.Donante;



public class DonanteDaoImpl implements IDonanteDao, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "donaVida")
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
			Query q = em.createQuery("select i from Donante i");
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
			Query q = em.createQuery("from Donante i where i.descriptionDonantes like ?1");
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
}

package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IUserDao;
import pe.edu.upc.entity.User;

public class UserDaoImpl /*implements IUserDao, Serializable*/{
/*
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "DonarVida")
	private EntityManager em;

	@Transactional
	public void insert(User user) {
		try {
			em.persist(user);
		} catch (Exception e) {
			System.out.println("Error insert DAOImpl");
		}
	}

	@SuppressWarnings("unchecked")
	public List<User> list() {
		List<User> lista = new ArrayList<User>();
		try {
			Query q = em.createQuery("select i from User i");
			lista = (List<User>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar DAOImpl");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idUser) {
		User ia = new User();
		try {
			ia = em.getReference(User.class, idUser);
			em.remove(ia);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	

	@Transactional
	@Override
	public void modificar(User ia) {
		try {
			em.merge(ia);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}*/
}

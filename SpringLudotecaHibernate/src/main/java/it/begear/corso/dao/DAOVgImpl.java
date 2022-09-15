
package it.begear.corso.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import it.begear.corso.entity.Videogioco;

public class DAOVgImpl implements DAOVg {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void create(Videogioco vg) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(vg);
		tx.commit();
		session.close();
	}

	@Override
	public List<Videogioco> read() {
		Session session = this.sessionFactory.openSession();
		List<Videogioco> vgList = session.createQuery("from Videogioco").list();
		session.close();
		return vgList;
	}

	@Override
	public void update(Videogioco vg, int id) {
		System.out.println("Update");
	}

	@Override
	public void delete(List<Integer> idList) {
		System.out.println("delete");
	}

}

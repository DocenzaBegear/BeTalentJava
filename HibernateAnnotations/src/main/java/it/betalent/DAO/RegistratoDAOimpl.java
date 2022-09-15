package it.betalent.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import it.betalent.entity.Registrato;
import it.betalent.utility.Utility;

public class RegistratoDAOimpl implements RegistratoDAO {
	
	static Utility utility;
	
	public List<Registrato> read() {
		Session session = Utility.getSessionFactory().openSession();
		List<Registrato> registrati = session.createQuery("FROM Registrato").list();
		session.close();
		System.out.println("Trovati " + registrati.size() + " registrati");
		return registrati;
	}
	
	public Integer create(Registrato e) {
		Session session = Utility.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();
		System.out.println("Creazione riuscita di  " + e.toString());
		return e.getId();
	}
	
	public void update(Registrato reg) {
		Session session = Utility.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(reg);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully updated " + reg.toString());
	}
	
	public void delete(Integer id) {
		Session session = Utility.getSessionFactory().openSession();
		session.beginTransaction();
		Registrato e = findByID(id);
		session.delete(e);
		session.getTransaction().commit();
		session.close();
		System.out.println("Registrato cancellato " + e.toString());
	}
	
	public Registrato findByID(Integer id) {
		Session session = Utility.getSessionFactory().openSession();
		Registrato reg = session.get(Registrato.class, id);
		session.close();
		return reg;
	}
	
	public void deleteAll() {
		Session session = Utility.getSessionFactory().openSession();
		session.beginTransaction();
		Query<Registrato> query = session.createQuery("DELETE FROM Registrato");
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		System.out.println("Tutti i registrati sono stati cancellati.");
	}
	
	public List<Registrato> trovaMaschi() {
		Session session = Utility.getSessionFactory().openSession();
		session.beginTransaction();
		List<Registrato> registrati = session.createQuery("FROM Registrato R WHERE R.sesso = 'Maschio'").list();
		session.getTransaction().commit();
		session.close();
		System.out.println("Tutti i maschi della tabella: ");
		return registrati;
	}
	
}

package it.betalent.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.query.Query;

import it.betalent.DAO.RegistratoDAOimpl;
import it.betalent.entity.Mansione;
import it.betalent.entity.Registrato;
import it.betalent.utility.Utility;

public class Main {

	public static void main(String[] args) {
		
		RegistratoDAOimpl regiDAO = new RegistratoDAOimpl();
		
		Registrato reg01 = new Registrato("Human", "Similaun", "Maschio");
		Registrato reg02 = new Registrato("Jenna", "Perk", "Femmina");

		System.out.println("--- CREAZIONE (CREATE) ---");
		regiDAO.create(reg01);
		regiDAO.create(reg02);
		System.out.println("--- LETTURA (READ) ---");
		List<Registrato> reglist1 = regiDAO.read();
		for(Registrato reg: reglist1) {
			System.out.println(reg.toString());
		}
		System.out.println("--- MODIFICA (UPDATE) ---");
		Registrato modifica = regiDAO.findByID(2);
		modifica.setNome("Carlo");
		modifica.setCognome("Notto");
		regiDAO.update(modifica);
		
		Registrato persist = new Registrato("Andrew", "Ryan", "maschio");
		regiDAO.update(persist);
		
		System.out.println("--- LETTURA (READ) ---");
		List<Registrato> reglist3 = regiDAO.read();
		for(Registrato reg: reglist3) {
			System.out.println(reg.toString());
		}
		System.out.println("--- CANCELLAZIONE (DELETE) ---");
		regiDAO.delete(reg02.getId());
		System.out.println("--- LETTURA (READ) ---");
		List<Registrato> reglist4 = regiDAO.read();
		for(Registrato reg: reglist4) {
			System.out.println(reg.toString());
		}
		System.out.println("--- TROVA MASCHI ---");
		List<Registrato> reglist5 = regiDAO.trovaMaschi();
		for(Registrato reg: reglist5) {
			System.out.println(reg.toString());
		}
		System.out.println("--- CANCELLA TUTTO ---");
		//regiDAO.deleteAll();
		System.out.println("--- LETTURA (READ) ---");
		List<Registrato> reglist6 = regiDAO.read();
		for(Registrato reg: reglist6) {
			System.out.println(reg.toString());
		}
		System.out.println("--- JOIN ---");
		Query join= Utility.getSessionFactory().openSession().createQuery("select R.nome, M.mansione from Registrato R left join R.mansioni M");
		                                                                 		
		List<Mansione> listaMansioni = join.list();
        
		Iterator iter=listaMansioni.iterator();
		
		while(iter.hasNext())
        {
            Object tupla[] = (Object[])iter.next();
            System.out.println(tupla[0]+ " -- " +tupla[1]);
        }
        
	}















}

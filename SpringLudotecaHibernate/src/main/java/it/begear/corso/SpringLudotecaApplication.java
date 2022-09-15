
package it.begear.corso;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.begear.corso.dao.DAOVgImpl;
import it.begear.corso.entity.Videogioco;

public class SpringLudotecaApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		DAOVgImpl DAOVgImpl = (DAOVgImpl) context.getBean("DAOvgImpl");  //getBean(DAOVgImpl.class) senza castare
		
		Videogioco vg1 = new Videogioco();
		vg1.setTitolo("Darq"); vg1.setGenere("Puzzle"); vg1.setLongevita(5); vg1.setCompletato(false);
		
		DAOVgImpl.create(vg1);
		
		System.out.println("Videogioco:"+vg1);
		
		//close resources
		context.close();
	}
}
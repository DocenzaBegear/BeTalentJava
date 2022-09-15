package it.begear.corso.generics.macero;

public class Macero {
	
	//L'argomento jolly ? ci permette di costruire un singolo metodo, altrimenti
	//avremmo dovuto scrivere un metodo per ogni contenuto
	public void maceraScatole(Scatola<?> scatola) {
		System.out.println("Macerata una scatola di " + scatola.getContenuto());
	}

}
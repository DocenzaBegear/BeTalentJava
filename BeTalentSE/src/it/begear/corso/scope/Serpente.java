package it.begear.corso.scope;

public class Serpente {

	//Variabili di classe
	static final int LUNGHEZZA_MASSIMA = 5;
	static String mutazione;
	
	//Variabile di istanza
	int lunghezza;

	public void grow(int inches) {
		if (lunghezza < LUNGHEZZA_MASSIMA) {
			//Variabile locale (vanno sempre inizializzate)
			int newSize = lunghezza + inches;
			lunghezza = newSize;
		}
	}
}


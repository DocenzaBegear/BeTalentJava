package it.begear.corso.generics.bibliotecaG;

public class Main {

	public static void main (String[] args) {

		Scaffale<Giallo> scaffale1 = new Scaffale<Giallo>("libri gialli");
		Scaffale<Fantascienza> scaffale2 = new Scaffale<Fantascienza>("libri di fantascienza");

		Giallo libro1 = new Giallo("Le tre bare", "J.D.Carr");
		Giallo libro2 = new Giallo("Orme sulla sabbia", "J.J.Connington");
		Fantascienza libro3 = new Fantascienza("Dune", "Frank Herbert");
		Fantascienza libro4 = new Fantascienza("Crociera nell'infinito", "A. Van Vogt");

		//Vogliamo che gli scaffali siano omogenei (solo fantascienza o solo gialli)

		scaffale1.aggiungiLibro(libro1);
		scaffale1.aggiungiLibro(libro2);
		
		//Evviva c'è un errore di compilazione! Siamo salvi dal type-unsafety!
		//scaffale1.aggiungiLibro(libro3);
	
	}

}

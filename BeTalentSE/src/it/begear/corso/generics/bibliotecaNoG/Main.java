package it.begear.corso.generics.bibliotecaNoG;

public class Main {

	public static void main (String[] args) {	

		Scaffale scaffale1 = new Scaffale("libri gialli");
		Scaffale scaffale2 = new Scaffale("libri di fantascienza");

		Libro libro1 = new Giallo("Le tre bare", "J.D.Carr");
		Libro libro2 = new Giallo("Gli omicidi dello zodiaco", "Soshi Shimada");
		Libro libro3 = new Fantascienza("Dune", "Frank Herbert");
		Libro libro4 = new Fantascienza("Crociera nell'infinito", "A. Van Vogt");

		//Vogliamo che gli scaffali siano omogenei (solo fantascienza o solo gialli)

		scaffale1.aggiungiLibro(libro1);
		scaffale1.aggiungiLibro(libro2);
		
		//Problema grave di type-unsafety
		scaffale1.aggiungiLibro(libro3);
	
		scaffale1.getAll();
		
		System.out.println();
		
		//Problema di type-unsafety (meno grave, almeno lancia una eccezione)
		int i = 0;
		for (Libro libro : scaffale1.lista) {
		Giallo lib = (Giallo) scaffale1.get(i);
		System.out.println(lib);
		i++;
		}
	}

}

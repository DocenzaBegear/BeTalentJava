package it.begear.corso.generics.bibliotecaNoG;

import java.util.ArrayList;

public class Scaffale {

	protected ArrayList<Libro> lista;
	private String genere;
	
	public Scaffale(String genere) {
		lista = new ArrayList<Libro>();
		setGenere(genere);
	}
	
	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public void aggiungiLibro(Libro libro) {
		lista.add(libro);
	}
	
	public void togliLibro(Libro libro) {
		lista.remove(libro);
	}
	
	public Libro get(int index) {
		return lista.get(index);
	}
	
	public void getAll() {
		System.out.println("Scaffale per " + genere);
		for (Libro libro : lista) {
			System.out.println(libro.toString());
		}
	}
	
}

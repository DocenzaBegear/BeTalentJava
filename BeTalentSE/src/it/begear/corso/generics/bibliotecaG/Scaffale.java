package it.begear.corso.generics.bibliotecaG;

import java.util.ArrayList;

public class Scaffale<E> {

	protected ArrayList<E> lista;
	private String genere;
	
	public Scaffale(String genere) {
		lista = new ArrayList<E>();
		setGenere(genere);
	}
	
	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public void aggiungiLibro(E libro) {
		lista.add(libro);
	}
	
	public void togliLibro(E libro) {
		lista.remove(libro);
	}
	
	public E get(int index) {
		return lista.get(index);
	}
	
	public void getAll() {
		System.out.println("Scaffale per " + genere);
		for (E libro : lista) {
			System.out.println(libro.toString());
		}
	}
	
}

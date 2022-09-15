package it.begear.corso.collections.list;

public class Fumetto {
	
	private String titolo;
	private double prezzo;
	
	public Fumetto(String titolo, double prezzo) {
		setTitolo(titolo);
		setPrezzo(prezzo);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public String toString() {
		return titolo + " " + prezzo;
	}

}

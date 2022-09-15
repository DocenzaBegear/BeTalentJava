package it.betalent.entity;

public class Pizza {
	
	public String nome;
	public double prezzo;
	public String[] ingredienti;
	
	public Pizza(String nome, double prezzo, String[] ingredienti) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
	}

}

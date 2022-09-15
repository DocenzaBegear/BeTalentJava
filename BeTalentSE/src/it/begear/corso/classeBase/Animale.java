package it.begear.corso.classeBase;

public class Animale {
	
	private String nome;
	private int eta;
	private String specie;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() <= 7) {
		this.nome = nome;
		}
		System.out.println("Il nome è troppo lungo");
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String getSpecie() {
		return specie;
	}
	
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	
}

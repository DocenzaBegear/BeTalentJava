package it.beTalent.entity;

public class Animale {
	
	public String specie;
	public int eta;
	public boolean velenoso;
	
	public Animale() {}
	
	public Animale(String specie, int eta, boolean velenoso) {
		super();
		this.specie = specie;
		this.eta = eta;
		this.velenoso = velenoso;
	}
	
	public Animale(String specie, int eta) {
		super();
		this.specie = specie;
		this.eta = eta;
	}

	public void corre() {
		System.out.println("L'animale corre");
	}

}

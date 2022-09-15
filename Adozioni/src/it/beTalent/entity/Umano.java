package it.beTalent.entity;

import java.util.ArrayList;

public class Umano {
	
	public String nome;
	public ArrayList<AnimaleDomestico> animali = new ArrayList<AnimaleDomestico>();
	
	//private String nome;
	//private ArrayList<AnimaleDomestico> animali = new ArrayList<AnimaleDomestico>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<AnimaleDomestico> getAnimali() {
		return animali;
	}

	public void setAnimali(ArrayList<AnimaleDomestico> animali) {
		this.animali = animali;
	}

	public Umano(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		String parte1 = "l'umano di nome " + nome + " vive con i sguenti animali: \n";
		String parte2 = "";
		for (AnimaleDomestico item : animali) {
			String animale = item.toString();
			parte2 += animale + "\n";
		}
		String finale = parte1+parte2;
		return finale;
	}

}

package it.beTalent.main;

import it.beTalent.entity.Animale;

public class Main {

	public static void main(String[] args) {
		
		int numero = 5;
		Animale anim1 = new Animale();

		System.out.println("La specie di anim1 �: " + anim1.specie);
		System.out.println("l'et� di anim1 �: " + anim1.eta);
		System.out.println("La velenosit� di anim1 �: " + anim1.velenoso);
		
		anim1.specie = "gatto";
		anim1.eta = 1;
		
		System.out.println("---");
		
		System.out.println("La specie di anim1 �: " + anim1.specie);
		System.out.println("l'et� di anim1 �: " + anim1.eta);
		System.out.println("La velenosit� di anim1 �: " + anim1.velenoso);
		
		anim1.corre();
		
		Animale anim2 = new Animale("tucano", 13, false);

	}

}

package it.begear.corso.classeBase;

public class Main {	
	
	public static void main(String[] args) {
		
		//Istanza del primo animale
		Animale anim1 = new Animale();
		//Setting del nome del primo animale
		anim1.setNome("Pangur");
		
		//Stampa del nome del primo animale
		System.out.println("Il nome del primo animale �: " + anim1.getNome());
		//Stampa dell'et�, sar� 0 perch� c'� ancora il valore di default
		System.out.println("l'et� del primo animale �: " + anim1.getEta());
		//Stampa della specie, sar� null perch� c'� ancora il valore di default
		System.out.println("La specie del primo animale �: " + anim1.getSpecie());
		
		anim1.setEta(1);
		anim1.setSpecie("Gatto");
		
		System.out.println("l'et� del primo animale �: " + anim1.getEta());
		System.out.println("La specie del primo animale �: " + anim1.getSpecie());

	}

}

package it.begear.corso.classeBase;

public class Main {	
	
	public static void main(String[] args) {
		
		//Istanza del primo animale
		Animale anim1 = new Animale();
		//Setting del nome del primo animale
		anim1.setNome("Pangur");
		
		//Stampa del nome del primo animale
		System.out.println("Il nome del primo animale è: " + anim1.getNome());
		//Stampa dell'età, sarà 0 perché c'è ancora il valore di default
		System.out.println("l'età del primo animale è: " + anim1.getEta());
		//Stampa della specie, sarà null perché c'è ancora il valore di default
		System.out.println("La specie del primo animale è: " + anim1.getSpecie());
		
		anim1.setEta(1);
		anim1.setSpecie("Gatto");
		
		System.out.println("l'età del primo animale è: " + anim1.getEta());
		System.out.println("La specie del primo animale è: " + anim1.getSpecie());

	}

}

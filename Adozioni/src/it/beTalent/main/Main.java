package it.beTalent.main;

import java.util.ArrayList;
import java.util.Scanner;

import it.beTalent.entity.AnimaleDomestico;
import it.beTalent.entity.Umano;
import it.beTalent.utility.Database;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		AnimaleDomestico anim1 = new AnimaleDomestico("Gwen", "Oca");
		AnimaleDomestico anim2 = new AnimaleDomestico("Pangur", "Gatto");
		AnimaleDomestico anim3 = new AnimaleDomestico("Gobbolino", "Gatto");
		AnimaleDomestico anim4 = new AnimaleDomestico("Ponga", "Gatto");
		AnimaleDomestico anim5 = new AnimaleDomestico("Tina", "Cane");
		AnimaleDomestico anim6 = new AnimaleDomestico("Stefy", "Tarantola");
		
		Umano prop1 = new Umano("Linda");
		Umano prop2 = new Umano("Giovanna");
		Umano prop3 = new Umano("Filippo");
		
		prop1.animali.add(anim1);
		prop1.animali.add(anim2);
		
		prop2.animali.add(anim3);
		prop2.animali.add(anim4);
		prop2.animali.add(anim5);
		
		prop3.animali.add(anim6);
		
//		prop1.getAnimali().add(anim1);
//		prop1.getAnimali().add(anim2);
//		
//		prop2.getAnimali().add(anim3);
//		prop2.getAnimali().add(anim4);
//		prop2.getAnimali().add(anim5);
//		
//		prop3.getAnimali().add(anim6);
		
		//Assegnazione a mano
		/*
		HashMap<AnimaleDomestico, Umano> database = new HashMap<AnimaleDomestico, Umano>();
	
		database.put(anim1, prop1);
		database.put(anim2, prop1);
		
		database.put(anim3, prop2);
		database.put(anim4, prop2);
		database.put(anim5, prop2);
		
		database.put(anim6, prop3);
		*/
		
		//Ma se propietari e animali fossero tantissimi?
		//Creazione automatica
		ArrayList<Umano> umani = new ArrayList<Umano>();
		umani.add(prop1);
		umani.add(prop2);
		umani.add(prop3);
		Database dati = new Database(umani);
		
		dati.lettura();
		
		System.out.println("Inserisci il nome dell'animale: ");
		String nomeAnimale = scan.nextLine();
		System.out.println(dati.ricerca(nomeAnimale));
		
	}

}

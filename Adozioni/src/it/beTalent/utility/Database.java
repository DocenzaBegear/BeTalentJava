package it.beTalent.utility;

import java.util.ArrayList;
import java.util.HashMap;

import it.beTalent.entity.AnimaleDomestico;
import it.beTalent.entity.Umano;

public class Database {
	
	public HashMap<AnimaleDomestico, Umano> database = new HashMap<AnimaleDomestico, Umano>();
	
	public Database (ArrayList<Umano> umani) {
		for (Umano item : umani) {
			for (AnimaleDomestico current : item.getAnimali()) {
				database.put(current, item);
			}
		}
	}
	
	public void lettura() {
		for(AnimaleDomestico key : database.keySet()) {
			Umano value = database.get(key);
			System.out.println("Animale: " + key);
			System.out.println(value);
			}
	}
	
	public Umano ricerca(String nomeAnimale) {
		Umano umano = null;
		for(AnimaleDomestico key : database.keySet()) {
	    //if (key.getNome().equals(nomeAnimale))
		if (key.nome.equals(nomeAnimale))	
			umano = database.get(key);
		}
		return umano;
	}

}

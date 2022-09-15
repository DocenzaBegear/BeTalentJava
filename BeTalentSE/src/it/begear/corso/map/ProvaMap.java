package it.begear.corso.map;

import java.util.*;

public class ProvaMap {
	
	public static void main (String[] args) {
			
		//Il primo tipo (String) è la chiave, il secondo (Long) il valore
		Map<String, Long> mappa = new HashMap<String, Long>();
		
		mappa.put("Genova", 578_000l);
		mappa.put("Milano", 1_352_000l);
		mappa.put("Caserta", 100_000l);

		//Itero sulle chiavi
		for(String key : mappa.keySet()){  //Raccoglie l'intero set di chiavi e le cicla una a una
			Long value = mappa.get(key);  //attenzione: get(key) restituisce il VALORE, non la chiave
			System.out.println("Chiave: " + key);
			System.out.println("Valore: " + value);
			}
		
		System.out.println();
			
		//itero sui valori
		for(Long value : mappa.values()){
			System.out.println("Valore: " + value);
			}
		
		System.out.println();
		
		//Se non trova la chiave restituisce il valore in ingresso
		Long value = mappa.getOrDefault("Napoli", -1l);
		System.out.println("Default: " + value);
		
		System.out.println();
		
		//Controlla l'esistenza di una chiave o un valore
		System.out.println("La chiave Genova esiste? " + mappa.containsKey("Genova"));
		System.out.println("La chiave Trieste esiste? " + mappa.containsKey("Trieste"));
		System.out.println("Il valore 578_000 esiste? " + mappa.containsValue(578_000l));
		System.out.println("Il valore 100_000 esiste? " + mappa.containsValue(100_000l));
		
		//Cambia il valore relativo a una chiave già inserita
		mappa.replace("Genova", 1l);
		for (Long item : mappa.values()) {
			System.out.println("Value: " + item);
		}
		
	}

}

package it.begear.utility;

import java.util.HashMap;

import it.begear.entity.Utente;

public class Utility {
	
	public static HashMap<String, Utente> assegnaBonus(HashMap<String, Utente> listaUtenti) {
		for (String key : listaUtenti.keySet()) {
			if (key.contains("begear.it")) {	
				
				//listaUtenti.get(key).setPortafoglio(listaUtenti.get(key).getPortafoglio+50);
				
				Utente utCurrent = listaUtenti.get(key);
				int nuovoPortafoglio = utCurrent.getPortafoglio()+50;
				utCurrent.setPortafoglio(nuovoPortafoglio);
			}
		}
		return listaUtenti;
	}

}

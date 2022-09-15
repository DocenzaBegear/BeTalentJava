package it.beTalent.main;

import it.beTalent.entity.Dipendente;
import it.beTalent.utility.Assegnazione;

// Scrivere un software che elabori dei dipendenti, assegnando loro un ruolo

public class Main {

	public static void main(String[] args) {
		
		Dipendente dip = new Dipendente("Filippo");
		
		System.out.println(dip.ruolo);
		
		Assegnazione asse = new Assegnazione();
		
		asse.dirigente(dip);
		
		System.out.println(dip.ruolo);
		
	}

}

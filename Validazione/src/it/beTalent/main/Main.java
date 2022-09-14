package it.beTalent.main;

import it.beTalent.entity.Utente;
import it.beTalent.utility.Validazione;

public class Main {

	public static void main(String[] args) {

		boolean flag = false;
		Utente ut = new Utente();

		do {
			try {
				String nome = Validazione.sceltaNome();
				ut = new Utente(nome);
				flag = false;
			} catch (Exception e) {
				System.out.println("Utente invalido, riprovare");
				flag = true;
			}

		} while (flag);
		System.out.println("Utente creato correttamente: " + ut);
	}
}

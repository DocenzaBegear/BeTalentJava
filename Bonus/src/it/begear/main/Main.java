package it.begear.main;

import java.util.HashMap;
import java.util.Scanner;

import it.begear.entity.Utente;
import it.begear.utility.Utility;

public class Main {
	
	/* Crare un software che gestisca utenti con un username che è la mail.
	 * Usare una mappa per gestire gli utenti
	 * Gli utenti che hanno dominio begear.it ricevono un bonus di acquisto di 50 euri.
	 */

	public static void main(String[] args) {
	
		String safe = "";
		boolean flag = false;
		HashMap<String, Utente> mappaUtenti = new HashMap<String, Utente>();
		
		do {
		flag = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci nome utente: ");
		String nome = scan.nextLine();
		System.out.print("Inserisci la mail: ");
		String username = scan.nextLine();
		System.out.print("Inserisci il valore del portafoglio: ");
		int portafoglio = scan.nextInt();
		
		Utente ut1 = new Utente(nome, username, portafoglio);
		mappaUtenti.put(ut1.getUsername(), ut1);
		
		safe = scan.nextLine();
		System.out.print("Vuoi inserire un altro utente? ");
		boolean scelta = scan.nextBoolean();
		if (scelta == true) {flag = true;}
		} while (flag);
		
		for (String item : mappaUtenti.keySet()) {
			Utente ut = mappaUtenti.get(item);
			System.out.println(ut);
		}
		
		Utility.assegnaBonus(mappaUtenti);
		System.out.println("--");
		
		for (String item : mappaUtenti.keySet()) {
			Utente ut = mappaUtenti.get(item);
			System.out.println(ut);
		}
		
	}

}

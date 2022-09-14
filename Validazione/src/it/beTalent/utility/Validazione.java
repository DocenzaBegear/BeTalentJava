package it.beTalent.utility;

import java.util.Scanner;

public class Validazione {
	
	static Scanner scan = new Scanner(System.in);
	
	public static String sceltaNome() {
		System.out.print("Inserisci il nome dell'utente: ");
		String nome = scan.nextLine();
		if (nome.length() > 3) return nome;
		else throw new IllegalArgumentException();
	}

}

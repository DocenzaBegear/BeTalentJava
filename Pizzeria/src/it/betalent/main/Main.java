package it.betalent.main;

import java.util.Arrays;
import java.util.Scanner;

import it.betalent.entity.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] ingredienti = new String[3];
		
		System.out.print("Inserisci il nome della pizza: ");
		String nome = scan.nextLine();
		
		for (int i=0; i<ingredienti.length; i++) {
			System.out.print("Inserisci un ingrediente: ");
			String ingrediente = scan.nextLine();
			ingredienti[i] = ingrediente;
		}
		
		System.out.print("Inserisci il prezzo della pizza: ");
		Double prezzo = scan.nextDouble();
		
		Pizza pizza1 = new Pizza(nome, prezzo, ingredienti);
		
		System.out.println(pizza1.nome + " " + Arrays.toString(pizza1.ingredienti) + " " + pizza1.prezzo);

	}

}

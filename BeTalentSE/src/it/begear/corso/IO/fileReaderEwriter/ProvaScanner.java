package it.begear.corso.IO.fileReaderEwriter;

import java.util.Scanner;

public class ProvaScanner {

	public static void main(String[] args) {
		
		    double value;
		    Scanner scan = new Scanner(System.in);

		    System.out.print("Inserisci una stringa:");
		    String prova = scan.nextLine();
		    System.out.println(prova);
		 
		    System.out.print("Enter a double:");
		    value = scan.nextDouble();
		  
		System.out.print("Inserisci un numero: ");
		int numero = scan.nextInt();
		System.out.println("numero: " + numero);
		// la stringa di salvataggio raccoglie il comando invio come carattere di escape /n
		// Il problema sorge quando chiediamo una stringa dopo un numerico
		String safe = scan.nextLine();

		System.out.print("Inserisci una frase: ");
		String parola = scan.nextLine();
		System.out.println("Hai inserito la frase '" + parola + "'");

		System.out.print("Inserisci un numero: ");
		int numeroIntero = scan.nextInt();
		System.out.println("Il secondo numero inserito è: " + numeroIntero);
		scan.close();

	}
}

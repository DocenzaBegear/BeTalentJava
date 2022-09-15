package it.betalent.main;

import java.util.Arrays;
import java.util.Scanner;

import it.betalent.entity.Pasta;
import it.betalent.utility.Smistatore;

public class main {

	public static void main(String[] args) {

		Pasta pasta1 = new Pasta("fusilli", 7);
		Pasta pasta2 = new Pasta("penne", 5);
		Pasta pasta3 = new Pasta("tagliatelle", 3);
		Pasta pasta4 = new Pasta("pici", 20);
		Pasta pasta5 = new Pasta("maccheroni", 12);
		Pasta pasta6 = new Pasta("mezze maniche", 14);
		Pasta pasta7 = new Pasta("ruote", 10);

		Pasta[] magazzino = {pasta1, pasta2, pasta3, pasta4, pasta5, pasta6, pasta7};
		Pasta[] selezione = null;

		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Inserisci un numero tra 1 e 10: ");
			int risposta = scan.nextInt();


			Smistatore selez = new Smistatore();

			if (risposta <=5) {
				selezione = selez.cotturaBreve(magazzino);
				flag = false;}
			else if (risposta > 5 && risposta < 10) {
				selezione = selez.cotturaLunga(magazzino);
				flag = false;}
			else System.out.println("il numero non è valido");
		} while (flag);
		
		for (Pasta item : selezione) {
			System.out.println(item.tipo + " " + item.tempoCottura);
			System.out.println("To string: " + item);
		}
	}
}


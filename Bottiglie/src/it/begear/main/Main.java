package it.begear.main;

import java.util.Scanner;

import it.begear.entity.Bottiglia;
import it.begear.exception.ControlloStatoBottigliaEx;
import it.begear.utility.BraccioMeccanico;

public class Main {

	//	ESERCIZIO 4 - In una fabbrica di bevande alcoliche e analcoliche un braccio 
	//	meccanico può prendere bottiglie per riempirle o svuotarle.
	//	Le bottiglie sono caratterizzate dal tipo di contenuto e dall'essere piene o vuote.
	//	Date nel magazzino 4 bottiglie, implementare un sistema interattivo che le riempie di bevande 
	//	alcoliche o analcoliche, le svuota e stampa lo stato di 
	//	tutte e quattro

	public static void main(String[] args) {

		int count = 1; 
		int index = 0;

		Bottiglia[] magazzino = new Bottiglia[4];
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("La bottiglia " + count + " è alcolica o no? ");
			boolean sceltaAlcol = scan.nextBoolean();
			System.out.print("La bottiglia " + count + " è piena o no? ");
			boolean sceltaPiena = scan.nextBoolean();
			Bottiglia bot1 = new Bottiglia(sceltaAlcol, sceltaPiena);
			magazzino[index] = bot1;
			index++;
			count++;
		} while (count<5);

		BraccioMeccanico BM = new BraccioMeccanico();

		System.out.print("Sceglia una bottiglia (1-4) ");
		int sceltaBottiglia = scan.nextInt();
		Bottiglia currentBot = magazzino[sceltaBottiglia];
		System.out.println("Cosa vuoi fare?");
		System.out.println("1 - Riempire la bottiglia");
		System.out.println("2 - Svuotare la bottiglia");
		int scelta = scan.nextInt();

		if (scelta == 1) {
			BM.riempi(currentBot);
		} else { 
			try {
				BM.svuota(currentBot);
			} catch (ControlloStatoBottigliaEx e) {
				System.out.println("La bottiglia è già vuota");
			}
		}

	}

}

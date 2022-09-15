package it.begear.corso.arrayEcostrutti;

import java.util.Arrays;

public class ArrayEcostrutti {

	public static void main(String[] args) {
		
		//Array
		
		//Dichiarazioni degli array
		int[] iterami = {45, 11, 78, 100};
		//Crea un array di int con indice 4 (4 posti numerati da 0 a 3)
		//L'Array così creato avrà dentro 4 zeri, cioè il valore di default di int
		int[] iterami2 = new int[4];
		
		//Assegnazione del numero 34 all'indice 0
		iterami2[0] = 34;
		
		//Lettura del contenuto dell'indice 0
		System.out.println("Contenuto array: " + iterami2[0]);
		
		//Riempio il resto dell'array
		iterami2[1] = 66;
		iterami2[2] = 2;
		iterami2[3] = 0;
		
		//Lettura automatica di un array
		System.out.println(Arrays.toString(iterami2));
		//Ordinamento di un array
		Arrays.sort(iterami2);
		System.out.println(Arrays.toString(iterami2));
		
		// if-else

		int a = 3;
		int b = 0;

		if (a<b) {
			System.out.println("If-else: a minore di b");
		}
		else if (a>b) {
			System.out.println("If-else: a maggiore di b");
		}
		else {
			System.out.println("If-else: a uguale a b");
		}

		// Operatore ternario

		String string = (a == b) ? "Ternario: a e b sono uguali" : "Ternario: a e b sono diversi";
		System.out.println(string);

		// switch

		switch (a) {

		case 3:
			System.out.println("Switch: a vale 3");
			break;

		case 2:
			System.out.println("Switch: a vale 2");
			break;

		default:
			System.out.println("Switch: a non vale né 3 né 2");
		}

		// do-while

		int count = 1;
		
		do {
			System.out.println("While : sto eseguendo il codice, iterazione " + count + " a=" + a);
			count++;
			a++;
		} while (a <= 5);
		
		while (b < 3) {
			System.out.println("Adesso b vale " + b);
			b++;
		}

		// for

		for (int i=0; i<iterami.length; i++) {
			System.out.println("For: contenuto array alla posizione " + i + " = " + iterami[i]);
		}
		
		int[] riempi = new int[5];
		int numero = 10;
		
		for (int i = 0; i<riempi.length; i++) {
			riempi[i] = numero;
			numero++;
		}
		
		System.out.println(Arrays.toString(riempi));

		// for each - Usare solo in lettura e non in scrittura!!

		int indice = 0;
		for (int current : iterami) {
			System.out.println("For-each: contenuto array alla posizione " + indice 
					+ " = " + current);
			indice++;
		}

	}

}

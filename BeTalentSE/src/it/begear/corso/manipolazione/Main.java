package it.begear.corso.manipolazione;

public class Main {

	public static void main(String[] args) {	

		int primoNumero = 5;
		long secondoNumero = 456L;
		float terzoNumero = 56.34F;
		double quartoNumero = 34.23;
		
		//Variabili primitive
		
		byte numeroByte = 12;
		short numeroShort = 1234;
		int numeroIntero = 23563;
		long numeroLong = 5435243L;
		float numeroFloat = 0.333F;
		double numeroDouble = 0.455;

		//casting
	 	
		int intero2 = (int) 234.56;
		System.out.println("Valore castato: " + intero2);
		double prova = 45;
		
		//Operazioni
		//Incremento, decremento e modulo
		
		System.out.println(numeroIntero + " prima delle modifiche");
		numeroIntero++;
		System.out.println(numeroIntero + " dopo l'incremento");
		numeroIntero--;
		System.out.println(numeroIntero + " dopo il decremento");
		
		int a = 10;
		int b = 3;
		System.out.println("Modulo: " + a % b);
		
		//boolean
		
		boolean stato = true;
		
		//Char

		char lettera = 'd';
		char simbolo = '*';
		char unicode = 225;
		System.out.println("Unicode: " + unicode);
		
		System.out.println();
		
		//Immutabilità delle stringhe
		
		String stringa1;
		stringa1 = "a";
		stringa1 = "  Pino  ";
		//Toglie gli spazi all'inizio e alla fine di una stringa 
		stringa1.trim();
		System.out.println("Stringa non mutata: "+ stringa1);
		stringa1 = stringa1.trim();
		System.out.println("Stringa mutata: " + stringa1);
		
		//Lunghezza
		//Int length()
		System.out.println("Lunghezza stringa: " + stringa1.length());

		String titolo = "The Batman";
		
		//Trova un carattere
		//char charAt(int index)
		System.out.println("Che carattere si trova all'index 2? " + titolo.charAt(2));
		
		//Trova un index (trova il primo disponibile)
		//int indexOf(char ch)
		System.out.println("Che index corrisponde al carattere 'a'? " + titolo.indexOf('a'));
		
		//Trova un index e cerca a partire da un index specifico
		//int indexOf(char ch, int fromIndex)
		System.out.println("Che index corrisponde al carattere 'a' dall'index 2 in poi? " + titolo.indexOf('a', 2));

		//Trova l'index iniziale di una sottostringa
		//int indexOf(String str)
		System.out.println("A che index comincia la sottostringa 'at'? " + titolo.indexOf("at"));
		
		//Trova l'index di partenza di una sottostringa a partire da un index specifico
		//int indexOf(String str, int fromIndex)
		System.out.println("A che index comincia la sottostringa 'at' dall'index 6? " + titolo.indexOf("at", 6));

		//Restituisce una sottostringa a partire da un index
		//String substring(int beginIndex)
		System.out.println("Substring: " + titolo.substring(2,5));

		//Trasforma tutto in minuscolo o maiuscolo
		//String toLowerCase(String str)
		//String toUpperCase(String str)
		String txt = "Hello BeTalent!";
	    System.out.println("Uppercase: " + txt.toUpperCase());
	    System.out.println("Lowercase: " + txt.toLowerCase());
	    
	    //Modifica un carattere
	    //String replace(char oldChar, char newChar)
	    titolo = titolo.replace('B', 'P');
	    System.out.println("Singolo carattere modificato: " + titolo);
	    
	    titolo = "The Batman";
	    
	    //Modifica una parte di una stringa
	    //String replace(CharSequence oldChar, CharSequence newChar)
	    titolo = titolo.replace("Batman", "Amazing Spiderman");
	    System.out.println("Stringa modificata:" + titolo);
	    
	    titolo = "The Batman";
	    
	    //Sottostringa
		String risultato = titolo.substring(2,5);
		System.out.println("Substring: " + risultato);
	    
	    //Controllo inizio, fine e contenuto stringa
	    System.out.println("La stringa comincia per 'Th'? " + titolo.startsWith("Th"));
	    System.out.println("La stringa finisce per 'nd'? " + titolo.endsWith("nd"));
	    System.out.println("La stringa contiene 'bat'? " + titolo.contains("bat"));
	    
	    //Uguaglianza tra stringhe
	    String prima = "Bravi programmatori";
	    String seconda = "bravi programmatori";
	    System.out.println("Le due stringhe sono uguali? " + prima.equals(seconda));
	    System.out.println("Le due stringhe sono uguali? " + prima.equalsIgnoreCase(seconda));
	    
	    //ATTENZIONE! Non usare == per confrontare due stringhe!
	    
	    String prova1 = "ciao";
	    String prova2 = "ciao";
	    
	    System.out.println(prova1 == prova2);
	    
	    prova1 = prova1 + prova2;
	    prova2 = prova2 + "ciao";
	    
	    System.out.println(prova1);
	    System.out.println(prova2);
	    
	    System.out.println(prova1 == prova2);
	    
	    //Concatenazione di stringhe
	    System.out.println(1 + 2 + " è uguale a " + 3);
	    System.out.println(1 + 2 + " è uguale a " + 1 + 2);
	}

}

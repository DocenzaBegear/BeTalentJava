package it.begear.corso.eccezioni.gestione;

public class Main {

	@SuppressWarnings("unused")
	public static void main (String[] args) {	
			
//Eccezione non gestita (unchecked - runtime exception)
		int[] array = new int[3];
//		array[245] = 5;

//Gestione dell'eccezione (handling)
		try {
			System.out.println(array[23456]);
			System.out.println("Sono qui");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array fuori dai limiti!");
		} catch (Exception e){
			System.out.println("Errore rilevato!");
		}
		finally {
			System.out.println("Dentro il finally");
		}
		
	}

}

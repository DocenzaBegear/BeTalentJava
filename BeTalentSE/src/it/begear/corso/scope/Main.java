package it.begear.corso.scope;

public class Main {

	public static void main(String[] args) {
		
		Serpente serpente1 = new Serpente();
		Serpente serpente2 = new Serpente();
		
		serpente1.mutazione="nessuna mutazione";
		System.out.println(serpente1.mutazione);
		
		System.out.println(serpente2.mutazione);
		
		serpente1.mutazione = "ali";
		
		System.out.println("MUTAZIONE!");
		System.out.println(serpente1.mutazione);
		System.out.println(serpente2.mutazione);
		
	}

}

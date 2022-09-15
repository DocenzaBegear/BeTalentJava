package it.begear.corso.ereditarietà;

public class Main {

	public static void main(String[] args) {
		
		Stanza stanza1 = new Stanza();
		Stanza stanza2 = new Stanza(50.0, true);
		
		Bagno bagno1 = new Bagno(5.0, false, "Capri");
		
		System.out.println(bagno1);

	}

}
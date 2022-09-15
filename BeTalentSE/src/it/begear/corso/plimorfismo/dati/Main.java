package it.begear.corso.plimorfismo.dati;

public class Main {
	
	public static void main (String[] args) {
	
	//Questo oggetto � da considerare di tipo DerviedA
	Base base = new DerivedA();
	
	System.out.println("base � una istanza di DerivedA? " + (base instanceof DerivedA));
	System.out.println("base � una istanza di Base? " + (base instanceof Base));

	base.stampa();
	((DerivedA) base).primaVolta();
	
	DerivedA derivedA = new DerivedA();
	
	derivedA.stampa();
	
	DerivedA derivedB = new DerivedB();
	
	derivedB.stampa();
	

	 //Collezione eterogenea	
	 Base[] etero = new Base[3];
	 etero[0] = base;
	 etero[1] = derivedA;
	 etero[2] = derivedB;
	
	}

}

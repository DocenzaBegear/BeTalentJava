package it.begear.corso.plimorfismo.dati;

public class DerivedA extends Base{
	
	//Metodo che verrà letto virtualmente
	public void stampa() {
		System.out.println("Derived A");
	}
	
	//Metodo presentato la prima volta in questa classse estesa, richiede un casting
	public void primaVolta() {
		System.out.println("Prima volta");
	}

}

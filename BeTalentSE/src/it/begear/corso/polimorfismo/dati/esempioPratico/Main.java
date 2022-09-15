package it.begear.corso.polimorfismo.dati.esempioPratico;

public class Main {

	public static void main(String[] args) {
		
		Veicolo boeing = new Aereo();
		Veicolo punto = new Automobile();
		Veicolo Titanic = new Nave();
		
		Viaggiatore marcoPolo = new Viaggiatore();
		
		marcoPolo.viaggia(boeing);
		marcoPolo.viaggia(punto);
		marcoPolo.viaggia(Titanic);

	}

}
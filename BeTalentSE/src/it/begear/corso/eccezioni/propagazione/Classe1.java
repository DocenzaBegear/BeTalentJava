package it.begear.corso.eccezioni.propagazione;

public class Classe1 {
	
	public void metodo1() throws MyException {
		
		Classe2 classe2 = new Classe2();
		classe2.metodo2();
		
	}

}

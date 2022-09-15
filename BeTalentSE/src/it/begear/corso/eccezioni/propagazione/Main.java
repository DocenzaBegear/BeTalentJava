package it.begear.corso.eccezioni.propagazione;

public class Main {

	public static void main(String[] args) {
		
		Classe1 classe1 = new Classe1();
		try {
			classe1.metodo1();
			System.out.println("Questa parte non viene gestita");
		} catch (MyException e) {
			System.out.println("Eccezione gestita");
		} catch (Exception e) {
			System.out.println("Eccezione gestita");
		} finally {
			System.out.println("Sono nel finally");
		}
	}
	
}

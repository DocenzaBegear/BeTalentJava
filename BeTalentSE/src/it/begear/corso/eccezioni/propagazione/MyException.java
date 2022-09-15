package it.begear.corso.eccezioni.propagazione;

public class MyException extends Exception {
	
	public String getMessage() {
	return "È stata sollevata la mia eccezione MyException";
	}

}

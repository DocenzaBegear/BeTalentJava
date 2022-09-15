package it.begear.corso.lambda;

public class Main {

	public static void main(String[] args) {
		
		Gatto gatto1 = new Gatto();
		//gatto1.verso();
		
		Stampa prova = (s, t) -> s + "Miao" + t;
		faiVerso(prova);
		
	}
	
	static void faiVerso(Stampa obj) {
		System.out.println(obj.verso("Verso dell'animale: ", "!"));
	}

}

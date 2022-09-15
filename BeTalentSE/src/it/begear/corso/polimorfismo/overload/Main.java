package it.begear.corso.polimorfismo.overload;

public class Main {

	public static void main(String[] args) {
		
		SuperClasse sup1 = new SuperClasse();
		Overload over = new Overload();
		
		int uno = 34;
		int due = 45;
		
		int a = sup1.somma(uno, due);
		int b = over.somma(12, 23);
		
		int c = over.somma(4, 23, 99);
		
		System.out.println(sup1.somma(100, 5));

	}

}

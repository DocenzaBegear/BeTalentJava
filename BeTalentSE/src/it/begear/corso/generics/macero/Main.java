package it.begear.corso.generics.macero;

public class Main {

	public static void main(String[] args) {

		Scatola<Cereale> scatola1 = new Scatola<Cereale>(new Cereale());
		Scatola<Mozzarella> scatola2 = new Scatola<Mozzarella>(new Mozzarella());

		Macero macero = new Macero();
		macero.maceraScatole(scatola1);
		macero.maceraScatole(scatola2);

	}

}
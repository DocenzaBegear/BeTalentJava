package it.begear.corso.interfacceEastratte;

public class Quadrato extends Quadrilatero implements DisegnaFigura{

	public Quadrato(double lato) {
		super.setLato1(lato);
		super.setLato2(lato);
		super.setLato3(lato);
		super.setLato4(lato);
		super.setAltezza(lato);
		super.setBase(lato);
	}

	@Override
	public double area() {
		return this.getLato1()*2;
	}
	
	@Override
	public void disegnafigura() {
		System.out.println("La figura è stata disegnata");
	}
	
	@Override
	public void coloraFigura() {
		System.out.println("Il quadrto è stato colorato di indaco");
	}
	

}

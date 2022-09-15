package it.begear.corso.interfacceEastratte;

public class Rettangolo extends Quadrilatero implements DisegnaFigura{
	
	public Rettangolo(double latoMinore, double latoMaggiore) {
		super.setBase(latoMinore);
		super.setLato1(latoMinore);
		super.setLato2(latoMinore);
		super.setAltezza(latoMaggiore);
		super.setLato3(latoMaggiore);
		super.setLato4(latoMaggiore);
	}

	@Override
	public double area() {
		return this.getBase()*this.getAltezza();
	}
	
	@Override
	public void disegnafigura() {
		System.out.println("La figura è stata disegnata");
	}
	
}

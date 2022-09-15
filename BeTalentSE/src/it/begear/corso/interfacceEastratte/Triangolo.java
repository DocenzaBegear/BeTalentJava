package it.begear.corso.interfacceEastratte;

public class Triangolo extends Poligono implements DisegnaFigura{
	
	private double base;
	private double lato2;
	private double lato3;
	private double altezza;
	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLato2() {
		return lato2;
	}

	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}

	public double getLato3() {
		return lato3;
	}

	public void setLato3(double lato3) {
		this.lato3 = lato3;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	@Override
	public double area() {
		return (base*altezza)/2;
	}

	@Override
	public double perimetro() {
		return base+lato2+lato3;
	}
	
	@Override
	public void disegnafigura() {
		System.out.println("La figura è stata disegnata");
	}

}

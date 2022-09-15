package it.begear.corso.interfacceEastratte;

public abstract class Quadrilatero extends Poligono{
	
	private double lato1;
	private double lato2;
	private double lato3;
	private double lato4;
	private double base;
	private double altezza;
	
	public double getLato1() {
		return lato1;
	}
	public void setLato1(double lato1) {
		this.lato1 = lato1;
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
	public double getLato4() {
		return lato4;
	}
	public void setLato4(double lato4) {
		this.lato4 = lato4;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	//Metodo
	public double perimetro() {
		return lato1+lato2+lato3+lato4;
	}

}

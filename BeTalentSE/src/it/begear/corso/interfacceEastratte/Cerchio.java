package it.begear.corso.interfacceEastratte;

public class Cerchio extends Forma implements DisegnaFigura{
	
	double raggio;
	
	//Costruttore
	public Cerchio(double raggio) {
		setRaggio(raggio);
	}

	//Getter e setter
	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	//Metodi
	@Override
	public double area() {
		return raggio*raggio*3.14;
	}
	
	public double circonferenza() {
		return raggio*2*3.14;
	}

	@Override
	public void disegnafigura() {
		System.out.println("La figura è stata disegnata");
	}
	
	@Override
	public void coloraFigura() {
		System.out.println("La figura è stata colorata di verde");
	}

}

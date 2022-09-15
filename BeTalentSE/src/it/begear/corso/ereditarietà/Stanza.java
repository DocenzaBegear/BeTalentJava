package it.begear.corso.ereditarietà;

public class Stanza {

	private double metratura;
	private boolean luce;
	
	public Stanza() {}
	
	public Stanza(double metratura, boolean luce) {
		this.metratura = metratura;
		this.luce = luce;
	}

	public double getMetratura() {
		return metratura;
	}

	public void setMetratura(double metratura) {
		if (metratura < 4) System.out.println("La metratura è troppo piccola!");
		else this.metratura = metratura;
	}

	public boolean isLuce() {
		return luce;
	}

	public void setLuce(boolean luce) {
		this.luce = luce;
	}

	@Override
	public String toString() {
		return "Stanza [metratura=" + metratura + ", luce=" + luce + "]";
	}

}

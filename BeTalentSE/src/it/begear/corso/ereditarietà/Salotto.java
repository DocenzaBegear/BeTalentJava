package it.begear.corso.ereditarietà;

public class Salotto extends Stanza {
	
	private String modelloDivano;

	public Salotto(double metratura, boolean luce) {
		super(metratura, luce);
	}

	public String getModelloDivano() {
		return modelloDivano;
	}

	public void setModelloDivano(String modelloDivano) {
		this.modelloDivano = modelloDivano;
	}

	public Salotto(double metratura, boolean luce, String modelloDivano) {
		super(metratura, luce);
		this.modelloDivano = modelloDivano;
	}

}

package it.begear.corso.ereditarietà;

public class Bagno extends Stanza {
	
	private String modelloVasca;

	public String getModelloVasca() {
		return modelloVasca;
	}

	public void setModelloVasca(String modelloVasca) {
		this.modelloVasca = modelloVasca;
	}

	public Bagno(double metratura, boolean luce, String modelloVasca) {
		super(metratura, luce);
		setModelloVasca(modelloVasca);
	}

}
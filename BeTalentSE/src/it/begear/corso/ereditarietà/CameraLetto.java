package it.begear.corso.ereditariet�;

public class CameraLetto extends Stanza {

	private String modelloLetto;

	public CameraLetto(double metratura, boolean luce, String modelloLetto) {
		super(metratura, luce);
		this.modelloLetto = modelloLetto;
	}
	
	public String getModelloLetto() {
		return modelloLetto;
	}

	public void setModelloLetto(String modelloLetto) {
		this.modelloLetto = modelloLetto;
	}
	
}

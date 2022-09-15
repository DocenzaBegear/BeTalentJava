package it.begear.entity;

public class Bottiglia {
	
	private boolean alcolico;
	private boolean piena;
	
	public Bottiglia(boolean alcolico, boolean piena) {
		super();
		this.alcolico = alcolico;
		this.piena = piena;
	}
	
	public boolean isAlcolico() {
		return alcolico;
	}
	public void setAlcolico(boolean alcolico) {
		this.alcolico = alcolico;
	}
	public boolean isPiena() {
		return piena;
	}
	public void setPiena(boolean piena) {
		this.piena = piena;
	}

	@Override
	public String toString() {
		return "Bottiglia [alcolico=" + alcolico + ", piena=" + piena + "]";
	}

}

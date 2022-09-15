package it.betalent.entity;

public class Pasta {
	
	public String tipo;
	public int tempoCottura;
	
	public Pasta(String tipo, int tempoCottura) {
		super();
		this.tipo = tipo;
		this.tempoCottura = tempoCottura;
	}

	@Override
	public String toString() {
		return "Pasta [tipo=" + tipo + ", tempoCottura=" + tempoCottura + "]";
	}
	
	

}

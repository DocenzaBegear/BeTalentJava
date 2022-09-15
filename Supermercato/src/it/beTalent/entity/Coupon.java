package it.beTalent.entity;

public class Coupon {
	
	public int numero;

	public Coupon(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Coupon [numero=" + numero + "]";
	}

}

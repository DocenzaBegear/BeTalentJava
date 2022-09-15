package it.beTalent.entity;

public class Cliente {
	
	public int numero;
	public Integer numeroCoupon = null;
	
	public Cliente(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Cliente [numero=" + numero + ", numeroCoupon=" + numeroCoupon + "]";
	}

}

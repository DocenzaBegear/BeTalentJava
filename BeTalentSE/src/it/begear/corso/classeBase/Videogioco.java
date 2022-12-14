package it.begear.corso.classeBase;

public class Videogioco {
	
	private int longevitÓ;
	private String nome;
	
	public Videogioco(int longevitÓ, String nome) {
		super();
		this.longevitÓ = longevitÓ;
		this.nome = nome;
	}
	
	public int getLongevitÓ() {
		return longevitÓ;
	}
	public void setLongevitÓ(int longevitÓ) {
		this.longevitÓ = longevitÓ;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Videogioco [longevitÓ=" + longevitÓ + ", nome=" + nome + "]";
	}

}

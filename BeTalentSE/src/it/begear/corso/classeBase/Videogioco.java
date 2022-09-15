package it.begear.corso.classeBase;

public class Videogioco {
	
	private int longevità;
	private String nome;
	
	public Videogioco(int longevità, String nome) {
		super();
		this.longevità = longevità;
		this.nome = nome;
	}
	
	public int getLongevità() {
		return longevità;
	}
	public void setLongevità(int longevità) {
		this.longevità = longevità;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Videogioco [longevità=" + longevità + ", nome=" + nome + "]";
	}

}

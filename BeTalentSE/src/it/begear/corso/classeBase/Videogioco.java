package it.begear.corso.classeBase;

public class Videogioco {
	
	private int longevit�;
	private String nome;
	
	public Videogioco(int longevit�, String nome) {
		super();
		this.longevit� = longevit�;
		this.nome = nome;
	}
	
	public int getLongevit�() {
		return longevit�;
	}
	public void setLongevit�(int longevit�) {
		this.longevit� = longevit�;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Videogioco [longevit�=" + longevit� + ", nome=" + nome + "]";
	}

}

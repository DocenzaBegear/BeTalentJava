package it.beTalent.entity;

public class AnimaleDomestico {
	
	public String nome;
	public String specie;
	//private String nome;
	//private String specie;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public AnimaleDomestico(String nome, String specie) {
		super();
		this.nome = nome;
		this.specie = specie;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + " specie=" + specie;
	}

}

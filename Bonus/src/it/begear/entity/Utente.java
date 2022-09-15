package it.begear.entity;

public class Utente {
	
	private String nome;
	private String username;
	private int portafoglio;
	
	public Utente(String nome, String username, int portafoglio) {
		super();
		this.nome = nome;
		this.username = username;
		this.portafoglio = portafoglio;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPortafoglio() {
		return portafoglio;
	}
	public void setPortafoglio(int portafoglio) {
		this.portafoglio = portafoglio;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", username=" + username + ", portafoglio=" + portafoglio + "]";
	}

}

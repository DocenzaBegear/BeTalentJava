package it.begear.corso.risorse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String titolo;
	int maxPartecipanti;
	
	public Evento() {}
	
	public Evento (Long id, String titolo, int maxPartecipanti) {
		this.id = id;
		this.titolo = titolo;
		this.maxPartecipanti = maxPartecipanti;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setMaxPartecipanti(int maxPartecipanti) {
		this.maxPartecipanti = maxPartecipanti;
	}

	public Long getId() {
		return id;
	}
	public String getTitolo() {
		return titolo;
	}
	public int getMaxPartecipanti() {
		return maxPartecipanti;
	}
	
	public String toString() {
		return "Evento inserito";
	}

}

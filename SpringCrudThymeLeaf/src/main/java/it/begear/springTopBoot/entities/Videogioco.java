package it.begear.springTopBoot.entities;

import javax.persistence.*;

@Entity  //Questa classe corrisponde a una tabella
@Table(name="videogiochi") //corrisponde al nome della tabella (entità)
public class Videogioco {
	
	@Id  // Obbligatorio
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //ID incrementale su tutta la tabella
	@Column(name = "idvg")  //corrisponde al nome della colonna (attributo)
	private Long id;
	
	@Column(name = "titolo")
	private String titolo;
	
	@Column(name = "genere")
	private String genere;
	
	@Column(name = "longevita")
	private int longevita;
	
	@Column(name = "completato")
	private Boolean completato;

	public Videogioco() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getLongevita() {
		return longevita;
	}

	public void setLongevita(int longevita) {
		this.longevita = longevita;
	}

	public Boolean getCompletato() {
		return completato;
	}

	public void setCompletato(Boolean completato) {
		this.completato = completato;
	}
	
}

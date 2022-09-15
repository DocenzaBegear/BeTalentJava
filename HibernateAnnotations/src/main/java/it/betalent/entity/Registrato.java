package it.betalent.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "registrati")
public class Registrato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="sesso")
	private String sesso;
	
	@OneToMany(targetEntity = Mansione.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "idRegistrati", referencedColumnName="id")
	private List<Mansione> mansioni;
	
	public Registrato() {
	}

	public Registrato(String nome, String cognome, String sesso) {
		setNome(nome);
		setCognome(cognome);
		setSesso(sesso);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public List<Mansione> getMansioni() {
		return mansioni;
	}

	public void setMansioni(List<Mansione> mansioni) {
		mansioni = mansioni;
	}

	@Override
	public String toString() {
		return "Employee: " + this.id + ", " + this.nome + ", " + this.cognome + ", " + this.sesso;
	}
	
}
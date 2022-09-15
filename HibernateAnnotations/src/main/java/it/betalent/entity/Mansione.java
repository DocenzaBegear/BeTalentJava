package it.betalent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mansioni")
public class Mansione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="mansione")
	private String mansione;
	
	public Mansione() {}
	
	public Mansione(int id, String mansione) {
		super();
		this.id = id;
		this.mansione = mansione;
	}
	
	public String getMansione() {
		return mansione;
	}
	public void setMansione(String mansione) {
		this.mansione = mansione;
	}
	
	@Override
	public String toString() {
		return "Mansione [id=" + id + ", mansione=" + mansione + "]";
	}

}

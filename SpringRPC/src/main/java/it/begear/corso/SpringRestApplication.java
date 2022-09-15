package it.begear.corso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.begear.corso.repo.EventoRepo;
import it.begear.corso.risorse.Evento;

@SpringBootApplication
public class SpringRestApplication implements CommandLineRunner{
	
	@Autowired
	EventoRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		
		Evento evento1 = new Evento(01L, "Lezione di Hibernate", 10000);
		Evento evento2 = new Evento(02L, "Festa del gaming", 2);
		System.out.println(repo.save(evento1).toString());
		System.out.println(repo.save(evento2).toString());
		
	}

}
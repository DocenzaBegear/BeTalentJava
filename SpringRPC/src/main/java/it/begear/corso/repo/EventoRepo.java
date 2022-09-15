package it.begear.corso.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import it.begear.corso.risorse.Evento;

public interface EventoRepo extends JpaRepository<Evento, Long>{

}
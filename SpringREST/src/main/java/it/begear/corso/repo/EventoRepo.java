package it.begear.corso.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.begear.corso.risorse.Evento;

@Repository
public interface EventoRepo extends JpaRepository<Evento, Long>{

}
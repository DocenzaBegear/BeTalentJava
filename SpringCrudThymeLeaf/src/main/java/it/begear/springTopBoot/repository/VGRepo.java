package it.begear.springTopBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.begear.springTopBoot.entities.Videogioco;

@Repository
public interface VGRepo extends JpaRepository<Videogioco, Long>{

	//Possibilità di implementare i Query Method
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/ (cap 4)
	
	List<Videogioco> findVideogiocoByGenere(String genere);
	
	//long countByLastname(String lastname);
	//List<Person> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname);
	//List<Person> findByLastnameIgnoreCase(String lastname);
	//Operatori possibili: Between, LessThan, GreaterThan
	
}

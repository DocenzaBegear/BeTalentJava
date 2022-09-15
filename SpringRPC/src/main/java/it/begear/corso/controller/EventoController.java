package it.begear.corso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.begear.corso.repo.EventoRepo;
import it.begear.corso.risorse.Evento;

@RestController
public class EventoController {
	
	@Autowired
	EventoRepo repo;
	
	@GetMapping("/eventi")
	List<Evento> all() {
	    return repo.findAll();
	}
	
	@PostMapping(value = "/eventi", consumes = MediaType.APPLICATION_JSON_VALUE)
	void newEvento(@RequestBody Evento newEvento) {
		System.out.println(repo.save(newEvento).toString());
	}
	
	@PutMapping("/eventi/{id}")
	void updateEvento(@RequestBody Evento updateEvento, @PathVariable Long id) {
		  Optional<Evento> daModificare = repo.findById(id);
			if (daModificare.isPresent()) {
				Evento currentEv = daModificare.get();
				currentEv.setTitolo(updateEvento.getTitolo());
				currentEv.setMaxPartecipanti(updateEvento.getMaxPartecipanti());
				System.out.println(repo.save(currentEv).toString());				
			}
			else {
			System.out.println("Mi spiace");
			}
	  }
	  
	  @DeleteMapping("/eventi/{id}")
	  void deleteEvento(@PathVariable Long id) {
	    repo.deleteById(id);
	  }
	  
}

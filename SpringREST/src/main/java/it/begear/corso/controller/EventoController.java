package it.begear.corso.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.CollectionModel;

import it.begear.corso.repo.EventoRepo;
import it.begear.corso.risorse.Evento;

@RestController
public class EventoController {
	
	@Autowired
	EventoRepo repo;
	
	@GetMapping("/eventi")
	CollectionModel<EntityModel<Evento>> findAll() {
		
		List<Evento> eventi = repo.findAll();
		ArrayList<EntityModel<Evento>> eventiMappati = new ArrayList<EntityModel<Evento>>();
		
		for (Evento ev : eventi) {
			EntityModel<Evento> eventoMappato = new EntityModel<>(ev,
				      linkTo(methodOn(EventoController.class).findOne(ev.getId())).withSelfRel(),
				      linkTo(methodOn(EventoController.class).findAll()).withRel("ciaocari"));
			eventiMappati.add(eventoMappato);
		}
		
		return new CollectionModel<>(eventiMappati,
			    linkTo(methodOn(EventoController.class).findAll()).withSelfRel());
	}
	
	@GetMapping("/eventi/{id}")
	EntityModel<Evento> findOne(@PathVariable Long id) {

		Optional<Evento> eventoDaTrovare = repo.findById(id);
		Evento currentEv = null;
		
		if (eventoDaTrovare.isPresent()) currentEv = eventoDaTrovare.get();
			
	  return new EntityModel<Evento>(currentEv,
	    linkTo(methodOn(EventoController.class).findOne(id)).withSelfRel(),
	    linkTo(methodOn(EventoController.class).findAll()).withRel("eventi"));
	
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

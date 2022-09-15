package it.begear.springTopBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.begear.springTopBoot.entities.Videogioco;
import it.begear.springTopBoot.repository.VGRepo;

@Service
public class VGService {
 
    @Autowired
    private VGRepo repo;
     
    public List<Videogioco> listAll() {
        List <Videogioco> lista = repo.findAll();
        return lista;
    }
     
    public void save(Videogioco product) {
        repo.save(product);
    }
     
    public Videogioco get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
    
    public List<Videogioco> findByGenere(String genere) {
    	return repo.findVideogiocoByGenere(genere);
    }
}


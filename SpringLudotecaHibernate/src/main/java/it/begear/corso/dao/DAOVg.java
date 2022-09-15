package it.begear.corso.dao;
import java.util.List;

import it.begear.corso.entity.Videogioco;

public interface DAOVg {
	
	public void create(Videogioco vg);
	public List<Videogioco> read();
	public void update(Videogioco vg, int id);
	public void delete(List<Integer> idList);

}
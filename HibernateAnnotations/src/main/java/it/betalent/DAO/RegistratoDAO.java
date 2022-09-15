package it.betalent.DAO;

import java.util.List;
import it.betalent.entity.Registrato;

public interface RegistratoDAO {
	
	public List<Registrato> read();
	public Integer create(Registrato e);
	public void update(Registrato reg);
	public void delete(Integer id);
	public Registrato findByID(Integer id);
	public void deleteAll();
	public List<Registrato> trovaMaschi();

}

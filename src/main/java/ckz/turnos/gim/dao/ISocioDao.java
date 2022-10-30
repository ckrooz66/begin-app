package ckz.turnos.gim.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import ckz.turnos.gim.entity.Socio;

public interface ISocioDao extends CrudRepository<Socio, Long>{
	
	public Socio findByDni(String dni);
	
	public List<Socio> findAll();
	@SuppressWarnings("unchecked")
	public Socio save(Socio socio);

}

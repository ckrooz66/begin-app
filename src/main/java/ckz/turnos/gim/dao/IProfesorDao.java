package ckz.turnos.gim.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ckz.turnos.gim.entity.Profesor;

public interface IProfesorDao extends CrudRepository<Profesor,Long> {
	
	
	public   Profesor findByDni(String dni) ;
	public   Optional<Profesor> findById(Long id);
	
	 
	public List<Profesor> findAll();
	
	@SuppressWarnings("unchecked")
	public Profesor save(Profesor profesor);
		
	
	

}

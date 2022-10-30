package ckz.turnos.gim.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ckz.turnos.gim.entity.Turno;

public interface ITurnoDao  extends CrudRepository<Turno, Long> {

	public Optional<Turno> findById(Long id);
	
	public List<Turno> findAll();
	
	@SuppressWarnings("unchecked")
	public Turno save(Turno turno);
}

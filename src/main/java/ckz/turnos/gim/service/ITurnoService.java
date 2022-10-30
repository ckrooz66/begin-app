package ckz.turnos.gim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ckz.turnos.gim.entity.Turno;

@Service
public interface ITurnoService {

	public List<Turno> findAll();
	
	public Optional<Turno> findTurno(Long id);
	
	public void save(Turno turno);
	
	
}

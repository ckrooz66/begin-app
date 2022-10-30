package ckz.turnos.gim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ckz.turnos.gim.dao.ITurnoDao;
import ckz.turnos.gim.entity.Turno;



@Service
public class TurnoServiceImpl  implements ITurnoService{
	
	
	@Autowired
	private ITurnoDao turnodao;

	@Override
	public List<Turno> findAll() {
		 
		return (List<Turno>)turnodao.findAll();
	}

	@Override
	public Optional<Turno> findTurno(Long id) {
		 return turnodao.findById(id);
	}

	@Override
	public void save(Turno turno) {
		turnodao.save(turno);
		
	}

}

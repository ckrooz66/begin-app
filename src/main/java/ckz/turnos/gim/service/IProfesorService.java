package ckz.turnos.gim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ckz.turnos.gim.entity.Profesor;


@Service
public interface IProfesorService {

	public List<Profesor>  findAll();
	
	public Profesor findProfesor(String dni);
	
	public Profesor updateProfesor(Profesor profesor);
	
	public Profesor findProfesorById(Long id);
	
	public void save(Profesor profesor);
	
	
}

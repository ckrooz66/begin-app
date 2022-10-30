package ckz.turnos.gim.service;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ckz.turnos.gim.dao.IProfesorDao;
import ckz.turnos.gim.entity.Profesor;

@Service
public class ProfesorServiceImpl implements IProfesorService{
	
	@Autowired
	private IProfesorDao profesorDao;
	

	@Override
	@Transactional
	public List<Profesor> findAll() {
		return (List<Profesor>) profesorDao.findAll();
		 
	}

	@Override
	public Profesor findProfesor(String dni) {
		return profesorDao.findByDni(dni);
	}

	@Override
	public Profesor updateProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor findProfesorById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void save(Profesor profesor) {
		profesorDao.save(profesor);
		
	}

}

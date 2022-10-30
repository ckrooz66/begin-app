package ckz.turnos.gim.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ckz.turnos.gim.dao.ISocioDao;
import ckz.turnos.gim.entity.Socio;


@Service
public class SocioServiceImpl implements ISocioService{
	
	@Autowired
	private ISocioDao sociodao;

	@Override
	public List<Socio> findAll() {
		// TODO Auto-generated method stub
		return (List<Socio>)sociodao.findAll();
	}

	@Override
	public Socio findSocio(String dni) {
		 
		return sociodao.findByDni(dni);
	}

	@Override
	public Socio updateSocio(Socio socio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Socio findSocioById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void save(Socio socio) {
		sociodao.save(socio);		
	}

}

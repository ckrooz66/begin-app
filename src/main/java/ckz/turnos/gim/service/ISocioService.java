package ckz.turnos.gim.service;



import java.util.List;

import org.springframework.stereotype.Service;

import ckz.turnos.gim.entity.Socio;

@Service
public interface ISocioService {
	
public List<Socio>	findAll();

public Socio findSocio(String dni);

public Socio updateSocio(Socio socio);

public Socio findSocioById(Long id);

public void save(Socio socio);

}

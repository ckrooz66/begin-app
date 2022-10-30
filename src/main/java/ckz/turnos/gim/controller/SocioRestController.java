package ckz.turnos.gim.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ckz.turnos.gim.entity.Socio;
import ckz.turnos.gim.service.ISocioService;

@RestController
@RequestMapping("/socio")
public class SocioRestController {

	@Autowired
	private ISocioService sociosService;
	
	
	@GetMapping("/obtenerSocios")
	@ResponseStatus(HttpStatus.OK)
	public List<Socio> getSocio(){
		
		return sociosService.findAll();
		
		
	};
	
	
	@GetMapping("/obtenerSocio")
	@ResponseStatus(HttpStatus.OK)
	public Socio getSocio(@RequestHeader String dni){
		
		return sociosService.findSocio(dni);
		
		
	};
	
	
	@PostMapping("/addSocio")
	public ResponseEntity<Void>addSocio(@RequestBody Socio socio){
		
		socio.setIngreso(new Date()); 
		sociosService.save(socio);
		 return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	};
	
}
	
	


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

import ckz.turnos.gim.entity.Profesor;
import ckz.turnos.gim.service.IProfesorService;

@RestController
@RequestMapping("/api")
public class ProfesorRestController {

	
	@Autowired
	private IProfesorService profesorService;
	
	
	@GetMapping("/obtenerProfesores")
	@ResponseStatus(HttpStatus.OK)
	public List<Profesor> getProfesores(){
		List<Profesor> lista=profesorService.findAll();
		
		for(Profesor p:lista) {
			
			System.out.println(p);
			
		}
		return  lista;
		
		
	};
	
	
	@GetMapping("/obtenerProfesor")
	@ResponseStatus(HttpStatus.OK)
	public Profesor getProfesor(@RequestHeader String dni){
		
		return profesorService.findProfesor(dni);
		
		
	};
	
	
	@PostMapping("/addProfesor")
	public ResponseEntity<Void>addProfesor(@RequestBody Profesor profesor){
		
		profesor.setIngreso(new Date()); 
		profesorService.save(profesor);
		 return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	};
	
}

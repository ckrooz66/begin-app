package ckz.turnos.gim.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
import ckz.turnos.gim.entity.Turno;
import ckz.turnos.gim.service.ITurnoService;

@RestController
@RequestMapping("/turno")
public class TurnoController {
	
	
  @Autowired
  private ITurnoService turnoservice;
  
  
  
  @GetMapping("/obtenerTurnos")
  
	@ResponseStatus(HttpStatus.OK)
	public List<Turno> getSTurno(){
	  List<Turno> lista=turnoservice.findAll();
		
		for(Turno p:lista) {
			
			System.out.println(p);
			
		}
		return  lista;
		
		
	};
                                 
  
  @GetMapping("/obtenerTurno")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Turno> getTurno(@RequestHeader Long id){
		
		return turnoservice.findTurno(id);
		
		
	}
	
	
	@PostMapping("/addTurno")
	public ResponseEntity<Void>addTurno(@RequestBody Turno turno){
		
		turno.setFechacreacion(new Date()); 
		turnoservice.save(turno);
		 return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
  
  
  
}

package ckz.turnos.gim.entity;


import java.io.Serializable;
import  java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Column;

@Entity
@Table(name="turnos",schema = "sql10530047")
public class Turno  implements Serializable{

 
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fechacreacion")
	@Temporal(TemporalType.DATE)
	private Date fechacreacion;
	
	@Column(name = "fechadeturno")
	@Temporal(TemporalType.DATE)
	private Date fechadeturno;
	
	@Column(name = "estado")
	private int estado;
	
	@ManyToOne
	@JoinColumn(name="profesor_id")
    private Profesor profesor ;
	
	@ManyToOne
	@JoinColumn(name="socio_id")
    private Socio socio ;
	 
	
   
	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	 
	public Date getFechadeturno() {
		return fechadeturno;
	}

	public void setFechadeturno(Date fechadeturno) {
		this.fechadeturno = fechadeturno;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
 
}

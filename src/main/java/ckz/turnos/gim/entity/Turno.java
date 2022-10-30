package ckz.turnos.gim.entity;


import java.io.Serializable;
import  java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	 
    @Column(name="profesor_id" )
	private Long profesor_id;
	
    @Column(name="socio_id"  )
	private Long socio_id;
	
	@Column(name = "fechacreacion")
	@Temporal(TemporalType.DATE)
	private Date fechacreacion;
	
	@Column(name = "fechadeturno")
	@Temporal(TemporalType.DATE)
	private Date fechadeturno;
	
	@Column(name = "estado")
	private int estado;
	
	 
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Long getProfesor_id() {
		return profesor_id;
	}

	public void setProfesor_id(Long profesor_id) {
		this.profesor_id = profesor_id;
	}

	 

	public Long getSocio_id() {
		return socio_id;
	}

	public void setSocio_id(Long socio_id) {
		this.socio_id = socio_id;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	@Override
	public String toString() {
		return "Turno [id=" + id + ", profesor_id=" + profesor_id + ", socio_id=" + socio_id + ", fechacreacion="
				+ fechacreacion + ", fechadeturno=" + fechadeturno + ", estado=" + estado  +" ]";
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

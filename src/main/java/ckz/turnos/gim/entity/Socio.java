package ckz.turnos.gim.entity;


import java.io.Serializable;
import java.util.ArrayList;
import  java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
@Table(name="socio",schema ="sql10530047")
 public class Socio implements Serializable {

	 




	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre"  )
	private String nombre;
	
	@Column(name="apellido"  )
	private String apellido;
	
	@Column(name="dni", unique=true  )
	private String dni;
	
	@Column(name="direccion"  )
	private String direccion;
	@Column(name="estado"  )
	private int estado;
	
	@Column(name="ingreso"  )
	@Temporal(TemporalType.DATE)
	private Date ingreso;
	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="socio_id",referencedColumnName="id")
	private List<Turno> turnos = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getIngreso() {
		return ingreso;
	}

	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}
	
	
	
	@PrePersist
	public void prePersist() {
		ingreso =new Date();
	}
	
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
}

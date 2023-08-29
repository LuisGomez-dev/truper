package com.truper.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name ="clientes")
public class Clientes {

	@Id
	private long idCliente;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="activo")
	private Integer activo;
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	public Clientes(String nombre, Integer activo) {
		super();
		this.nombre = nombre;
		this.activo = activo;
	}
	public Clientes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

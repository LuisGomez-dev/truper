package com.truper.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name ="productos")
public class Productos {
	
	@Id
	private Long idProducto;
	
	@Column(name="clave")
	private String clave;

	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="activo")
	private Integer activo;
	
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Productos(String clave, String descripcion, Integer activo) {
		super();
		this.clave = clave;
		this.descripcion = descripcion;
		this.activo = activo;
	}
	
	
	
	
}

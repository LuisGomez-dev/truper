package com.truper.demo.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name ="listacompra")
public class ListaCompra {
	@Id
	private Long idLista;
	
	@Column(name="customer_id")
	private Long customerId;

	@Column(name="nombre")
	private String nombre;
	
	@Column(name="fechaRegistro")
	private Date fechaRegistro;
	
	@Column(name="fechaultimaActualizacion")
	private Date fechaultimaActualizacion;
	
	@Column(name="activo")
	private Integer activo;
	
	
	public Long getIdLista() {
		return idLista;
	}
	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Date getFechaultimaActualizacion() {
		return fechaultimaActualizacion;
	}
	public void setFechaultimaActualizacion(Date fechaultimaActualizacion) {
		this.fechaultimaActualizacion = fechaultimaActualizacion;
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

	public ListaCompra(Long customerId, String nombre, Date fechaRegistro, Date fechaultimaActualizacion,
			Integer activo) {
		super();
		this.customerId = customerId;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
		this.fechaultimaActualizacion = fechaultimaActualizacion;
		this.activo = activo;
	}
	public ListaCompra() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

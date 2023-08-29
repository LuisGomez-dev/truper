package com.truper.demo.dto;

public class DTOLista {
	private Integer idProducto;
	private Integer cantidad;
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public DTOLista(Integer idProducto, Integer cantidad) {
		super();
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}
	public DTOLista() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

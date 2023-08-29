package com.truper.demo.dto;

import java.util.List;

public class DTOCompras {
	private Long cliente;
	private String lista;
	
	private List<DTOLista> articulos;

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

	public List<DTOLista> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<DTOLista> articulos) {
		this.articulos = articulos;
	}

	public DTOCompras(Long cliente, String lista, List<DTOLista> articulos) {
		super();
		this.cliente = cliente;
		this.lista = lista;
		this.articulos = articulos;
	}

	public DTOCompras() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

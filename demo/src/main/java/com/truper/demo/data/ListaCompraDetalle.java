package com.truper.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity 
@Table(name ="listacompradetalle")
@IdClass(value=ListaCompraDetalleId.class)
public class ListaCompraDetalle {

	@Id
	@Column(name="idListaCompra", insertable = false, updatable = false)
    private Long idListaCompraDetalle;
	
	@Id
	@Column(name="codigoProducto")
	private Long codigoProducto;
	
	@Column(name="idListaCompra")
	private Long idLista;
	
	@Column(name="idCodigoProducto")
	private Long idProducto;
	
	@Column(name="cantidad")
	private Integer cantidad;
	

	public Long getIdLista() {
		return idLista;
	}
	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}

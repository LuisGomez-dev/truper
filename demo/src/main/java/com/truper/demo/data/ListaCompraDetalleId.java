package com.truper.demo.data;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;


public class ListaCompraDetalleId implements Serializable {
	
	private Long idListaCompraDetalle;
	private Long codigoProducto;
	
	public Long getIdListaCompraDetalle() {
		return idListaCompraDetalle;
	}
	public void setIdListaCompraDetalle(Long idListaCompraDetalle) {
		this.idListaCompraDetalle = idListaCompraDetalle;
	}
	public Long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public ListaCompraDetalleId(Long idListaCompraDetalle, Long codigoProducto) {
		super();
		this.idListaCompraDetalle = idListaCompraDetalle;
		this.codigoProducto = codigoProducto;
	}
	public ListaCompraDetalleId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaCompraDetalleId listaCompraDetalleId = (ListaCompraDetalleId) o;
        return idListaCompraDetalle == listaCompraDetalleId.idListaCompraDetalle &&
        		codigoProducto == listaCompraDetalleId.codigoProducto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idListaCompraDetalle, codigoProducto);
    }
	
}

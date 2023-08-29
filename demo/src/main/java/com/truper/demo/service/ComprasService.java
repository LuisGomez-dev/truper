package com.truper.demo.service;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.demo.data.ListaCompra;
import com.truper.demo.data.ListaCompraDetalleRepository;
import com.truper.demo.data.ListaCompraRepository;
import com.truper.demo.dto.DTOCompras;
import com.truper.demo.dto.DTOLista;

import java.util.Date;

@Service
public class ComprasService {
	
	@Autowired
	ListaCompraRepository listaCompraRepository;
	
	@Autowired
	ListaCompraDetalleRepository listaCompraDetalleRepository;
	
	
	public void GuardaCompra(Map<String, Object> responseData, DTOCompras payload) {
		 Date fechaHoy = new Date();
		
	
		ListaCompra listaCompra = 
		listaCompraRepository.save(new ListaCompra(
				payload.getCliente(), payload.getLista(), fechaHoy, fechaHoy,1));
		
		for(DTOLista lista :payload.getArticulos()) {
		
		}
		
		
		
	}
	
	public void getCompra(Map<String, Object> responseData, Long idCliente) {
		
	}
}

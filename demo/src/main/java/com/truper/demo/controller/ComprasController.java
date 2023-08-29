package com.truper.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.truper.demo.dto.DTOCompras;
import com.truper.demo.service.ComprasService;

@RestController
@RequestMapping
public class ComprasController {
	@Autowired
	ComprasService comprasService;
	
	@PostMapping(path="/compras",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE
	)
	Map<String, Object> guardacompra(@RequestBody DTOCompras payload) throws Exception {
	    Map<String, Object> responseData =  new HashMap<>();
	    //String strPayload = new Gson().toJson(payload);

	    comprasService.GuardaCompra(responseData, payload);
	    
		return responseData;
    }
	
    @GetMapping("/compras/{id}")
    Map<String, Object> obtenerCopras(@PathVariable Long id) {
        Map<String, Object> responseData =  new HashMap<>();
        comprasService.getCompra(responseData,id);
        return responseData;
    }
	
	
}

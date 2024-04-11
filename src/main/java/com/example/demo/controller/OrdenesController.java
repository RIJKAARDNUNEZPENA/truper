package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Ordenes;
import com.example.demo.pojo.OrdenRequest;
import com.example.demo.pojo.OrderResponse;
import com.example.demo.service.OrdenesService;

@RestController
public class OrdenesController {
	
	@Autowired
	 private OrdenesService ordenesService;
	
	@PostMapping(value="/guardarOrden")
	public void guardarOrden(@RequestBody OrdenRequest orden) {
		ordenesService.guardarOrden(orden);
	}
	
	@GetMapping(value="/getOrden/{id}")
	public OrderResponse getOrdenes(@PathVariable Long id) {
		return ordenesService.getOrdenes(id);
	}
	
	@PutMapping(value="/updatePrecio")
	public Ordenes updatePrecio(@RequestBody OrdenRequest orden) {
		return ordenesService.updatePrecio(orden);
	}

}

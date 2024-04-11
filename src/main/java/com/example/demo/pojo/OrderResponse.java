package com.example.demo.pojo;

import java.util.List;


public class OrderResponse {

	public OrderResponse() {
		// TODO Auto-generated constructor stub
	}
	
	private OrdenDto orden;
	private List<ProductoDto> productos;
	private SucursalDto sucursales;


	public OrdenDto getOrden() {
		return orden;
	}
	public void setOrden(OrdenDto orden) {
		this.orden = orden;
	}
	public List<ProductoDto> getProductos() {
		return productos;
	}
	public void setProductos(List<ProductoDto> productos) {
		this.productos = productos;
	}
	public SucursalDto getSucursales() {
		return sucursales;
	}
	public void setSucursales(SucursalDto sucursales) {
		this.sucursales = sucursales;
	}
	
	
}

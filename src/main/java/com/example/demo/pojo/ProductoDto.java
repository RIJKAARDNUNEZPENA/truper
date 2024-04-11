package com.example.demo.pojo;

public class ProductoDto {

	public ProductoDto() {
		// TODO Auto-generated constructor stub
	}

	
	private String codigo;
	private String descripcion;
	private Float precio;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	
}

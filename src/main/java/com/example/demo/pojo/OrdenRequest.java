package com.example.demo.pojo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class OrdenRequest {

	public OrdenRequest() {
		// TODO Auto-generated constructor stub
	}
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate fechaOrden;
	private float totalOrden;
	@JsonIgnore
	private long ordenId;
	
	private String codigoProducto;
	private String descripcionProducto;
	private Float precioProducto;
	private String nombreSucursal;
	
	public LocalDate getFechaOrden() {
		return fechaOrden;
	}
	public void setFechaOrden(LocalDate fechaOrden) {
		this.fechaOrden = fechaOrden;
	}
	public float getTotalOrden() {
		return totalOrden;
	}
	public void setTotalOrden(float totalOrden) {
		this.totalOrden = totalOrden;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public Float getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Float precioProducto) {
		this.precioProducto = precioProducto;
	}
	public String getNombreSucursal() {
		return nombreSucursal;
	}
	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}
	public long getOrderId() {
		return ordenId;
	}
	public void setOrderId(long orderId) {
		this.ordenId = orderId;
	}
	
	
	
	
	
}

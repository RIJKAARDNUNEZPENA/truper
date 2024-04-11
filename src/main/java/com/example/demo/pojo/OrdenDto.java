package com.example.demo.pojo;

import java.time.LocalDate;

public class OrdenDto {

	public OrdenDto() {
		// TODO Auto-generated constructor stub
	}
	
	private LocalDate fecha;
	private float total;
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

}

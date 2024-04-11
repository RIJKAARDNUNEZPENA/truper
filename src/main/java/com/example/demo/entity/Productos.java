package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos  implements Serializable {

	public Productos() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long productolId;
	private String codigo;
	private String descripcion;
	private Float precio;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ordenId")
	private Ordenes ordenesList;
	
	
	public Long getProductolId() {
		return productolId;
	}
	public void setProductolId(Long productolId) {
		this.productolId = productolId;
	}
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
	public Ordenes getOrdenes() {
		return ordenesList;
	}
	public void setOrdenes(Ordenes ordenes) {
		this.ordenesList = ordenes;
	}
	
	
}

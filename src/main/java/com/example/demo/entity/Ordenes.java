package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ordenes")
public class Ordenes  implements Serializable {

	public Ordenes() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ordenId;
	private Long sucursarlId;
	private LocalDate fecha;
	private float total;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sucursalId")
	private Sucursales sucursal;
	
	@OneToMany(mappedBy = "ordenesList", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Productos> productos = new ArrayList<>();

	public Long getOrdenId() {
		return ordenId;
	}

	public void setOrdenId(Long ordenId) {
		this.ordenId = ordenId;
	}

	public Long getSucursarlId() {
		return sucursarlId;
	}

	public void setSucursarlId(Long sucursarlId) {
		this.sucursarlId = sucursarlId;
	}

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

	public Sucursales getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursales sucursal) {
		this.sucursal = sucursal;
	}

	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}
	
	


}

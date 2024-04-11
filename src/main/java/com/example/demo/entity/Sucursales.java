package com.example.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sucursales")
public class Sucursales  implements Serializable {

	public Sucursales() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long sucursalId;
	private String nombre;
	@OneToMany(mappedBy = "sucursal", fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    private List<Ordenes> ordenes = new ArrayList<>();
	public Long getSucursalId() {
		return sucursalId;
	}
	public void setSucursalId(Long sucursalId) {
		this.sucursalId = sucursalId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Ordenes> getOrdenes() {
		return ordenes;
	}
	public void setOrdenes(List<Ordenes> ordenes) {
		this.ordenes = ordenes;
	}

	
	
}

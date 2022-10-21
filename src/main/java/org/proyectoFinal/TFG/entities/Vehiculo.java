package org.proyectoFinal.TFG.entities;

import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne
	private Marca nombreMarca;
	@ManyToOne
	private Modelo nombreModelo;
	
	private int plazas;
	
	@OneToMany(mappedBy = "idVehiculo")
	private Collection<Usuario> idVehilo;

	
	
	
	//============================
	
	public Vehiculo() {
	}

	public Vehiculo(Long id, Marca nombreMarca, Modelo nombreModelo, int plazas) {
		super();
		this.id = id;
		this.nombreMarca = nombreMarca;
		this.nombreModelo = nombreModelo;
		this.plazas = plazas;
	}

	//===========================================
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Marca getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(Marca nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public Modelo getNombreModelo() {
		return nombreModelo;
	}

	public void setNombreModelo(Modelo nombreModelo) {
		this.nombreModelo = nombreModelo;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	//===========================================
	

}

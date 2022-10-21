package org.proyectoFinal.TFG.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String nombre;
	
	@OneToMany(mappedBy = "nombreModelo")
	private Collection<Vehiculo> modeloVehiculo;

	
	//==================================
	
		public Modelo() {
			this.modeloVehiculo = new ArrayList<>();
			
		}

		public Modelo(String nombre) {
			super();
			this.modeloVehiculo = new ArrayList<>();
			this.nombre = nombre;
		}
		//======================================
		
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return nombre;
	}

	public void setModelo(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Vehiculo> getLocal() {
		return modeloVehiculo;
	}

	public void setLocal(Collection<Vehiculo> modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}

	
	
	
	
	
}

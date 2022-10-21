package org.proyectoFinal.TFG.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Marca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String nombre;
	
	@OneToMany(mappedBy = "nombreMarca")
	private Collection<Vehiculo> marcaVehiculo;

	
	//==================================
	
		public Marca() {
			this.marcaVehiculo = new ArrayList<>();
			
		}

		public Marca(String nombre) {
			super();
			this.marcaVehiculo = new ArrayList<>();
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
		return marcaVehiculo;
	}

	public void setLocal(Collection<Vehiculo> marcaVehiculo) {
		this.marcaVehiculo = marcaVehiculo;
	}

	
	
	
	
	
}

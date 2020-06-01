package ar.edu.unju.fi.model;
/*
 * @author: Ayelén Raquel Virreyra Ruiz
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Representa un equipo de futbol.
@Component
public class Equipo {
	//Atributos
	//Representa el nombre del equipo.
	private String nombre;
	//Representa al estadio en el que juega el equipo de local.
	@Autowired
	private Estadio estadio;
	
	public Equipo() {
		
	}
	
	public Equipo(String nombre, Estadio estadio) {
		this.nombre=nombre;
		this.estadio=estadio;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
}

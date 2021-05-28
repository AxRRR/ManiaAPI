package com.seriemania.springboot.app.backend.models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Peliculas {

	@Id
	private Long id_pelicula;
	
	private String nombre_pelicula;
	
	private String descripcion_pelicula;
	
	private String reproductor_pelicula;
	
	private Date fecha_pelicula;
	
	private Long subgenero_id;
	
	

	public Long getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(Long id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public String getNombre_pelicula() {
		return nombre_pelicula;
	}

	public void setNombre_pelicula(String nombre_pelicula) {
		this.nombre_pelicula = nombre_pelicula;
	}

	public String getDescripcion_pelicula() {
		return descripcion_pelicula;
	}

	public void setDescripcion_pelicula(String descripcion_pelicula) {
		this.descripcion_pelicula = descripcion_pelicula;
	}

	public String getReproductor_pelicula() {
		return reproductor_pelicula;
	}

	public void setReproductor_pelicula(String reproductor_pelicula) {
		this.reproductor_pelicula = reproductor_pelicula;
	}

	public Date getFecha_pelicula() {
		return fecha_pelicula;
	}

	public void setFecha_pelicula(Date fecha_pelicula) {
		this.fecha_pelicula = fecha_pelicula;
	}

	public Long getSubgenero_id() {
		return subgenero_id;
	}

	public void setSubgenero_id(Long subgenero_id) {
		this.subgenero_id = subgenero_id;
	}

}

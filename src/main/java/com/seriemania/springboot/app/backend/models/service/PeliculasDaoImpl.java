package com.seriemania.springboot.app.backend.models.service;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriemania.springboot.app.backend.models.entity.Peliculas;

@Service
public class PeliculasDaoImpl implements MethodService{

	@Autowired
	private EntityManager em;
	
	@Override
	public Peliculas findByIdOne(Long id) {
		return em.find(Peliculas.class, id);
	}

}

package com.seriemania.springboot.app.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seriemania.springboot.app.backend.models.entity.Peliculas;
import com.seriemania.springboot.app.backend.models.service.MethodService;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api")
public class SeriemaniaController {
	
	@Autowired
	private MethodService method;
	
	@GetMapping("/peliculas/{id}")
	public Peliculas RecibirPeliculas(@PathVariable Long id) {
		return method.findByIdOne(id);
	}

}

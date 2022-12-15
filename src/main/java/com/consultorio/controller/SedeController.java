package com.consultorio.controller;

import com.consultorio.entity.Sede;
import com.consultorio.repository.Mensaje;
import com.consultorio.service.SedeService;


import io.swagger.annotations.ApiOperation;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sede")
@CrossOrigin(origins = "*")
public class SedeController {

  @Autowired
  SedeService sedeService;

  @GetMapping("/")
	@ApiOperation(value = "Metodo trae todas las sedes")
	public ResponseEntity<List<Sede>> getLista() {
		List<Sede> lista = sedeService.obtenerTodos();
		return new ResponseEntity<List<Sede>>(lista, HttpStatus.OK);
	}

  @SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/{idSede}")
	@ApiOperation(value = "Método que trae a un contratista mediante su documento")
	public ResponseEntity<Sede> getOne(@PathVariable Integer idSede) {
		// Valida si existe una persona con ese documento
		if (!sedeService.existsByIdSede(idSede))
			return new ResponseEntity(new Mensaje("No existe una persona con ese documento"), HttpStatus.NOT_FOUND);
		Sede contratista = sedeService.obtenerPorIdSede(idSede).get();
		return new ResponseEntity<Sede>(contratista, HttpStatus.OK);
	}


  
}
  
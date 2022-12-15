package com.consultorio.controller;

import com.consultorio.entity.Consultorio;
import com.consultorio.entity.Sede;
import com.consultorio.repository.Mensaje;
import com.consultorio.service.ConsultorioService;
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
@RequestMapping("/api/consultorio")
@CrossOrigin(origins = "*")
public class ConsultorioController {

  @Autowired
  ConsultorioService consultorioService;

  @GetMapping("/")
	@ApiOperation(value = "Metodo trae todas las sedes")
	public ResponseEntity<List<Consultorio>> getLista() {
		List<Consultorio> lista = consultorioService.obtenerTodos();
		return new ResponseEntity<List<Consultorio>>(lista, HttpStatus.OK);
	}

  @SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/{idConsultorio}")
	@ApiOperation(value = "Método que trae los consultorios")
	public ResponseEntity<Consultorio> getOne(@PathVariable Integer idConsultorio) {
		// Valida si existe una persona con ese documento
		if (!consultorioService.existsByIdConsultorio(idConsultorio))
			return new ResponseEntity(new Mensaje("No existe una persona con ese documento"), HttpStatus.NOT_FOUND);
		Consultorio contratista = consultorioService.obtenerPorIdConsultorio(idConsultorio).get();
		return new ResponseEntity<Consultorio>(contratista, HttpStatus.OK);
	}


  
}
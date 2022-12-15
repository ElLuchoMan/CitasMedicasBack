package com.consultorio.controller;

import com.consultorio.entity.Especialidad;
import com.consultorio.entity.Sede;
import com.consultorio.repository.Mensaje;
import com.consultorio.service.EspecialidadService;
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
@RequestMapping("/api/especialidad")
@CrossOrigin(origins = "*")
public class EspecialidadController {

  @Autowired
  EspecialidadService especialidadService;

  @GetMapping("/")
	@ApiOperation(value = "Metodo trae todas las sedes")
	public ResponseEntity<List<Especialidad>> getLista() {
		List<Especialidad> lista = especialidadService.obtenerTodos();
		return new ResponseEntity<List<Especialidad>>(lista, HttpStatus.OK);
	}

  @SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/{idEspecialidad}")
	@ApiOperation(value = "Método que trae a un contratista mediante su documento")
	public ResponseEntity<Especialidad> getOne(@PathVariable Integer idEspecialidad) {
		// Valida si existe una persona con ese documento
		if (!especialidadService.existsByIdEspecialidad(idEspecialidad))
			return new ResponseEntity(new Mensaje("No existe una especialidad con ese ID"), HttpStatus.NOT_FOUND);
		Especialidad contratista = especialidadService.obtenerPorIdEspecialidad(idEspecialidad).get();
		return new ResponseEntity<Especialidad>(contratista, HttpStatus.OK);
	}


  
}
package com.consultorio.controller;

import com.consultorio.entity.Paciente;
import com.consultorio.repository.Mensaje;
import com.consultorio.service.PacienteService;


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
@RequestMapping("/api/pacientes")
@CrossOrigin(origins = "*")
public class PacienteController {

  @Autowired
  PacienteService pacienteService;

  @GetMapping("/")
	@ApiOperation(value = "Método que trae la lista de todos los contratistas activos")
	public ResponseEntity<List<Paciente>> getLista() {
		List<Paciente> lista = pacienteService.obtenerTodos();
		return new ResponseEntity<List<Paciente>>(lista, HttpStatus.OK);
	}

  @SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/{documento}")
	@ApiOperation(value = "Método que trae a un contratista mediante su documento")
	public ResponseEntity<Paciente> getOne(@PathVariable Integer documento) {
		// Valida si existe una persona con ese documento
		if (!pacienteService.existsByIdentificacion(documento))
			return new ResponseEntity(new Mensaje("No existe una persona con ese documento"), HttpStatus.NOT_FOUND);
		Paciente contratista = pacienteService.obtenerPorIdentificacion(documento).get();
		return new ResponseEntity<Paciente>(contratista, HttpStatus.OK);
	}
  
  
  @SuppressWarnings({ "rawtypes", "unchecked" })
@PostMapping("/nuevo")
  @ApiOperation(value = "Método que crea un nuevo paciente")
  public ResponseEntity<?> create(@RequestBody Paciente paciente) {
   // Valida si existe una persona con ese documento
   if (pacienteService.existsByIdentificacion(paciente.getIdentificacion()))
     return new ResponseEntity(new Mensaje("Ya existe una persona con esa identificacion"), HttpStatus.BAD_REQUEST);
   if (pacienteService.existsByEmail(paciente.getEmail()))
	     return new ResponseEntity(new Mensaje("Ya existe una persona con ese email"), HttpStatus.BAD_REQUEST);
    if (StringUtils.isBlank(paciente.getNombre()))
      return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
    if (StringUtils.isBlank(paciente.getEmail()))
        return new ResponseEntity(new Mensaje("El email es obligatorio"), HttpStatus.BAD_REQUEST);
    if (paciente.getIdentificacion()==null)
        return new ResponseEntity(new Mensaje("La identificación es obligatoria"), HttpStatus.BAD_REQUEST);
    if(pacienteService.existsByIdentificacion(paciente.getIdentificacion()))
      return new ResponseEntity(new Mensaje("Ya existe una persona con esa identificacion"), HttpStatus.BAD_REQUEST);
    try {
      pacienteService.guardar(paciente);
      return new ResponseEntity(new Mensaje("Paciente creado"), HttpStatus.OK);
    } catch (Exception e) {
      e.printStackTrace();
      return new ResponseEntity(new Mensaje("Error al crear el paciente"), HttpStatus.BAD_REQUEST);
    }
}
  }

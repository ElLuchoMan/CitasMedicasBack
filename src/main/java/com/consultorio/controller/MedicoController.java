package com.consultorio.controller;

import com.consultorio.entity.Medico;
import com.consultorio.repository.Mensaje;
import com.consultorio.service.MedicoService;


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
@RequestMapping("/api/medicos")
@CrossOrigin(origins = "*")
public class MedicoController {

  @Autowired
  MedicoService medicoService;

  @GetMapping("/")
	@ApiOperation(value = "Método que trae la lista de todos los contratistas activos")
	public ResponseEntity<List<Medico>> getLista() {
		List<Medico> lista = medicoService.obtenerTodos();
		return new ResponseEntity<List<Medico>>(lista, HttpStatus.OK);
	}

  @SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/{documento}")
	@ApiOperation(value = "Método que trae a un contratista mediante su documento")
	public ResponseEntity<Medico> getOne(@PathVariable Integer documento) {
		if (!medicoService.existsByIdentificacion(documento))
			return new ResponseEntity(new Mensaje("No existe una persona con ese documento"), HttpStatus.NOT_FOUND);
		Medico contratista = medicoService.obtenerPorIdentificacion(documento).get();
		return new ResponseEntity<Medico>(contratista, HttpStatus.OK);
	}
  
  
  @SuppressWarnings({ "rawtypes", "unchecked" })
@PostMapping("/nuevo")
  @ApiOperation(value = "Método que crea un nuevo Medico")
  public ResponseEntity<?> create(@RequestBody Medico medico) {
   // Valida si existe una persona con ese documento
   if (medicoService.existsByIdentificacion(medico.getIdentificacion()))
     return new ResponseEntity(new Mensaje("Ya existe una persona con esa identificacion"), HttpStatus.BAD_REQUEST);
   if (medicoService.existsByEmail(medico.getEmail()))
	     return new ResponseEntity(new Mensaje("Ya existe una persona con ese email"), HttpStatus.BAD_REQUEST);
    if (StringUtils.isBlank(medico.getNombre()))
      return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
    if (StringUtils.isBlank(medico.getEmail()))
        return new ResponseEntity(new Mensaje("El email es obligatorio"), HttpStatus.BAD_REQUEST);
    if (medico.getIdentificacion()==null)
        return new ResponseEntity(new Mensaje("La identificación es obligatoria"), HttpStatus.BAD_REQUEST);
    if(medicoService.existsByIdentificacion(medico.getIdentificacion()))
      return new ResponseEntity(new Mensaje("Ya existe una persona con esa identificacion"), HttpStatus.BAD_REQUEST);
    try {
      medicoService.guardar(medico);
      return new ResponseEntity(new Mensaje("Medico creado"), HttpStatus.OK);
    } catch (Exception e) {
      e.printStackTrace();
      return new ResponseEntity(new Mensaje("Error al crear el Medico"), HttpStatus.BAD_REQUEST);
    }
}
  }

package com.consultorio.controller;

import com.consultorio.entity.Cita;
import com.consultorio.repository.Mensaje;
import com.consultorio.service.CitaService;


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
@RequestMapping("/api/citas")
@CrossOrigin(origins = "*")
public class CitaController {

  @Autowired
  CitaService citaService;

  @GetMapping("/")
	@ApiOperation(value = "Método que trae la lista de todos las citas")
	public ResponseEntity<List<Cita>> getLista() {
		List<Cita> lista = citaService.obtenerTodos();
		return new ResponseEntity<List<Cita>>(lista, HttpStatus.OK);
	}

  @SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/{IdCita}")
	@ApiOperation(value = "Método que trae a un contratista mediante su documento")
	public ResponseEntity<Cita> getOne(@PathVariable Integer idCita) {
		// Valida si existe una persona con ese documento
		if (!citaService.existsByIdCita(idCita))
			return new ResponseEntity(new Mensaje("No existe una cita con este ID"), HttpStatus.NOT_FOUND);
		Cita contratista = citaService.obtenerPorIdCita(idCita).get();
		return new ResponseEntity<Cita>(contratista, HttpStatus.OK);
	}
  
  
  @SuppressWarnings({ "rawtypes", "unchecked" })
@PostMapping("/nuevo")
  @ApiOperation(value = "Método que crea un nuevo cita")
  public ResponseEntity<?> create(@RequestBody Cita cita) {
   // Valida si existe una persona con ese documento
      // Valida si existe una persona con ese documento
    if (citaService.existsByIdCita(cita.getIdCita()))
      return new ResponseEntity(new Mensaje("Ya existe una persona con esa idCita"), HttpStatus.BAD_REQUEST);
     if(citaService.existsByIdCita(cita.getIdCita()))
       return new ResponseEntity(new Mensaje("Ya existe una cita con esa idCita"), HttpStatus.BAD_REQUEST);
     try {
       citaService.guardar(cita);
       return new ResponseEntity(new Mensaje("cita creado"), HttpStatus.OK);
     } catch (Exception e) {
       e.printStackTrace();
       return new ResponseEntity(new Mensaje("Error al crear el cita"), HttpStatus.BAD_REQUEST);
     }
 }
   }
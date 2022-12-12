package com.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consultorio.entity.HistoriaMedica;
import com.consultorio.entity.Paciente;
import com.consultorio.repository.Mensaje;
import com.consultorio.service.HistoriaMedicaService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/historiasMedicas")
@CrossOrigin(origins = "*")
public class HistoriaMedicaController {
	  @Autowired
	  HistoriaMedicaService historiaMedicaService;
	  
	  @SuppressWarnings({ "rawtypes", "unchecked" })
	  @GetMapping("/{idHistoriaMedica}")
	    @ApiOperation(value = "Método que trae una historia mediante su id")
	    public ResponseEntity<HistoriaMedica> getOne(@PathVariable Integer idHistoriaMedica) {
	  	if (!historiaMedicaService.existsByIdHistoria(idHistoriaMedica))
	  		return new ResponseEntity(new Mensaje("No existe una historia con ese id"), HttpStatus.NOT_FOUND);
	  	HistoriaMedica paciente = historiaMedicaService.findByIdHistoria(idHistoriaMedica).get();
	  	return new ResponseEntity<HistoriaMedica>(paciente, HttpStatus.OK);
	    }

}

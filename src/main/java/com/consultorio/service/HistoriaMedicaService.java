package com.consultorio.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultorio.entity.HistoriaMedica;
import com.consultorio.repository.HistoriaMedicaRepository;

@Service
@Transactional
public class HistoriaMedicaService {
	  @Autowired
	  HistoriaMedicaRepository historiaMedicaRepository;
	  
	  public Optional<HistoriaMedica> findByIdHistoria(Integer idHistoria) {
		    return historiaMedicaRepository.findByIdHistoria(idHistoria);
		  }
	  public boolean existsByIdHistoria(Integer idHistoria) {
		  return historiaMedicaRepository.existsById(idHistoria);		  
	  }
	  public Optional<HistoriaMedica> getByIdHistoria(Integer idHistoria) {
		  return historiaMedicaRepository.findByIdHistoria(idHistoria);
	  }
	  public void deleteByIdHistoria(Integer identificacion) {
		  historiaMedicaRepository.deleteByIdHistoria(identificacion);
		  }
	  public void guardar(HistoriaMedica historiaMedica) {
		  historiaMedicaRepository.save(historiaMedica);
		  }
	  public List<HistoriaMedica> findAll() {
		    List<HistoriaMedica> lista = historiaMedicaRepository.findAll();
		    return lista;
		  }
	 
}

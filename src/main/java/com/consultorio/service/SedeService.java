package com.consultorio.service;

import com.consultorio.entity.Sede;
import com.consultorio.repository.SedeRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SedeService {

  @Autowired
  SedeRepository sedeRepository;

  public Optional<Sede> obtenerPorIdSede(Integer idSede) {
    return sedeRepository.findByIdSede(idSede);
  }

  public void deleteByIdSede(Integer idSede) {
    sedeRepository.deleteByIdSede(idSede);
  }

  public void guardar(Sede sede) {
    sedeRepository.save(sede);
  }

  public List<Sede> obtenerTodos() {
		List<Sede> lista = sedeRepository.obtenerTodos();
		return lista;
	}

  public boolean existsByIdSede(Integer idSede) {
    return sedeRepository.existsByIdSede(idSede);
  }

}
package com.consultorio.service;

import com.consultorio.entity.Especialidad;
import com.consultorio.repository.EspecialidadRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EspecialidadService {

  @Autowired
  EspecialidadRepository especialidadRepository;

  public Optional<Especialidad> obtenerPorIdEspecialidad(Integer idEspecialidad) {
    return especialidadRepository.findByIdEspecialidad(idEspecialidad);
  }

  public void deleteById_sede(Integer idEspecialidad) {
    especialidadRepository.deleteByIdEspecialidad(idEspecialidad);
  }

  public void guardar(Especialidad especialidad) {
    especialidadRepository.save(especialidad);
  }

  public List<Especialidad> obtenerTodos() {
		List<Especialidad> lista = especialidadRepository.obtenerTodos();
		return lista;
	}

  public boolean existsByIdEspecialidad(Integer idEspecialidad) {
    return especialidadRepository.existsByIdEspecialidad(idEspecialidad);
  }

}

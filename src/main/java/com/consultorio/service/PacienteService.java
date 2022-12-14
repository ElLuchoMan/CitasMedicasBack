package com.consultorio.service;

import com.consultorio.entity.Paciente;
import com.consultorio.repository.PacienteRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PacienteService {

  @Autowired
  PacienteRepository pacienteRepository;

  public Optional<Paciente> obtenerPorIdentificacion(Integer identificacion) {
    return pacienteRepository.findByIdentificacion(identificacion);
  }

  public boolean existsByIdentificacion(Integer identificacion) {
    return pacienteRepository.existsByIdentificacion(identificacion);
  }
  public boolean existsByEmail(String correo) {
	    return pacienteRepository.existsByEmail(correo);
	  }

  public void deleteByIdentificacion(Integer identificacion) {
    pacienteRepository.deleteByIdentificacion(identificacion);
  }

  public void guardar(Paciente paciente) {
    pacienteRepository.save(paciente);
  }

  public List<Paciente> obtenerTodos() {
		List<Paciente> lista = pacienteRepository.obtenerTodos();
		return lista;
	}
}

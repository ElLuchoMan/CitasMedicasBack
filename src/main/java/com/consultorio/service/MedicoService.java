package com.consultorio.service;

import com.consultorio.entity.Medico;
import com.consultorio.repository.MedicoRepository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MedicoService {

  @Autowired
  MedicoRepository medicoRepository;

  public Optional<Medico> obtenerPorIdentificacion(BigInteger identificacion) {
    return medicoRepository.findByIdentificacion(identificacion);
  }

  public boolean existsByIdentificacion(BigInteger identificacion) {
    return medicoRepository.existsByIdentificacion(identificacion);
  }
  public boolean existsByEmail(String correo) {
	    return medicoRepository.existsByEmail(correo);
	  }

  public void deleteByIdentificacion(BigInteger identificacion) {
    medicoRepository.deleteByIdentificacion(identificacion);
  }

  public void guardar(Medico paciente) {
    medicoRepository.save(paciente);
  }

  public List<Medico> obtenerTodos() {
		List< Medico> lista = medicoRepository.obtenerTodos();
		return lista;
	}
}

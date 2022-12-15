package com.consultorio.service;

import com.consultorio.entity.Cita;
import com.consultorio.repository.CitaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CitaService {

  @Autowired
  CitaRepository citaRepository;

  public Optional<Cita> obtenerPorIdCita(Integer idCita) {
    return citaRepository.findByIdCita(idCita);
  }

  public boolean existsByIdCita(Integer idCita) {
    return citaRepository.existsByIdCita(idCita);
  }

  public void deleteByIdCita(Integer idCita) {
    citaRepository.deleteByIdCita(idCita);
  }

  public void guardar(Cita paciente) {
    citaRepository.save(paciente);
  }

  public List<Cita> obtenerTodos() {
		List<Cita> lista = citaRepository.obtenerTodos();
		return lista;
	}
}
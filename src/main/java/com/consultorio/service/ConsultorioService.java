package com.consultorio.service;

import com.consultorio.entity.Consultorio;
import com.consultorio.repository.ConsultorioRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ConsultorioService {

  @Autowired
  ConsultorioRepository consultorioRepository;

  public Optional<Consultorio> obtenerPorIdConsultorio(Integer idConsultorio) {
    return consultorioRepository.findByIdConsultorio(idConsultorio);
  }

  public void deleteById_sede(Integer idConsultorio) {
    consultorioRepository.deleteByIdConsultorio(idConsultorio);
  }

  public void guardar(Consultorio Consultorio) {
    consultorioRepository.save(Consultorio);
  }

  public List<Consultorio> obtenerTodos() {
		List<Consultorio> lista = consultorioRepository.obtenerTodos();
		return lista;
	}

  public boolean existsByIdConsultorio(Integer idConsultorio) {
    return consultorioRepository.existsByIdConsultorio(idConsultorio);
  }

}
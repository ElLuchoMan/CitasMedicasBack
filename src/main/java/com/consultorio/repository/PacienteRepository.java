package com.consultorio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.consultorio.entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Number>{
Optional<Paciente> findByIdentificacion(Integer identificacion);
boolean existsByIdentificacion(Integer identificacion);
boolean existsByEmail(String correo);
void deleteByIdentificacion(Number identificacion);
@Query("FROM Paciente p WHERE p.estado='Activo'")
public List<Paciente> obtenerTodos();
}

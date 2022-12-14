package com.consultorio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.consultorio.entity.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico,Number>{
Optional<Medico> findByIdentificacion(Integer identificacion);
boolean existsByIdentificacion(Integer identificacion);
boolean existsByEmail(String correo);
void deleteByIdentificacion(Number identificacion);
@Query("FROM Medico p WHERE p.estado='Activo'")
public List<Medico> obtenerTodos();
}

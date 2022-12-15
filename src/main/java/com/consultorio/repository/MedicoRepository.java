package com.consultorio.repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.consultorio.entity.Medico;
@Repository
public interface MedicoRepository extends JpaRepository<Medico,Number>{
Optional<Medico> findByIdentificacion(BigInteger identificacion);
boolean existsByIdentificacion(BigInteger identificacion);
boolean existsByEmail(String correo);
void deleteByIdentificacion(BigInteger identificacion);
@Query("FROM Medico p")
public List<Medico> obtenerTodos();
}

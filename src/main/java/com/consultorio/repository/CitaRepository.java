package com.consultorio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.consultorio.entity.Cita;

public interface CitaRepository extends JpaRepository<Cita, Number>{
	Optional<Cita> findByIdentificacion(Integer identificacion);
	boolean existsByIdentificacion(Integer identificacion);
	boolean existsByEmail(String correo);
	void deleteByIdentificacion(Number identificacion);
	@Query("FROM Cita p WHERE")
	public List<Cita> obtenerTodos();
}

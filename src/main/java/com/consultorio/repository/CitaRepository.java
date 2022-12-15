package com.consultorio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.consultorio.entity.Cita;

public interface CitaRepository extends JpaRepository<Cita, Number>{
	Optional<Cita> findByIdCita(Integer idCita);
	boolean existsByIdCita(Integer idCita);
	void deleteByIdCita(Number idCita);
	@Query("FROM Cita p  ")
	public List<Cita> obtenerTodos();
}

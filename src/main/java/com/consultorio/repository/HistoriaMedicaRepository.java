package com.consultorio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.consultorio.entity.HistoriaMedica;

@Repository
public interface HistoriaMedicaRepository extends JpaRepository<HistoriaMedica, Number> {
	@Query("SELECT h FROM HistoriaMedica h WHERE idHistoria=k_id_historia")
	Optional<HistoriaMedica> findByIdHistoria(Integer idHistoria);
	boolean existsByIdHistoria(Integer idHistoria);
	void deleteByIdHistoria(Number idHistoria);
}

package com.consultorio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.consultorio.entity.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad,Number>{
    Optional<Especialidad> findByIdEspecialidad(Integer idEspecialidad);
    void deleteByIdEspecialidad(Number idEspecialidad);
    @Query("FROM Especialidad s")
    public List<Especialidad> obtenerTodos();
    boolean existsByIdEspecialidad(Integer idEspecialidad);
}
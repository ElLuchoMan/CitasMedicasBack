package com.consultorio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.consultorio.entity.Consultorio;

@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio,Number> {

    Optional<Consultorio> findByIdConsultorio(Integer idConsultorio);
    void deleteByIdConsultorio(Number idConsultorio);
    @Query("FROM Consultorio s")
    public List<Consultorio> obtenerTodos();
    boolean existsByIdConsultorio(Integer idConsultorio);

 
}

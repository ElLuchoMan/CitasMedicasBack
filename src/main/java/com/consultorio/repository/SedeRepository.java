package com.consultorio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.consultorio.entity.Sede;

@Repository
public interface SedeRepository extends JpaRepository<Sede,Number> {

    Optional<Sede> findByIdSede(Integer idSede);
    void deleteByIdSede(Number idSede);
    @Query("FROM Sede s")
    public List<Sede> obtenerTodos();
    boolean existsByIdSede(Integer idSede);

 
}

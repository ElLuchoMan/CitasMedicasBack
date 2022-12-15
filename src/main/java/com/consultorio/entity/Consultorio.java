package com.consultorio.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "consultorio")
public class Consultorio {

  @Id
  @Column(name = "k_id_consultorio")
  private Integer idConsultorio;

  @Column(name = "k_id_sede")
  private Integer idSede;
  @Column(name = "k_id_especialidad")
  private Integer idEspecialidad;

public Integer getIdEspecialidad() {
      return this.idEspecialidad;
  }

public void setIdEspecialidad(Integer idEspecialidad) {
      this.idEspecialidad = idEspecialidad;
  }

public Integer getIdConsultorio() {
    return this.idConsultorio;
}

public void setIdConsultorio(Integer idConsultorio) {
    this.idConsultorio = idConsultorio;
}


public Integer getIdSede() {
    return this.idSede;
}

public void setIdSede(Integer idSede) {
    this.idSede = idSede;
}



}
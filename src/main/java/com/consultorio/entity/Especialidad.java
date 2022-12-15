
package com.consultorio.entity;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.CascadeType;
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

@Entity
@Table(name = "especialidad")
public class Especialidad {

  @Id
  //Se declara cada tabla
  @Column(name = "k_id_especialidad")
  private Integer idEspecialidad;

  @Column(name = "n_nombre")
  private String nombreEspecialidad;

  @Column(name = "k_id_equipo")
  private Integer idEquipo;

  public Integer getIdEquipo() {
      return this.idEquipo;
  }

  public void setIdEquipo(Integer idEquipo) {
      this.idEquipo = idEquipo;
  }


public Integer getIdEspecialidad() {
    return this.idEspecialidad;
}

public void setIdEspecialidad(Integer idEspecialidad) {
    this.idEspecialidad = idEspecialidad;
}
public String getNombreEspecialidad() {
    return this.nombreEspecialidad;
}

public void setNombreEspecialidad(String nombreEspecialidad) {
    this.nombreEspecialidad = nombreEspecialidad;
}


}
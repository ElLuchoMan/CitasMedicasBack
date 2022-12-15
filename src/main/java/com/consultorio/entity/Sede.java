
package com.consultorio.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sede")
public class Sede {

  @Id
  //Se declara cada tabla
  @Column(name = "k_id_sede")
  private Integer idSede;

  @Column(name = "n_nombre")
  private String nombreSede;

  @Column(name = "o_direccion")
  private String direccion;

  @Column(name = "k_telefono")
  private Integer telefono;

  @Column(name = "k_id_eps")
  private Integer idEps;

public Integer getIdSede() {
    return this.idSede;
}

public void setId_sede(Integer idSede) {
    this.idSede = idSede;
}

public String getNombreSede() {
    return this.nombreSede;
}

public void setNombre_sede(String nombreSede) {
    this.nombreSede = nombreSede;
}
  
public String getDireccion() {
    return this.direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public Integer getTelefono() {
    return this.telefono;
}

public void setTelefono(Integer telefono) {
    this.telefono = telefono;
} 


public Integer getIdEps() {
    return this.idEps;
}

public void setId_eps(Integer idEps) {
    this.idEps = idEps;
} 


}
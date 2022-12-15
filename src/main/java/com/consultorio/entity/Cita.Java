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
@Table(name = "cita")
public class Cita {

  @Id
  @Column(name = "k_id_cita")
  private Integer idCita;

  @Column(name = "f_cita")
  private Date fechaCita;

  @Column(name = "o_tipo_cita")
  private Integer tipoCita;

  @Column(name = "o_hora_cita")
  private String horaCita;

  @Column(name = "k_numero")
  private Integer consultorio;

  @Column(name = "k_id_sede")
  private Integer idSede;

  @Column(name = "k_num_identificacion")
  private Integer numeroIde;

  @Column(name = "v_copago")
  private Integer copago;

public Integer getIdCita() {
	return idCita;
}

public void setIdCita(Integer idCita) {
	this.idCita = idCita;
}

public Date getFechaCita() {
	return fechaCita;
}

public void setFechaCita(Date fechaCita) {
	this.fechaCita = fechaCita;
}

public Integer getTipoCita() {
	return tipoCita;
}

public void setTipoCita(Integer tipoCita) {
	this.tipoCita = tipoCita;
}

public String getHoraCita() {
	return horaCita;
}

public void setHoraCita(String horaCita) {
	this.horaCita = horaCita;
}

public Integer getConsultorio() {
	return consultorio;
}

public void setConsultorio(Integer consultorio) {
	this.consultorio = consultorio;
}

public Integer getIdSede() {
	return idSede;
}

public void setIdSede(Integer idSede) {
	this.idSede = idSede;
}

public Integer getNumeroIde() {
	return numeroIde;
}

public void setNumeroIde(Integer numeroIde) {
	this.numeroIde = numeroIde;
}

public Integer getCopago() {
	return copago;
}

public void setCopago(Integer copago) {
	this.copago = copago;
}


}

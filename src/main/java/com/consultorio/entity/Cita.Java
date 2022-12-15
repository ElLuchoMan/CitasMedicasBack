
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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cita")
public class Cita {

  @Id
  //Se declara cada tabla
  @Column(name = "k_id_cita")
  private Integer idCita;

	public Integer getIdCita() {
		return this.idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}


  @Column(name = "f_cita")
  private Date fechaCita;

	public Date getFechaCita() {
		return this.fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}



  @Column(name = "o_tipo_cita")
  private Integer tipoCita;

	public Integer getTipoCita() {
		return this.tipoCita;
	}

	public void setTipoCita(Integer tipoCita) {
		this.tipoCita = tipoCita;
	}


  @Column(name = "o_hora_cita")
  private String horaCita;

	public String getHoraCita() {
		return this.horaCita;
	}

	public void setHoraCita(String horaCita) {
		this.horaCita = horaCita;
	}


  @Column(name = "k_numero")
  private Integer idConsultorio;

	public Integer getIdConsultorio() {
		return this.idConsultorio;
	}

	public void setIdConsultorio(Integer idConsultorio) {
		this.idConsultorio = idConsultorio;
	}


  @Column(name = "k_id_sede")
  private Integer idSede;

	public Integer getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

  @Column(name = "k_num_identificacion")
  private Integer numeroIde;

	public Integer getNumeroIde() {
		return this.numeroIde;
	}

	public void setNumeroIde(Integer numeroIde) {
		this.numeroIde = numeroIde;
	}


  @Column(name = "v_copago")

  private Integer copago;

	public Integer getCopago() {
		return this.copago;
	}

	public void setCopago(Integer copago) {














}
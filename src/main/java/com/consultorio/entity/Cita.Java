package com.consultorio.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
  private Integer horaCita;

	public Integer getHoraCita() {
		return this.horaCita;
	}

	public void setHoraCita(Integer horaCita) {
		this.horaCita = horaCita;
	}


  @Column(name = "k_id_sede")
  private Integer horaCita;

	public Integer getHoraCita() {
		return this.horaCita;
	}

	public void setHoraCita(Integer horaCita) {
		this.horaCita = horaCita;
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

	public = get"V_copago")() {
		return this."v_copago");
	}

	public void set"V_copago")(= "v_copago")) {
		this."v_copago") = "v_copago");
	}

  private Integer copago;















}
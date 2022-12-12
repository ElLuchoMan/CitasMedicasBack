package com.consultorio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"historiaMedica\"")
public class HistoriaMedica {
	@Id
	  @Column(name = "k_id_historia")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer idHistoria;
	@OneToOne(mappedBy = "historiaMedica")
		private Paciente paciente;
	public Integer getIdHistoria() {
		return idHistoria;
	}
	public void setIdHistoria(Integer idHistoria) {
		this.idHistoria = idHistoria;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


}

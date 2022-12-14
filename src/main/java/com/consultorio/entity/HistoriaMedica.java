package com.consultorio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "\"historiaMedica\"")
@SequenceGenerator(name = "HistoriaMedicaSec", sequenceName = "historiaMedicaSeq", initialValue = 1, allocationSize = 1)
public class HistoriaMedica {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HistoriaMedicaSec")
	@Column(name = "k_id_historia")
	  private Integer idHistoria;
	@OneToOne(mappedBy = "historiaMedica") 
	@JsonIgnore
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

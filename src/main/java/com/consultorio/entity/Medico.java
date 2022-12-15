package com.consultorio.entity;

import java.util.Date;
import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico {
@Id
@Column(name="k_num_identificacion")
private BigInteger identificacion;

@Column(name="o_tipo_documento")
private String tipoDocumento;

@Column(name = "v_telefono_contacto", nullable = false)
  private BigInteger telefono;

@Column(name = "v_telefono_cel", nullable = false)
private BigInteger celular;

@Column(name = "n_nombre", nullable = false)
private String nombre;

@Column(name = "n_apellido", nullable = false)
private String apellido;

@Column(name = "f_nacimiento")
private Date fechaNacimiento;

@Column(name = "o_especialidad", nullable = false)
private String  especialidad;

@Column(name = "o_registro", nullable = false, unique = true)
private String  registroMedico;

@Column(name = "o_sexo", nullable = false)
private String sexo;

@Column(name = "o_c_electronico", nullable = false, unique = true)
private String email;

@ManyToOne
@JoinColumn(name = "o_numero")
public Consultorio consultorio;

@Column(name = "k_id_sede", nullable = false, unique = true)
private Integer  sede;


public Integer getSede() {
	return sede;
}

public void setSede(Integer sede) {
	this.sede = sede;
}

public BigInteger getIdentificacion() {
	return identificacion;
}

public void setIdentificacion(BigInteger identificacion) {
	this.identificacion = identificacion;
}

public String getTipoDocumento() {
	return tipoDocumento;
}

public void setTipoDocumento(String tipoDocumento) {
	this.tipoDocumento = tipoDocumento;
}

public BigInteger getTelefono() {
	return telefono;
}

public void setTelefono(BigInteger telefono) {
	this.telefono = telefono;
}

public BigInteger getCelular() {
	return celular;
}

public void setCelular(BigInteger celular) {
	this.celular = celular;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public Date getFechaNacimiento() {
	return fechaNacimiento;
}

public void setFechaNacimiento(Date fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}

public String getEspecialidad() {
	return especialidad;
}

public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}

public String getRegistroMedico() {
	return registroMedico;
}

public void setRegistroMedico(String registroMedico) {
	this.registroMedico = registroMedico;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Consultorio getConsultorio() {
	return consultorio;
}

public void setConsultorio(Consultorio consultorio) {
	this.consultorio = consultorio;
}
}

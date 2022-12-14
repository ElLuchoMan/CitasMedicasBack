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

@Entity
@Table(name = "paciente")
public class Paciente {

  @Id
  @Column(name = "k_num_identificacion")
  private Integer identificacion;

  @Column(name = "o_tipo_documento")
  private String tipoDocumento;

  @Column(name = "v_telefono_contacto", nullable = false, unique = true)
  private BigInteger telefono;

  @Column(name = "v_telefono_cel", nullable = false)
  private BigInteger celular;

  @Column(name = "n_nombre", nullable = false, length = 50)
  private String nombre;

  @Column(name = "n_apellido", nullable = false, length = 50)
  private String apellido;

  @Column(name = "f_nacimiento")
  private Date fechaNacimiento;

  @Column(name = "o_sexo", nullable = false, unique = true)
  private String sexo;

  @Column(name = "o_c_electronico", nullable = false, unique = true)
  private String email;

  @Column(name = "i_estado", nullable = false, unique = true)
  private String estado;

  @Column(name = "o_categoria", nullable = false, unique = true)
  private String categoria;

  @Column(name = "v_multa", nullable = true, unique = true)
  private Integer multa;

  @OneToOne(cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
  @JoinColumn(name = "k_id_historia", referencedColumnName = "k_id_historia")
  private HistoriaMedica historiaMedica;

public Integer getIdentificacion() {
	return identificacion;
}

public void setIdentificacion(Integer identificacion) {
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

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public Integer getMulta() {
	return multa;
}

public void setMulta(Integer multa) {
	this.multa = multa;
}

public HistoriaMedica getHistoriaMedica() {
	return historiaMedica;
}

public void setHistoriaMedica(HistoriaMedica historiaMedica) {
	this.historiaMedica = historiaMedica;
}

  
}

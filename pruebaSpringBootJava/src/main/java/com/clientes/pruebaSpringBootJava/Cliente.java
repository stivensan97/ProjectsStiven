package com.clientes.pruebaSpringBootJava;


import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name ="tcus_clientes")
public class Cliente {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger nmid;
	
	@Column
	private int cus_nmCliente;
	
	@Column
	private String cus_dsNombres;
	
	@Column 
	private String cus_dsApellidos;
	
	@Column
	private String cus_dsDireccion;
	
	@Column
	private String cus_dsCorreo;
	
	@Column 
	private String cus_cdTelefono;
	
	@Column
	private String cus_cdTelefonoalter;
	
	@Column
	private String cus_cdCelular;
	
	@Column
	private int cus_nmCargo;
	
	@Column
	private String cus_dsCargo;
	
	@Column
	private int cus_nmCiudad;
	
	@Column
	private String cus_dsCiudad;
	
	@Column
	private Date cus_feNacimiento;
	
	@Column
	private String cus_genero;
	
	@Column
	private int cus_nmComunidad;
	
	@Column
	private String cus_dsComunidad;

	@Column
	private String dsEmpresaLabora;
	
	@Column
	private int cus_nmDivision;
	
	@Column
	private String cus_dsDivision;
	
	@Column
	private int cus_nmPais; 
	
	@Column
	private String cus_dsPais;
	
	@Column
	private String cus_hobbies;
	
	@Column 
	private Date cus_feBaja;
	
	@Column
	private Date cus_feRegistro;

	public BigInteger getNmid() {
		return nmid;
	}

	public void setNmid(BigInteger nmid) {
		this.nmid = nmid;
	}

	public int getCus_nmCliente() {
		return cus_nmCliente;
	}

	public void setCus_nmCliente(int cus_nmCliente) {
		this.cus_nmCliente = cus_nmCliente;
	}

	public String getCus_dsNombres() {
		return cus_dsNombres;
	}

	public void setCus_dsNombres(String cus_dsNombres) {
		this.cus_dsNombres = cus_dsNombres;
	}

	public String getCus_dsApellidos() {
		return cus_dsApellidos;
	}

	public void setCus_dsApellidos(String cus_dsApellidos) {
		this.cus_dsApellidos = cus_dsApellidos;
	}

	public String getCus_dsDireccion() {
		return cus_dsDireccion;
	}

	public void setCus_dsDireccion(String cus_dsDireccion) {
		this.cus_dsDireccion = cus_dsDireccion;
	}

	public String getCus_dsCorreo() {
		return cus_dsCorreo;
	}

	public void setCus_dsCorreo(String cus_dsCorreo) {
		this.cus_dsCorreo = cus_dsCorreo;
	}

	public String getCus_cdTelefono() {
		return cus_cdTelefono;
	}

	public void setCus_cdTelefono(String cus_cdTelefono) {
		this.cus_cdTelefono = cus_cdTelefono;
	}

	public String getCus_cdTelefonoalter() {
		return cus_cdTelefonoalter;
	}

	public void setCus_cdTelefonoalter(String cus_cdTelefonoalter) {
		this.cus_cdTelefonoalter = cus_cdTelefonoalter;
	}

	public String getCus_cdCelular() {
		return cus_cdCelular;
	}

	public void setCus_cdCelular(String cus_cdCelular) {
		this.cus_cdCelular = cus_cdCelular;
	}

	public int getCus_nmCargo() {
		return cus_nmCargo;
	}

	public void setCus_nmCargo(int cus_nmCargo) {
		this.cus_nmCargo = cus_nmCargo;
	}

	public String getCus_dsCargo() {
		return cus_dsCargo;
	}

	public void setCus_dsCargo(String cus_dsCargo) {
		this.cus_dsCargo = cus_dsCargo;
	}

	public int getCus_nmCiudad() {
		return cus_nmCiudad;
	}

	public void setCus_nmCiudad(int cus_nmCiudad) {
		this.cus_nmCiudad = cus_nmCiudad;
	}

	public String getCus_dsCiudad() {
		return cus_dsCiudad;
	}

	public void setCus_dsCiudad(String cus_dsCiudad) {
		this.cus_dsCiudad = cus_dsCiudad;
	}

	public Date getCus_feNacimiento() {
		return cus_feNacimiento;
	}

	public void setCus_feNacimiento(Date cus_feNacimiento) {
		this.cus_feNacimiento = cus_feNacimiento;
	}

	public String getCus_genero() {
		return cus_genero;
	}

	public void setCus_genero(String cus_genero) {
		this.cus_genero = cus_genero;
	}

	public int getCus_nmComunidad() {
		return cus_nmComunidad;
	}

	public void setCus_nmComunidad(int cus_nmComunidad) {
		this.cus_nmComunidad = cus_nmComunidad;
	}

	public String getCus_dsComunidad() {
		return cus_dsComunidad;
	}

	public void setCus_dsComunidad(String cus_dsComunidad) {
		this.cus_dsComunidad = cus_dsComunidad;
	}

	public String getDsEmpresaLabora() {
		return dsEmpresaLabora;
	}

	public void setDsEmpresaLabora(String dsEmpresaLabora) {
		this.dsEmpresaLabora = dsEmpresaLabora;
	}

	public int getCus_nmDivision() {
		return cus_nmDivision;
	}

	public void setCus_nmDivision(int cus_nmDivision) {
		this.cus_nmDivision = cus_nmDivision;
	}

	public String getCus_dsDivision() {
		return cus_dsDivision;
	}

	public void setCus_dsDivision(String cus_dsDivision) {
		this.cus_dsDivision = cus_dsDivision;
	}

	public int getCus_nmPais() {
		return cus_nmPais;
	}

	public void setCus_nmPais(int cus_nmPais) {
		this.cus_nmPais = cus_nmPais;
	}

	public String getCus_dsPais() {
		return cus_dsPais;
	}

	public void setCus_dsPais(String cus_dsPais) {
		this.cus_dsPais = cus_dsPais;
	}

	public String getCus_hobbies() {
		return cus_hobbies;
	}

	public void setCus_hobbies(String cus_hobbies) {
		this.cus_hobbies = cus_hobbies;
	}

	public Date getCus_feBaja() {
		return cus_feBaja;
	}

	public void setCus_feBaja(Date cus_feBaja) {
		this.cus_feBaja = cus_feBaja;
	}

	public Date getCus_feRegistro() {
		return cus_feRegistro;
	}

	public void setCus_feRegistro(Date cus_feRegistro) {
		this.cus_feRegistro = cus_feRegistro;
	}
	
}

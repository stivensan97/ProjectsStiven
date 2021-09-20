package com.clientes.pruebaSpringBootJava.entity;



import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name ="tcus_clientes")
public class Cliente {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nmid;
	
	@Column
	private int cus_nmcliente;
	
	@Column
	private String cus_dsnombres;
	
	@Column 
	private String cus_dsapellidos;
	
	@Column
	private String cus_dsdireccion;
	
	@Column
	private String cus_dscorreo;
	
	@Column 
	private String cus_cdtelefono;
	
	@Column
	private String cus_cdtelefonoalter;
	
	@Column
	private String cus_cdcelular;
	
	@Column
	private int cus_nmcargo;
	
	@Column
	private String cus_dscargo;
	
	@Column
	private int cus_nmciudad;
	
	@Column
	private String cus_dsciudad;
	
	@Column
	private Date cus_fenacimiento;
	
	@Column
	private String cus_genero;
	
	@Column
	private int cus_nmcomunidad;
	
	@Column
	private String cus_dscomunidad;

	@Column
	private String cus_dsempresalabora;
	
	@Column
	private int cus_nmdivision;
	
	@Column
	private String cus_dsdivision;
	
	@Column
	private int cus_nmpais; 
	
	@Column
	private String cus_dspais;
	
	@Column
	private String cus_hobbies;
	
	@Column 
	private Date cus_febaja;
	
	@Column
	private Date cus_feregistro;

	public int getNmid() {
		return nmid;
	}

	public void setNmid(int nmid) {
		this.nmid = nmid;
	}

	public int getCus_nmcliente() {
		return cus_nmcliente;
	}

	public void setCus_nmcliente(int cus_nmcliente) {
		this.cus_nmcliente = cus_nmcliente;
	}

	public String getCus_dsnombres() {
		return cus_dsnombres;
	}

	public void setCus_dsnombres(String cus_dsnombres) {
		this.cus_dsnombres = cus_dsnombres;
	}

	public String getCus_dsapellidos() {
		return cus_dsapellidos;
	}

	public void setCus_dsapellidos(String cus_dsapellidos) {
		this.cus_dsapellidos = cus_dsapellidos;
	}

	public String getCus_dsdireccion() {
		return cus_dsdireccion;
	}

	public void setCus_dsdireccion(String cus_dsdireccion) {
		this.cus_dsdireccion = cus_dsdireccion;
	}

	public String getCus_dscorreo() {
		return cus_dscorreo;
	}

	public void setCus_dscorreo(String cus_dscorreo) {
		this.cus_dscorreo = cus_dscorreo;
	}

	public String getCus_cdtelefono() {
		return cus_cdtelefono;
	}

	public void setCus_cdtelefono(String cus_cdtelefono) {
		this.cus_cdtelefono = cus_cdtelefono;
	}

	public String getCus_cdtelefonoalter() {
		return cus_cdtelefonoalter;
	}

	public void setCus_cdtelefonoalter(String cus_cdtelefonoalter) {
		this.cus_cdtelefonoalter = cus_cdtelefonoalter;
	}

	public String getCus_cdcelular() {
		return cus_cdcelular;
	}

	public void setCus_cdcelular(String cus_cdcelular) {
		this.cus_cdcelular = cus_cdcelular;
	}

	public int getCus_nmcargo() {
		return cus_nmcargo;
	}

	public void setCus_nmcargo(int cus_nmcargo) {
		this.cus_nmcargo = cus_nmcargo;
	}

	public String getCus_dscargo() {
		return cus_dscargo;
	}

	public void setCus_dscargo(String cus_dscargo) {
		this.cus_dscargo = cus_dscargo;
	}

	public int getCus_nmciudad() {
		return cus_nmciudad;
	}

	public void setCus_nmciudad(int cus_nmciudad) {
		this.cus_nmciudad = cus_nmciudad;
	}

	public String getCus_dsciudad() {
		return cus_dsciudad;
	}

	public void setCus_dsciudad(String cus_dsciudad) {
		this.cus_dsciudad = cus_dsciudad;
	}

	public Date getCus_fenacimiento() {
		return cus_fenacimiento;
	}

	public void setCus_fenacimiento(Date cus_fenacimiento) {
		this.cus_fenacimiento = cus_fenacimiento;
	}

	public String getCus_genero() {
		return cus_genero;
	}

	public void setCus_genero(String cus_genero) {
		this.cus_genero = cus_genero;
	}

	public int getCus_nmcomunidad() {
		return cus_nmcomunidad;
	}

	public void setCus_nmcomunidad(int cus_nmcomunidad) {
		this.cus_nmcomunidad = cus_nmcomunidad;
	}

	public String getCus_dscomunidad() {
		return cus_dscomunidad;
	}

	public void setCus_dscomunidad(String cus_dscomunidad) {
		this.cus_dscomunidad = cus_dscomunidad;
	}

	public String getCusdsempresalabora() {
		return cus_dsempresalabora;
	}

	public void setCusdsempresalabora(String cus_dsempresalabora) {
		this.cus_dsempresalabora = cus_dsempresalabora;
	}

	public int getCus_nmdivision() {
		return cus_nmdivision;
	}

	public void setCus_nmdivision(int cus_nmdivision) {
		this.cus_nmdivision = cus_nmdivision;
	}

	public String getCus_dsdivision() {
		return cus_dsdivision;
	}

	public void setCus_dsdivision(String cus_dsdivision) {
		this.cus_dsdivision = cus_dsdivision;
	}

	public int getCus_nmpais() {
		return cus_nmpais;
	}

	public void setCus_nmpais(int cus_nmpais) {
		this.cus_nmpais = cus_nmpais;
	}

	public String getCus_dspais() {
		return cus_dspais;
	}

	public void setCus_dspais(String cus_dspais) {
		this.cus_dspais = cus_dspais;
	}

	public String getCus_hobbies() {
		return cus_hobbies;
	}

	public void setCus_hobbies(String cus_hobbies) {
		this.cus_hobbies = cus_hobbies;
	}

	public Date getCus_febaja() {
		return cus_febaja;
	}

	public void setCus_febaja(Date cus_febaja) {
		this.cus_febaja = cus_febaja;
	}

	public Date getCus_feregistro() {
		return cus_feregistro;
	}

	public void setCus_feregistro(Date cus_feregistro) {
		this.cus_feregistro = cus_feregistro;
	}

	
	
}

package edu.upeu.resoluciones.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "DOCENTE")
public class Docente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "genId")
    @GenericGenerator(name = "genId", strategy = "edu.upeu.resoluciones.util.GeneradorIDRandom")
	@Column(name = "ID_DOCENTE")
	private String id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDO_PATERNO")
	private String apePat;
	@Column(name = "APELLIDO_MATERNO")
	private String apeMat;
	@Column(name = "DNI")
	private String dni;
	@Column(name = "NOMBRE_REGION")
	private String nombre_region;
	@Column(name = "NOMBRE_UN_EJE")
	private String nombre_un_eje;
	@Column(name = "NOMBRE_OR_INTER")
	private String nombre_or_inter;
	@Column(name = "PROVINCIA")
	private String provincia;
	@Column(name = "DISTRITO")
	private String distrito;
	@Column(name = "TIPO_IE")
	private String tipo_ie;
	@Column(name = "GESTION")
	private String gestion;
	@Column(name = "ZONA")
	private String zona;
	@Column(name = "Codigo_MOD_IE")
	private String codigo_mod_ie;
	@Column(name = "CLAVE8")
	private String clave8;
	@Column(name = "NIVEL_EDUCATIVO")
	private String nivel_educativo;
	@Column(name = "NIVEL_INSTITUCION_EDUCATIVA")
	private String nivel_educacion_educativa;
	@Column(name = "CODIGO_PLAZA")
	private String codigo_plaza;
	@Column(name = "TIPO_TRABAJADOR")
	private String tipo_trabajador;
	@Column(name = "SUB_TIPO_TRABAJADOR")
	private String sub_tipo_trabajador;
	@Column(name = "CARGO")
	private String cargo;
	@Column(name = "SITUACION_LABORAL")
	private String situacion_laboral;
	@Column(name = "MOTIVO_VAC")
	private String 	motivo_vac;
	@Column(name = "CATEGORIA")
	private String categoria;
	@Column(name = "JORNADA")
	private String jornada;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "CODIGO_MODULAR")
	private String codigo_modular;
	@Column(name = "FECHA_NACIMIENTO")
	private String fecha_nacimiento;
	@Column(name = "FECHA_INICIO")
	private String fecha_inicio;
	@Column(name = "FECHA_TERMINO")
	private String fecha_termino;
	@Column(name = "TIPO_REGISTRO")
	private String tipo_registro;
	@Column(name = "LEY")
	private String ley;

	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre_region() {
		return nombre_region;
	}

	public void setNombre_region(String nombre_region) {
		this.nombre_region = nombre_region;
	}

	public String getNombre_un_eje() {
		return nombre_un_eje;
	}

	public void setNombre_un_eje(String nombre_un_eje) {
		this.nombre_un_eje = nombre_un_eje;
	}

	public String getNombre_or_inter() {
		return nombre_or_inter;
	}

	public void setNombre_or_inter(String nombre_or_inter) {
		this.nombre_or_inter = nombre_or_inter;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getTipo_ie() {
		return tipo_ie;
	}

	public void setTipo_ie(String tipo_ie) {
		this.tipo_ie = tipo_ie;
	}

	public String getGestion() {
		return gestion;
	}

	public void setGestion(String gestion) {
		this.gestion = gestion;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getCodigo_mod_ie() {
		return codigo_mod_ie;
	}

	public void setCodigo_mod_ie(String codigo_mod_ie) {
		this.codigo_mod_ie = codigo_mod_ie;
	}

	public String getClave8() {
		return clave8;
	}

	public void setClave8(String clave8) {
		this.clave8 = clave8;
	}

	public String getNivel_educativo() {
		return nivel_educativo;
	}

	public void setNivel_educativo(String nivel_educativo) {
		this.nivel_educativo = nivel_educativo;
	}

	public String getNivel_educacion_educativa() {
		return nivel_educacion_educativa;
	}

	public void setNivel_educacion_educativa(String nivel_educacion_educativa) {
		this.nivel_educacion_educativa = nivel_educacion_educativa;
	}

	public String getCodigo_plaza() {
		return codigo_plaza;
	}

	public void setCodigo_plaza(String codigo_plaza) {
		this.codigo_plaza = codigo_plaza;
	}

	public String getTipo_trabajador() {
		return tipo_trabajador;
	}

	public void setTipo_trabajador(String tipo_trabajador) {
		this.tipo_trabajador = tipo_trabajador;
	}

	public String getSub_tipo_trabajador() {
		return sub_tipo_trabajador;
	}

	public void setSub_tipo_trabajador(String sub_tipo_trabajador) {
		this.sub_tipo_trabajador = sub_tipo_trabajador;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSituacion_laboral() {
		return situacion_laboral;
	}

	public void setSituacion_laboral(String situacion_laboral) {
		this.situacion_laboral = situacion_laboral;
	}

	public String getMotivo_vac() {
		return motivo_vac;
	}

	public void setMotivo_vac(String motivo_vac) {
		this.motivo_vac = motivo_vac;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCodigo_modular() {
		return codigo_modular;
	}

	public void setCodigo_modular(String codigo_modular) {
		this.codigo_modular = codigo_modular;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_termino() {
		return fecha_termino;
	}

	public void setFecha_termino(String fecha_termino) {
		this.fecha_termino = fecha_termino;
	}

	public String getTipo_registro() {
		return tipo_registro;
	}

	public void setTipo_registro(String tipo_registro) {
		this.tipo_registro = tipo_registro;
	}

	public String getLey() {
		return ley;
	}

	public void setLey(String ley) {
		this.ley = ley;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePat() {
		return apePat;
	}

	public void setApePat(String apePat) {
		this.apePat = apePat;
	}

	public String getApeMat() {
		return apeMat;
	}

	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Docente other = (Docente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

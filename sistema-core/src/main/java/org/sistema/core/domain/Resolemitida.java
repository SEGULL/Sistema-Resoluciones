package org.sistema.core.domain;

import java.util.Date;

public class Resolemitida extends BaseEntity {

	// private Item_resol item_resol;
	//
	// public Item_resol getItem_resol() {
	// return item_resol;
	// }
	//
	// public void setItem_resol(Item_resol item_resol) {
	// this.item_resol = item_resol;
	// }

	private static final long serialVersionUID = 2L;
	private Usuario usuario;
	private Resolucion resolucion;
	private Docente docente;
	private Date fechaemitida;
	private String codresolucion;
	private int countReso;
	private String nombre;

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCountReso() {
		return countReso;
	}

	public void setCountReso(int countReso) {
		this.countReso = countReso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Resolucion getResolucion() {
		return resolucion;
	}

	public void setResolucion(Resolucion resolucion) {
		this.resolucion = resolucion;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Date getFechaemitida() {
		return fechaemitida;
	}

	public void setFechaemitida(Date fechaemitida) {
		this.fechaemitida = fechaemitida;
	}

	public String getCodresolucion() {
		return codresolucion;
	}

	public void setCodresolucion(String codresolucion) {
		this.codresolucion = codresolucion;
	}

}
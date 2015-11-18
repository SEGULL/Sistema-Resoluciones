package org.sistema.core.domain;

import java.util.Date;

public class Datos extends BaseEntity {

	private static final long serialVersionUID = 0L;
	private Resolemitida resolemitida;
	private Date tiempofinal;
    private Date tiempoinicio;
    private String motivofeliz;

	public Resolemitida getResolemitida() {
	return resolemitida;
	}
	
	public void setResolemitida(Resolemitida resolemitida) {
	this.resolemitida = resolemitida;
	}
	public Date getTiempofinal() {
		return tiempofinal;
	}
	public void setTiempofinal(Date tiempofinal) {
		this.tiempofinal = tiempofinal;
	}
	public Date getTiempoinicio() {
		return tiempoinicio;
	}
	public void setTiempoinicio(Date tiempoinicio) {
		this.tiempoinicio = tiempoinicio;
	}
	public String getMotivofeliz() {
		return motivofeliz;
	}
	public void setMotivofeliz(String motivofeliz) {
		this.motivofeliz = motivofeliz;
	}

	
}

package edu.upeu.resoluciones.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "RESOLUCION_ITEM")
public class ResolucionItem {

	@Id
	@GeneratedValue(generator = "genId")
	@GenericGenerator(name = "genId", strategy = "edu.upeu.resoluciones.util.GeneradorIDRandom")
	@Column(name = "ID_RESOLUCION_ITEM")
	private String id;
	@JoinColumn(name = "ID_ITEM")
	@ManyToOne(optional = true)
	private Item item;
	@JoinColumn(name = "ID_RESOLUCION")
	@ManyToOne(optional = true)
	private Resolucion resolucion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Resolucion getResolucion() {
		return resolucion;
	}

	public void setResolucion(Resolucion resolucion) {
		this.resolucion = resolucion;
	}

	
}

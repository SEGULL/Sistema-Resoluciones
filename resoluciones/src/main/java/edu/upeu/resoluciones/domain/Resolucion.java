package edu.upeu.resoluciones.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "RESOLUCION")
public class Resolucion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "genId")
	@GenericGenerator(name = "genId", strategy = "edu.upeu.resoluciones.util.GeneradorIDRandom")
	@Column(name = "id")
	private String id;
	@Column(name = "NOMBRE")
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resolucion")
	private Set<ResolucionItem> items;

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

	public Set<ResolucionItem> getItems() {
		return items;
	}

	public void setItems(Set<ResolucionItem> items) {
		this.items = items;
	}

	


	

	
}

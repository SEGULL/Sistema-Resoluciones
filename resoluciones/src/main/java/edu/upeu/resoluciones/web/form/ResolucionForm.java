package edu.upeu.resoluciones.web.form;

import java.util.List;

public class ResolucionForm {

	private String id;
	private String nombre;
	
	private List<ItemForm> items;

	

	public List<ItemForm> getItems() {
		return items;
	}

	public void setItems(List<ItemForm> items) {
		this.items = items;
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

	
}

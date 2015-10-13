package edu.upeu.resoluciones.service;

import java.util.List;

import edu.upeu.resoluciones.web.form.ItemForm;

public interface ItemService {

	

	ItemForm getItemPorId(String id);

	void guardar(ItemForm p);

	List<ItemForm> listar();

}

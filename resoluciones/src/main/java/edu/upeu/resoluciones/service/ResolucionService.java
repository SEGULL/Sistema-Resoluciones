package edu.upeu.resoluciones.service;

import java.util.List;

import edu.upeu.resoluciones.web.form.ResolucionForm;

public interface ResolucionService {

	List<ResolucionForm> getListaResolucion();
	void guardarResolucion(ResolucionForm df);
	ResolucionForm getResolucionPorId(String id);
	ResolucionForm getResolucionItemPorId(String id);
	ResolucionForm getResolucionAllItemsPorId(String id);
	void guardarItemsResolucion(String id, String[] ids);
}

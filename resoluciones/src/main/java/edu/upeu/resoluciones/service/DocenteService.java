package edu.upeu.resoluciones.service;

import java.util.List;

import edu.upeu.resoluciones.web.form.DocenteForm;

public interface DocenteService {

	DocenteForm getDocentePorId(String id);
	List<DocenteForm> listarDocentes();

}

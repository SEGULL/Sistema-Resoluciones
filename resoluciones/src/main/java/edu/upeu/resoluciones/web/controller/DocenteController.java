package edu.upeu.resoluciones.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.upeu.resoluciones.service.DocenteService;

import edu.upeu.resoluciones.web.form.DocenteForm;

@Controller
@RequestMapping(value = "/docentes")
public class DocenteController {

	@Autowired
	private DocenteService docenteService;
	
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listarDocentes(Model model) {
		List<DocenteForm> lista = docenteService.listarDocentes();
		model.addAttribute("lp", lista);
		return "docente/main";
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String mostrarFormularioDocente(@PathVariable String id, Model model) {
		DocenteForm docente = docenteService.getDocentePorId(id);
		model.addAttribute("docente", docente);

		return "docente/formulario";
	}


}

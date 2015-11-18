package edu.upeu.resoluciones.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.upeu.resoluciones.service.ResolucionService;
import edu.upeu.resoluciones.web.form.ResolucionForm;

@Controller
@RequestMapping(value = "/resoluciones")
public class ResolucionController {

	@Autowired
	private ResolucionService resolucionService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mostrarListaDocentes(Model model) {

		List<ResolucionForm> lista = resolucionService.getListaResolucion();
		model.addAttribute("lp", lista);

		return "resolucion/main";
	}

	@RequestMapping(value = "/nuevo", method = RequestMethod.GET)
	public String mostrarFormularioResolucionNuevo() {
		return "resolucion/formulario";
	}

	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public String guardarResolucionNuevo(@ModelAttribute ResolucionForm df) {

		resolucionService.guardarResolucion(df);

		return "redirect:/resoluciones/";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String mostrarFormularioDocente(@PathVariable String id, Model model) {

		ResolucionForm df = resolucionService.getResolucionPorId(id);
		model.addAttribute("resolucion", df);

		return "resolucion/formulario";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String actualizarResolucion(@PathVariable String id,
			@ModelAttribute ResolucionForm df, Model model) {

		resolucionService.guardarResolucion(df);

		return "redirect:/resoluciones/";
	}

	@RequestMapping(value = "/{id}/items", method = RequestMethod.GET)
	public String mostrarResolucionItems(@PathVariable String id, Model model) {

		ResolucionForm df = resolucionService.getResolucionItemPorId(id);
		model.addAttribute("resolucion", df);

		return "resolucion/resolucion_items";
	}

	@RequestMapping(value = "/{id}/items/editar", method = RequestMethod.GET)
	public String mostrarFormularioDocenteCursos(@PathVariable String id,
			Model model) {

		ResolucionForm df = resolucionService.getResolucionAllItemsPorId(id);
		model.addAttribute("resolucion", df);

		return "resolucion/formulario_items";
	}

	@RequestMapping(value = "/{id}/items/editar", method = RequestMethod.POST)
	public String guardarResolucionItems(@PathVariable String id,
			@RequestParam(value = "id_item") String[] ids, Model model) {

		resolucionService.guardarItemsResolucion(id,ids);

		return "redirect:/resoluciones/" + id + "/items";
	}
}

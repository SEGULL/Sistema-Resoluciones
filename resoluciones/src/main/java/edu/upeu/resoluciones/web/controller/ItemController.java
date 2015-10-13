package edu.upeu.resoluciones.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.upeu.resoluciones.service.ItemService;
import edu.upeu.resoluciones.web.form.ItemForm;

@Controller
@RequestMapping(value = "/items")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mostrarListaItem(Model model) {

		List<ItemForm> lista = itemService.listar();
		model.addAttribute("lp", lista);

		return "item/main";
	}

	@RequestMapping(value = "/nuevo", method = RequestMethod.GET)
	public String mostrarFormularioItemNuevo() {
		return "item/formulario";
	}

	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public String guardarItemNuevo(@ModelAttribute ItemForm df) {

		itemService.guardar(df);

		return "redirect:/items/";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String mostrarFormularioItem(@PathVariable String id, Model model) {

		ItemForm df = itemService.getItemPorId(id);
		model.addAttribute("item", df);

		return "item/formulario";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String actualizarItem(@PathVariable String id,
			@ModelAttribute ItemForm df, Model model) {

		itemService.guardar(df);

		return "redirect:/itemss/";
	}

}

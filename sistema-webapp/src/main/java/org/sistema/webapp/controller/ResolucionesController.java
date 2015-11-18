package org.sistema.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sistema.core.domain.Resolemitida;
import org.sistema.service.services.ResolucionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResolucionesController {

	protected Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	ResolucionServiceImpl resolucionService;
	
	@RequestMapping(value = "resoluciones/dashboard", method = RequestMethod.GET)
	public String electionsDashboard(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "resoluciones");
		
		
		
		List<Resolemitida>  list = resolucionService.finddniresolser("vhg");

		model.addAttribute("listResolemitida", list);
		
		return "resoluciones/dashboard";
		
	}
	
	
}

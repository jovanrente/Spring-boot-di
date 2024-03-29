package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.services.IServicio;

@Controller
public class IndexController {
	
	@Autowired
	@Qualifier("miServiciosimple")
	private IServicio miser; 

	/*@Autowired
	public IndexController(IServicio miser) {
		this.miser = miser;
	}*/

	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("objeto",miser.operacion());
		return "index";
	}
	
}

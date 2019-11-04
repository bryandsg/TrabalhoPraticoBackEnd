package com.cotemig.EliFut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.EliFut.model.Atleta;
import com.cotemig.EliFut.service.AtletaService;


@Controller
public class AtletaController {

	@Autowired
	AtletaService atletaService;
	
	@RequestMapping(value = "/inserir/atleta", method = RequestMethod.GET)
	public ModelAndView insertAtleta(){
		
		return new ModelAndView("tela-insert-atleta","atleta",new Atleta());
	}
	
}

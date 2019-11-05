package com.cotemig.EliFut.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping(value = "/inserir/atleta", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("atleta")Atleta atleta, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	        
	 atletaService.insertAtleta(atleta);
	        
	        return "redirect:";
	 }
	
}

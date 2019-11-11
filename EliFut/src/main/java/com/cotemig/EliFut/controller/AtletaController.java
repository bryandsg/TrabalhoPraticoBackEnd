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
	
	@RequestMapping(value = "/atleta", method = RequestMethod.GET)
	public ModelAndView Atleta(){
		
		return new ModelAndView("Atleta","atleta",new Atleta());
	}
	
	@RequestMapping(value = "/inserir/atleta", method = RequestMethod.GET)
	public ModelAndView insertAtleta(){
		
		return new ModelAndView("insertAtleta","atleta",new Atleta());
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

	
	@RequestMapping(value = "/delete/atleta", method = RequestMethod.GET)
	 public ModelAndView delete(Integer id) {
	 
	 return new ModelAndView("delete", "atleta", atletaService.getAtletaById(id).get());
	 }
	 
	 @RequestMapping(value = "/delete/atleta", method = RequestMethod.POST)
	 public String submitDelete(@Valid @ModelAttribute("atleta")Atleta atleta,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 atletaService.deleteAtletaById(atleta.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/update/atleta", method = RequestMethod.GET)
	 public ModelAndView update(Integer id) {
	 
	        return new ModelAndView("update", "atleta", atletaService.getAtletaById(id).get());
	 }
	 
	 @RequestMapping(value = "/update/atleta", method = RequestMethod.POST)
	 public String submitUpdate(@Valid @ModelAttribute("atleta")Atleta atleta,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	  atletaService.updateAtleta(atleta);
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/read/atleta", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("read");
	        mav.addObject("atleta", atletaService.getAllAtleta());
	        return mav;
	 }
	 
	 @RequestMapping(value = "/atletas", method = RequestMethod.GET)
	 public ModelAndView atleta() {
	        
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("atleta", atletaService.getAllAtleta());
	        return mav;
	 }
	 
	 @RequestMapping(value = "/", method = RequestMethod.GET)
      public ModelAndView index() {
    	  return new ModelAndView("Index");
        }
	 
}
     
		 
	 


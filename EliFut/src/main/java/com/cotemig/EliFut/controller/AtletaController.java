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
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public ModelAndView index(){
		
		return new ModelAndView("tela-menu");
	}	
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	 public ModelAndView delete(Integer id) {
	 
	 return new ModelAndView("delete", "atleta", atletaService.getAtletaById(id).get());
	 }
	 
	 @RequestMapping(value = "/delete", method = RequestMethod.POST)
	 public String submitDelete(@Valid @ModelAttribute("atleta")Atleta atleta,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 atletaService.deleteAtletaById(atleta.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.GET)
	 public ModelAndView update(Integer id) {
	 
	        return new ModelAndView("update", "atleta", atletaService.getAtletaById(id).get());
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 public String submitUpdate(@Valid @ModelAttribute("atleta")Atleta atleta,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 atletaService.updateAtletaById(atleta.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/read", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("read");
	        mav.addObject("atleta", atletaService.getAllAtleta());
	        return mav;
	 }
	 
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 public ModelAndView index() {
	        
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("atleta", atletaService.getAllAtleta());
	        return mav;
	 }
}

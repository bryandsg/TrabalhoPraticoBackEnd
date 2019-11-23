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
import com.cotemig.EliFut.service.TimeService;


@Controller
public class AtletaController {

	@Autowired
	 private AtletaService atletaService;
	
	@Autowired
	 private TimeService timeService;
	 
	// Correto
	
	 @RequestMapping(value = "/atleta/all", method = RequestMethod.GET)
	 public ModelAndView insert() {
	        return new ModelAndView("Atleta", "atletas", atletaService.getAllAtleta());
	 }
	 
	 @RequestMapping(value = "/atleta/insert", method = RequestMethod.GET)
	 public ModelAndView insertAtleta() {
	       
		 ModelAndView mav = new ModelAndView("insertAtleta");
		 
		 mav.addObject("atletas", new Atleta());
		 mav.addObject("times", timeService.getAllTime());
		 
		 return mav; 
		 
	        		
	        		
	 }
	 
	 
	 @RequestMapping(value = "/atleta", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("atleta")Atleta atleta, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 System.out.println(atleta.getTime().getId());
	 atletaService.insertAtleta(atleta);
	        
	        return "redirect:atleta/all";
	 } 
	 
	 //rota correta do insert atleta
	 
	 
	 @RequestMapping(value = "/atleta/delete", method = RequestMethod.GET)
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
	        
	        return "redirect:atleta/all";
	 }
	 
	 //Rota Delete
	 
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
	 
	 atletaService.updateAtleta(atleta);
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/read", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("Atleta");
	        mav.addObject("atleta", atletaService.getAllAtleta());
	        return mav;
	 }


}
		 
	 


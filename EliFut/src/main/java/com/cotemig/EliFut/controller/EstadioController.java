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

import com.cotemig.EliFut.model.Estadio;
import com.cotemig.EliFut.service.EstadioService;

@Controller
public class EstadioController {
	
	
	@Autowired
	EstadioService estadioService;
	
	@RequestMapping(value = "/inserir/estadio", method = RequestMethod.GET)
	public ModelAndView inserirEstadio(){
		
		return new ModelAndView("insert-estadio","estadio",new Estadio());
	}
	
		
	@RequestMapping(value = "/inserir/estadio", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("estadio")Estadio estadio, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	        
	 estadioService.insertEstadio(estadio);
	        
	        return "redirect:";
	 }
	
		
	@RequestMapping(value = "/delete/estadio", method = RequestMethod.GET)
	 public ModelAndView delete(Integer id) {
	 
	 return new ModelAndView("delete", "estadio", estadioService.getEstadioById(id).get());
	 }
	 
	 @RequestMapping(value = "/delete/estadio", method = RequestMethod.POST)
	 public String submitDelete(@Valid @ModelAttribute("estadio")Estadio estadio,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 estadioService.deleteEstadioById(estadio.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/update/estadio", method = RequestMethod.GET)
	 public ModelAndView update(Integer id) {
	 
	        return new ModelAndView("update", "estadio", estadioService.getEstadioById(id).get());
	 }
	 
	 @RequestMapping(value = "/update/estadio", method = RequestMethod.POST)
	 public String submitUpdate(@Valid @ModelAttribute("estadio")Estadio estadio,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 estadioService.updateEstadioById(estadio.getId(), estadio);
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/read/estadio", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("read");
	        mav.addObject("estadio", estadioService.getAllEstadio());
	        return mav;
	 }
	 
	 @RequestMapping(value = "/estadio", method = RequestMethod.GET)
	 public ModelAndView index() {
	        
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("estadio", estadioService.getAllEstadio());
	        return mav;
	 }
		
}

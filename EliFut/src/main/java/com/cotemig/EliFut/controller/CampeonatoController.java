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

import com.cotemig.EliFut.model.Campeonato;
import com.cotemig.EliFut.service.CampeonatoService;

@Controller
public class CampeonatoController {
	
	
	@Autowired
	CampeonatoService campeonatoService;
	
	@RequestMapping(value = "/inserir/campeonato", method = RequestMethod.GET)
	public ModelAndView inserirCampeonato(){
		
		return new ModelAndView("insert-campeonato","campeonato",new Campeonato());
	}
	
		
	@RequestMapping(value = "/inserir", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("campeonato")Campeonato campeonato, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	        
	 campeonatoService.insertCampeonato(campeonato);
	        
	        return "redirect:";
	 }
	
		
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	 public ModelAndView delete(Integer id) {
	 
	 return new ModelAndView("delete", "campeonato", campeonatoService.getCampeonatoById(id).get());
	 }
	 
	 @RequestMapping(value = "/delete", method = RequestMethod.POST)
	 public String submitDelete(@Valid @ModelAttribute("campeonato")Campeonato campeonato,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 campeonatoService.deleteCampeonatoById(campeonato.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.GET)
	 public ModelAndView update(Integer id) {
	 
	        return new ModelAndView("update", "campeonato", campeonatoService.getCampeonatoById(id).get());
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 public String submitUpdate(@Valid @ModelAttribute("campeonato")Campeonato campeonato,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 campeonatoService.updateCampeonatoById(campeonato.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/read", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("read");
	        mav.addObject("campeonato", campeonatoService.getAllCampeonato());
	        return mav;
	 }
	 
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 public ModelAndView index() {
	        
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("campeonato", campeonatoService.getAllCampeonato());
	        return mav;
	 }
}

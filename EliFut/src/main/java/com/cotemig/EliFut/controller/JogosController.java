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

import com.cotemig.EliFut.model.Jogos;
import com.cotemig.EliFut.service.JogosService;

@Controller
public class JogosController {
	
	
	@Autowired
	JogosService jogosService;
	
	@RequestMapping(value = "/inserir/jogos", method = RequestMethod.GET)
	public ModelAndView inserirJogos(){
		
		return new ModelAndView("insert-jogos","jogos",new Jogos());
	}
	
		
	@RequestMapping(value = "/inserir", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("jogos")Jogos jogos, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	        
	 jogosService.insertJogos(jogos);
	        
	        return "redirect:";
	 }
	
		
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	 public ModelAndView delete(Integer id) {
	 
	 return new ModelAndView("delete", "jogos", jogosService.getJogosById(id).get());
	 }
	 
	 @RequestMapping(value = "/delete", method = RequestMethod.POST)
	 public String submitDelete(@Valid @ModelAttribute("jogos")Jogos jogos,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 jogosService.deleteJogosById(jogos.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.GET)
	 public ModelAndView update(Integer id) {
	 
	        return new ModelAndView("update", "jogos", jogosService.getJogosById(id).get());
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 public String submitUpdate(@Valid @ModelAttribute("jogos")Jogos jogos,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 jogosService.updateJogosById(jogos.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/read", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("read");
	        mav.addObject("jogos", jogosService.getAllJogos());
	        return mav;
	 }
	 
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 public ModelAndView index() {
	        
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("jogos", jogosService.getAllJogos());
	        return mav;
	 }
	
}

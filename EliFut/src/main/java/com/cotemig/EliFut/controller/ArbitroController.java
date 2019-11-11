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

import com.cotemig.EliFut.model.Arbitro;
import com.cotemig.EliFut.service.ArbitroService;

@Controller
public class ArbitroController {
	
	
	@Autowired
	ArbitroService arbitroService;
	
	@RequestMapping(value = "/inserir/arbitro", method = RequestMethod.GET)
	public ModelAndView inserirArbitro(){
		
		return new ModelAndView("insert-arbitro","arbitro",new Arbitro());
	}
	
		
	@RequestMapping(value = "/inserir", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("arbitro")Arbitro arbitro, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	        
	 arbitroService.insertArbitro(arbitro);
	        
	        return "redirect:";
	 }
	
		
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	 public ModelAndView delete(Integer id) {
	 
	 return new ModelAndView("delete", "arbitro", arbitroService.getArbitroById(id).get());
	 }
	 
	 @RequestMapping(value = "/delete", method = RequestMethod.POST)
	 public String submitDelete(@Valid @ModelAttribute("arbitro")Arbitro arbitro,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 arbitroService.deleteArbitroById(arbitro.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.GET)
	 public ModelAndView update(Integer id) {
	 
	        return new ModelAndView("update", "arbitro", arbitroService.getArbitroById(id).get());
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 public String submitUpdate(@Valid @ModelAttribute("arbitro")Arbitro arbitro,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 arbitroService.updateArbitroById(arbitro.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/read", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("read");
	        mav.addObject("arbitro", arbitroService.getAllArbitros());
	        return mav;
	 }
	 
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 public ModelAndView index() {
	        
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("arbitro", arbitroService.getAllArbitros());
	        return mav;
	 }
}


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

import com.cotemig.EliFut.model.Time;
import com.cotemig.EliFut.service.TimeService;

@Controller
public class TimeController {
	
	
	@Autowired
	TimeService timeService;
	
	@RequestMapping(value = "/inserir/time", method = RequestMethod.GET)
	public ModelAndView insertTime(){
		
		return new ModelAndView("tela-insert-time","time",new Time());
	}
	
	@RequestMapping(value = "/inserir/time", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("atleta")Time time, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	        
	 timeService.insertTime(time);
	        
	        return "redirect:";
	 }
	
	

}

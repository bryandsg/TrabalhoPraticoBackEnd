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
	public ModelAndView inserirTime(){
		
		return new ModelAndView("insert-time","time",new Time());
	}
	
		
	@RequestMapping(value = "/inserir", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("time")Time time, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	        
	 timeService.insertTime(time);
	        
	        return "redirect:";
	 }
	
		
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	 public ModelAndView delete(Integer id) {
	 
	 return new ModelAndView("delete", "time", timeService.getTimeById(id).get());
	 }
	 
	 @RequestMapping(value = "/delete", method = RequestMethod.POST)
	 public String submitDelete(@Valid @ModelAttribute("time")Time time,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 timeService.deleteTimeById(time.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.GET)
	 public ModelAndView update(Integer id) {
	 
	        return new ModelAndView("update", "time", timeService.getTimeById(id).get());
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 public String submitUpdate(@Valid @ModelAttribute("time")Time time,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 timeService.updateTimeById(time.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/read", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("read");
	        mav.addObject("time", timeService.getAllTime());
	        return mav;
	 }
	 
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 public ModelAndView index() {
	        
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("time", timeService.getAllTime());
	        return mav;
	 }
	
	
	

	
	
}

package com.cotemig.EliFut.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.EliFut.model.Estadio;
import com.cotemig.EliFut.service.EstadioService;



@RestController
public class EstadioRestController {
 
 @Autowired
 private EstadioService estadioService;
 
 @RequestMapping(value = "/estadio/getAll", method = RequestMethod.GET)
 public List<Estadio> getEstadio() {
 return estadioService.getAllEstadio();
 }

 @RequestMapping(value = "/estadio/get/{id}", method = RequestMethod.GET)
 public Optional<Estadio> getEstadio(@PathVariable("id") Integer id) {
 return estadioService.getEstadioById(id);
 }
    
 @RequestMapping(value = "/estadio/deleteAll", method = RequestMethod.DELETE)
 public void deleteEstadio() {
	 estadioService.deleteAllEstadios();
 }
    
 @RequestMapping(value = "/estadio/delete/{id}", method = RequestMethod.DELETE)
 public void deleteEstadio(@PathVariable("id") Integer id) {
	 estadioService.deleteEstadioById(id);
 }
    
 @RequestMapping(value = "/estadio/update/{id}", method = RequestMethod.POST)
 public void updateEstadio(@RequestBody Estadio estadio, @PathVariable("id") Integer id) {
	 estadioService.updateEstadioById(id, estadio);
 }
    
 @RequestMapping(value = "/estadio/insert", method = RequestMethod.POST)
 public void updateEstadio(@RequestBody Estadio estadio) {
	 estadioService.insertEstadio(estadio);
 }
}
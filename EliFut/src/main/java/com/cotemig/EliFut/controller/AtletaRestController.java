package com.cotemig.EliFut.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.EliFut.model.Atleta;
import com.cotemig.EliFut.service.AtletaService;

@RestController
public class AtletaRestController {
 
 @Autowired
 private AtletaService atletaService;
 
 @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
 public List<Atleta> getAtletas() {
 return atletaService.getAllAtleta();
 }

 @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
 public Optional<Atleta> getAtleta(@PathVariable("id") Integer id) {
 return atletaService.getAtletaById(id);
 }
    
 @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
 public void deleteAtleta() {
	 atletaService.deleteAllAtleta();
 }
    
 @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
 public void deleteAtleta(@PathVariable("id") Integer id) {
	 atletaService.deleteAtletaById(id);
 }
    
 @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
 public void updateAtleta(@RequestBody Atleta atleta, @PathVariable("id") Integer id) {
	 atletaService.updateAtletaById(id, atleta);
 }
    
 @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
 public void updateAtleta(@RequestBody Atleta atleta) {
	 atletaService.insertAtleta(atleta);
 }
}
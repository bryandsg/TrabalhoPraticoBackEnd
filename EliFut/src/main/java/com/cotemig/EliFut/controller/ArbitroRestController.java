package com.cotemig.EliFut.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.EliFut.model.Arbitro;
import com.cotemig.EliFut.service.ArbitroService;


@RestController
public class ArbitroRestController {
 
 @Autowired
 private ArbitroService arbitroService;
 
 @RequestMapping(value = "/arbitro/getAll", method = RequestMethod.GET)
 public List<Arbitro> getArbitro() {
 return arbitroService.getAllArbitro();
 }

 @RequestMapping(value = "/arbitro/get/{id}", method = RequestMethod.GET)
 public Optional<Arbitro> getArbitro(@PathVariable("id") Integer id) {
 return arbitroService.getArbitroById(id);
 }
    
 @RequestMapping(value = "/arbitro/deleteAll", method = RequestMethod.DELETE)
 public void deleteArbitro() {
	 arbitroService.deleteAllArbitro();
 }
    
 @RequestMapping(value = "/arbitro/delete/{id}", method = RequestMethod.DELETE)
 public void deleteArbitro(@PathVariable("id") Integer id) {
	 arbitroService.deleteArbitroById(id);
 }
    
 @RequestMapping(value = "/arbitro/update/{id}", method = RequestMethod.POST)
 public void updateArbitro(@RequestBody Arbitro arbitro, @PathVariable("id") Integer id) {
	 arbitroService.updateArbitroById(id, arbitro);
 }
    
 @RequestMapping(value = "/arbitro/insert", method = RequestMethod.POST)
 public void updateAtleta(@RequestBody Arbitro arbitro) {
	 arbitroService.insertArbitro(arbitro);
 }
}
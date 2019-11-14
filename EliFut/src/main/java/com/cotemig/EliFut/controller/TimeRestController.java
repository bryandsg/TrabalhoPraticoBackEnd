package com.cotemig.EliFut.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.EliFut.model.Time;
import com.cotemig.EliFut.service.TimeService;



@RestController
public class TimeRestController {
 
 @Autowired
 private TimeService timeService;
 
 @RequestMapping(value = "/time/getAll", method = RequestMethod.GET)
 public List<Time> getTime() {
 return timeService.getAllTime();
 }

 @RequestMapping(value = "/time/get/{id}", method = RequestMethod.GET)
 public Optional<Time> getTime(@PathVariable("id") Integer id) {
 return timeService.getTimeById(id);
 }
    
 @RequestMapping(value = "/time/deleteAll", method = RequestMethod.DELETE)
 public void deleteTime() {
	 timeService.deleteAllTimes();
 }
    
 @RequestMapping(value = "/time/delete/{id}", method = RequestMethod.DELETE)
 public void deleteTime(@PathVariable("id") Integer id) {
	 timeService.deleteTimeById(id);
 }
    
 @RequestMapping(value = "/time/update/{id}", method = RequestMethod.POST)
 public void updateTime(@RequestBody Time time, @PathVariable("id") Integer id) {
	 timeService.updateTimeById(id, time);
 }
    
 @RequestMapping(value = "/time/insert", method = RequestMethod.POST)
 public void updateTime(@RequestBody Time time) {
	 timeService.insertTime(time);
 }
}
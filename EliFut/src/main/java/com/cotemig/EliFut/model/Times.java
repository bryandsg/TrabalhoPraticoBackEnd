package com.cotemig.EliFut.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Times {

	private List<Time> listaTimes;

	public List<Time> getTimes() {
		return listaTimes;
	}

	public void setTimes(List<Time> times) {
		this.listaTimes = times;
	}
	
	public void addTimes(Time timep){
		listaTimes.add(timep);
	}
	public void removeTimes(Time timep){
		listaTimes.remove(timep);
	}
	
	
}

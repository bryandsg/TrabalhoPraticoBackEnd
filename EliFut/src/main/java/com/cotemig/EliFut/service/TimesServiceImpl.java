package com.cotemig.EliFut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cotemig.EliFut.model.Time;
import com.cotemig.EliFut.model.Times;
import com.cotemig.EliFut.repository.TimesRepository;

public class TimesServiceImpl implements TimesService {
	
	@Autowired
	TimesRepository timesRepository;
	
	@Override
	public List<Time> getAllTimes() {
		return null;
		// TODO Auto-generated method stub
		
	}

}

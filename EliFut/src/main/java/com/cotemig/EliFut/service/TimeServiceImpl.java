package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.EliFut.model.Time;
import com.cotemig.EliFut.repository.TimeRepository;

@Service("timeService")
public class TimeServiceImpl implements TimeService {
	
	@Autowired TimeRepository timeRepository;
	@Override
	public Optional<Time> getTimeById(Integer id) {
		
		return timeRepository.findById(id);
	}
	
	@Override
	public List<Time> getAllTime() {
		// TODO Auto-generated method stub
		return timeRepository.findAll();
	}
	
	@Override
	public void deleteAllTimes() {
		// TODO Auto-generated method stub
		 timeRepository.deleteAll();
		
	}
	
	@Override
	public void deleteTimeById(Integer id) {
		// TODO Auto-generated method stub
		timeRepository.deleteById(id);
		
	}
	
	@Override
	public void updateTimeById(Integer id, Time time) {
		// TODO Auto-generated method stub
		Optional<Time> getTime = this.getTimeById(id);
		
		getTime.get().setNomeClube(time.getNomeClube());
		getTime.get().setFundacao(time.getFundacao());
		timeRepository.save(time);
		
	}
	
	@Override
	public void insertTime(Time time) {
		// TODO Auto-generated method stub
		timeRepository.save(time);		
	}

	@Override
	public void updateTimeById(Integer id) {
		// TODO Auto-generated method stub
		
	}



}

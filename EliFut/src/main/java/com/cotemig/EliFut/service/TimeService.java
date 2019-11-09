package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.EliFut.model.Time;

public interface TimeService {
	
	 Optional<Time> getTimeById(Integer id);
	 List<Time> getAllTime();
	 void deleteAllTimes();
	 void deleteTimeById(Integer id);
	 void updateTimeById(Integer id);
	 void insertTime(Time time);
	 void updateTimeById(Integer id, Time time);


}

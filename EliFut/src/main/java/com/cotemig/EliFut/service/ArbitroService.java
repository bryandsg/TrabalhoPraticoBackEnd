package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.EliFut.model.Arbitro;

public interface ArbitroService {
	
	 Optional<Arbitro> getArbitroById(Integer id);
	 List<Arbitro> getAllArbitro();
	 void deleteAllArbitro();
	 void deleteArbitroById(Integer id);
	 void updateArbitroById(Integer id);
	 void updateArbitro(Arbitro arbitro);
	 void insertArbitro(Arbitro arbitro);
	void updateArbitroById(Integer id, Arbitro arbitro);
	 
}



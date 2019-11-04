package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.EliFut.model.Jogos;

public interface JogosService {
	
	 Optional<Jogos> getJogosById(Integer id);
	 List<Jogos> getAllJogos();
	 void deleteAllJogos();
	 void deleteJogosById(Integer id);
	 void updateJogosById(Integer id, Jogos jogos);
	 void updateJogos(Jogos jogos);
	 void insertJogos(Jogos jogos);
	

}

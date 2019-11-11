package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.EliFut.model.Jogos;

public interface JogosService {
	
	 Optional<Jogos> getJogoById(Integer id);
	 List<Jogos> getAllJogos();
	 void deleteAllJogos();
	 void insertJogos(Jogos jogos);

}

package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.EliFut.model.Partida;

public interface PartidaService {
	
	 Optional<Partida> getPartidaById(Integer id);
	 List<Partida> getAllPartida();
	 void deleteAllPartida();
	 void deletePartidaById(Integer id);
	 void updatePartidaById(Integer id);
	 void updatePartida(Partida partida);
	 void insertPartida(Partida partida);
	 void updatePartidaById(Integer id, Partida partida);

}

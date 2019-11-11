package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.EliFut.model.Campeonato;

public interface CampeonatoService {
		
	 Optional<Campeonato> getCampeonatoById(Integer id);
	 List<Campeonato> getAllCampeonatos();
	 void deleteAllCampeonatos();
	 void deleteCampeonatoById(Integer id);
	 void updateCampeonatoById(Integer id);
	 void updateCampeonato(Campeonato campeonato);
	 void insertCampeonato(Campeonato campeonato);

}

package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.EliFut.model.Atleta;

public interface AtletaService {
	
	 Optional<Atleta> getAtletaById(Integer id);
	 List<Atleta> getAllAtleta();
	 void deleteAllAtleta();
	 void deleteAtletaById(Integer id);
	 void updateAtletaById(Integer id, Atleta atleta);
	 void insertAtleta(Atleta atleta);

}

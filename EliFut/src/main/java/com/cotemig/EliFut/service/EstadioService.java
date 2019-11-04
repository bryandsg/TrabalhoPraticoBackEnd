package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.EliFut.model.Estadio;

public interface EstadioService {
	
	 Optional<Estadio> getEstadioById(Integer id);
	 List<Estadio> getAllEstadio();
	 void deleteAllEstadios();
	 void deleteEstadiosById(Integer id);
	 void updateEstadioById(Integer id, Estadio estadio);
	 void updateEstadio(Estadio estadio);
	 void insertEstadio(Estadio estadio);

}

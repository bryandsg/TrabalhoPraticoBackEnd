package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.EliFut.model.Partida;
import com.cotemig.EliFut.repository.PartidaRepository;

@Service("partidaService")
public class PartidaServiceImpl implements PartidaService {
	
	@Autowired PartidaRepository partidaRepository;

	@Override
	public Optional<Partida> getPartidaById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Partida> getAllPartida() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllPartida() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePartidaById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePartidaById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePartida(Partida partida) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertPartida(Partida partida) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePartidaById(Integer id, Partida partida) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

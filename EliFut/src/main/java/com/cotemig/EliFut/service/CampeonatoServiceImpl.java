package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cotemig.EliFut.model.Campeonato;
import com.cotemig.EliFut.repository.CampeonatoRepository;

@Service("campeonatoService")
public class CampeonatoServiceImpl implements CampeonatoService {
	
	@Autowired CampeonatoRepository campeonatoRepository;
	@Override
	public Optional<Campeonato> getCampeonatoById(Integer id) {
		
		return campeonatoRepository.findById(id);
	}

	@Override
	public List<Campeonato> getAllCampeonatos(){
		
		return campeonatoRepository.findAll();
	}

	@Override
	public void deleteAllCampeonatos() {
		// TODO Auto-generated method stub
		campeonatoRepository.deleteAll();
		
	}

	@Override
	public void deleteCampeonatoById(Integer id) {
		// TODO Auto-generated method stub
		campeonatoRepository.deleteById(id);
	}

	@Override
	public void updateCampeonatoById(Integer id, Campeonato campeonato) {
		Optional<Campeonato> getCampeonato = this.getCampeonatoById(id);
		
		getCampeonato.get().setNomeCampeonato(Campeonato.getNomeCampeonato());
		
		campeonatoRepository.save(campeonato);
		
	}

	@Override
	public void insertCampeonato(Campeonato campeonato) {
		campeonatoRepository.save(campeonato);
		
	}

	

	@Override
	public void updateCampeonato(Campeonato campeonato) {
		// TODO Auto-generated method stub
		campeonatoRepository.save(campeonato);
	}
	
	
	
	
	
}

package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.EliFut.model.Estadio;
import com.cotemig.EliFut.repository.EstadioRepository;



@Service("estadioService")
public class EstadioServiceImpl implements EstadioService {
	
	@Autowired EstadioRepository estadioRepository;
	@Override
	public Optional<Estadio> getEstadioById(Integer id) {
		
		return estadioRepository.findById(id);
	}

	@Override
	public List<Estadio> getAllEstadio(){
		
		return estadioRepository.findAll();
	}

	@Override
	public void deleteAllEstadios() {
		// TODO Auto-generated method stub
		estadioRepository.deleteAll();
		
	}

	@Override
	public void deleteEstadioById(Integer id) {
		// TODO Auto-generated method stub
		estadioRepository.deleteById(id);
	}

	@Override
	public void updateEstadioById(Integer id, Estadio estadio) {
		Optional<Estadio> getEstadio = this.getEstadioById(id);
		
		getEstadio.get().setNomeEstadio(estadio.getNomeEstadio());
		
		estadioRepository.save(estadio);
		
	}

	@Override
	public void insertEstadio(Estadio estadio) {
		estadioRepository.save(estadio);
		
	}

	@Override
	public void updateEstadio(Estadio estadio) {
		// TODO Auto-generated method stub
		estadioRepository.save(estadio);
	}
}
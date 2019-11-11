package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.EliFut.model.Atleta;
import com.cotemig.EliFut.repository.AtletaRepository;

@Service("atletaService")
public class AtletaServiceImpl implements AtletaService {

	@Autowired AtletaRepository atletaRepository;
	@Override
	public Optional<Atleta> getAtletaById(Integer id) {
		
		return atletaRepository.findById(id);
	}

	@Override
	public List<Atleta> getAllAtleta() {
		
		return atletaRepository.findAll();
	}

	@Override
	public void deleteAllAtleta() {
		// TODO Auto-generated method stub
		atletaRepository.deleteAll();
		
	}

	@Override
	public void deleteAtletaById(Integer id) {
		// TODO Auto-generated method stub
		atletaRepository.deleteById(id);
	}

	@Override
	public void updateAtletaById(Integer id, Atleta atleta) {
		Optional<Atleta> getAtleta = this.getAtletaById(id);
		
		getAtleta.get().setNome(atleta.getNome());
		getAtleta.get().setPosicao(atleta.getPosicao());
		atletaRepository.save(atleta);
		
	}

	@Override
	public void insertAtleta(Atleta atleta) {
		atletaRepository.save(atleta);
		
	}

	@Override
	public void updateAtleta(Atleta atleta) {
		// TODO Auto-generated method stub
		
	}

}

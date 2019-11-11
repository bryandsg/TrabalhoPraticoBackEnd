package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.EliFut.model.Jogos;
import com.cotemig.EliFut.repository.JogosRepository;

@Service("jogosService")
public class JogosServiceImpl implements JogosService {
	
	@Autowired JogosRepository jogosRepository;

	@Override
	public Optional<Jogos> getJogoById(Integer id) {
		// TODO Auto-generated method stub
		
		return jogosRepository.findById(id);
	}

	@Override
	public List<Jogos> getAllJogos() {
		// TODO Auto-generated method stub
		return jogosRepository.findAll();
	}

	@Override
	public void deleteAllJogos() {
		// TODO Auto-generated method stub
		jogosRepository.deleteAll();
		
	}

	@Override
	public void insertJogos(Jogos jogos) {
		// TODO Auto-generated method stub
		jogosRepository.save(jogos);
		
	}

}

package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.EliFut.model.Arbitro;
import com.cotemig.EliFut.repository.ArbitroRepository;


@Service("arbitroService")
public class ArbitroServiceImpl implements ArbitroService {

	@Autowired ArbitroRepository arbitroRepository;
	@Override
	public Optional<Arbitro> getArbitroById(Integer id) {
		
		return arbitroRepository.findById(id);
	}

	@Override
	public List<Arbitro> getAllArbitro(){
		
		return arbitroRepository.findAll();
	}

	@Override
	public void deleteAllArbitro() {
		// TODO Auto-generated method stub
		arbitroRepository.deleteAll();
		
	}

	@Override
	public void deleteArbitroById(Integer id) {
		// TODO Auto-generated method stub
		arbitroRepository.deleteById(id);
	}

	@Override
	public void updateArbitroById(Integer id, Arbitro arbitro) {
		Optional<Arbitro> getArbitro = this.getArbitroById(id);
		
		getArbitro.get().setNome(arbitro.getNome());
		
		arbitroRepository.save(arbitro);
		
	}

	@Override
	public void insertArbitro(Arbitro arbitro) {
		arbitroRepository.save(arbitro);
		
	}

	@Override
	public void updateArbitroById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateArbitro(Arbitro arbitro) {
		// TODO Auto-generated method stub
		
	}

	

}
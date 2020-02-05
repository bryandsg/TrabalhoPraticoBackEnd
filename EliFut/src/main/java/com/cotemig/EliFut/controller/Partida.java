package com.cotemig.EliFut.controller;

import java.util.Random;

import com.cotemig.EliFut.model.Arbitro;
import com.cotemig.EliFut.model.Campeonato;
import com.cotemig.EliFut.model.Estadio;
import com.cotemig.EliFut.model.Time;

public class Partida {
	
	
	private int partida;
	Time time;
	Time time2;
	Estadio estadio;
	Arbitro arbitro;
	Campeonato campeonato;
	
	Random númeroRandom = new Random();
	
	
	public Partida(int partida, Time time, Time time2, Estadio estadio, Arbitro arbitro, Campeonato campeonato) {
		super();
		this.partida = partida;
		this.time = time;
		this.time2 = time2;
		this.estadio = estadio;
		this.arbitro = arbitro;
		this.campeonato = campeonato;
	}
	
	

	
	

}

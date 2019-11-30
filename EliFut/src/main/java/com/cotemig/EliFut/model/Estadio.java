package com.cotemig.EliFut.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Estadio {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="partida_id", nullable=false)
    private Partida partida;
	
	private String nomeEstadio;
	private float capacidade;
	private float publico;
	
	public String getNomeEstadio() {
		return nomeEstadio;
	}
	public void setNomeEstadio(String nomeEstadio) {
		this.nomeEstadio = nomeEstadio;
	}
	public float getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}
	public float getPublico() {
		return publico;
	}
	public void setPublico(float publico) {
		this.publico = publico;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
		
}

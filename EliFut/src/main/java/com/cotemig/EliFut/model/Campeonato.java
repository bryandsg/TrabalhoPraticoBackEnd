package com.cotemig.EliFut.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Campeonato {
	
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    
    @JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="campeonato")
    private Set<Partida> partida;
    
	private static String nomeCampeonato;
	private String tipo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public static String getNomeCampeonato() {
		return nomeCampeonato;
	}
	public void setNomeCampeonato(String nomeCampeonato) {
		Campeonato.nomeCampeonato = nomeCampeonato;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}

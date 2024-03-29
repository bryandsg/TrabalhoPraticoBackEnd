package com.cotemig.EliFut.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Campeonato {
	
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
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

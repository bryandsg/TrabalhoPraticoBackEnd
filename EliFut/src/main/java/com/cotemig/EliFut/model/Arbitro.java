package com.cotemig.EliFut.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Arbitro {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private static String nome;
	
	public static String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		Arbitro.nome = nome;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	

		

}

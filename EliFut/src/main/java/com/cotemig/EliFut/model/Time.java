package com.cotemig.EliFut.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Time {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Integer id;
	private String nomeClube;
	private String fundacao;
	
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="time")
    private Set<Atleta> atletas;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="partida_id", nullable=false)
    private Partida partida;
	
	public String getNomeClube() {
		return nomeClube;
	}
	public void setNomeClube(String nomeClube) {
		this.nomeClube = nomeClube;
	}
	
	public String getFundacao() {
		return fundacao;
	}
	
	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Set<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(Set<Atleta> atletas) {
		this.atletas = atletas;
	}
	
	
	


}

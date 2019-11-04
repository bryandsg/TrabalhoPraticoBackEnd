package com.cotemig.EliFut.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Time {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nomeClube;
	private Integer fundacao;
	
	public String getNomeClube() {
		return nomeClube;
	}
	public void setNomeClube(String nomeClube) {
		this.nomeClube = nomeClube;
	}
	public Integer getFundacao() {
		return fundacao;
	}
	public void setFundacao(Integer fundacao) {
		this.fundacao = fundacao;
	}


}

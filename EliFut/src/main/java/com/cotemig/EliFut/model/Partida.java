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
public class Partida {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Integer id;
	
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="partida")
    private Set<Arbitro> arbitro;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="campeonato_id", nullable=false)
    private Campeonato campeonato;
	
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="partida")
    private Set<Estadio> estadio;
	
	public Set<Estadio> getEstadio() {
		return estadio;
	}
	public void setEstadio(Set<Estadio> estadio) {
		this.estadio = estadio;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Set<Arbitro> getArbitro() {
		return arbitro;
	}
	public void setArbitro(Set<Arbitro> arbitro) {
		this.arbitro = arbitro;
	}

	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="partida")
	private Set<Time> time;
	
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="partida")
	private Set<Time> time2;

	public Set<Time> getTime() {
		return time;
	}
	public void setTime(Set<Time> time) {
		this.time = time;
	}
	public Set<Time> getTime2() {
		return time2;
	}
	public void setTime2(Set<Time> time2) {
		this.time2 = time2;
	}



	
}


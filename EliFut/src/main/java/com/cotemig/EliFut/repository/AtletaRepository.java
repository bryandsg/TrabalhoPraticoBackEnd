package com.cotemig.EliFut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.EliFut.model.Atleta;

@Repository("atletaRepository")
public interface AtletaRepository extends JpaRepository<Atleta, Integer> {

}

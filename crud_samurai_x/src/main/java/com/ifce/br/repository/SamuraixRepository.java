package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Samuraix;

@Repository
public interface SamuraixRepository extends JpaRepository<Samuraix, Long>{
	
	//hibernate
	
}

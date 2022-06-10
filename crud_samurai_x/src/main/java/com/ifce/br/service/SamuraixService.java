package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Samuraix;
import com.ifce.br.repository.SamuraixRepository;

@Service
public class SamuraixService {
	
	@Autowired
	private SamuraixRepository samuraixRepo;
	
	public void cadastrarSamuraix(Samuraix samuraix) {
		
		samuraixRepo.save(samuraix);
		
	}
	
	public List<Samuraix> listarSamuraix(){
		
		return samuraixRepo.findAll();
	}
	
	public void excluirSamuraix(Long codigo) {
		samuraixRepo.deleteById(codigo);
	}

}

package com.example.demo.services;

import com.example.demo.domain.Veiculo;
import com.example.demo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repo;

	//@Autowired
	//private Producer producer;
	
	
	public Veiculo insert(Veiculo obj) {
		obj.setId(null);
		//producer.producer(obj);
		return repo.save(obj);
	}
	
	public Veiculo find(Integer id) throws Exception {
		Optional<Veiculo> obj = repo.findById(id);
		return obj.orElseThrow(() -> new Exception(
		"Objeto não encontrado! Id: " + id + ", tipo: " + Veiculo.class.getName()));
	}

}

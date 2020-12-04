package com.example.demo.services;

import com.example.demo.repository.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


@Service
public class DBService {

	

	
	@Autowired
	private VeiculoRepository veiculoRepository;

	public void instantiateTestDataBase() throws ParseException {
		
		
		
		
DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");

		
		Veiculo veiculo1;
		veiculo1 = new veiculo(null,
				"01",
				"Iveco",
				"Daily",
				"DPJ1234",
				"VUC",
				"2.000kg",
				"174x66x5mm");

		veiculoRepository.save(veiculo1);
		
		
		

		
		
	}

}

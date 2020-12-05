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
		
	
	}

}

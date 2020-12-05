package com.example.demo.services;

import com.example.demo.domain.TipoVeiculo;
import com.example.demo.domain.Veiculo;
import com.example.demo.repository.VeiculoRepository;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DBService {

	@Autowired
	private VeiculoRepository veiculoRepository;

	public void instantiateTestDataBase() throws ParseException {

		DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");

		Veiculo veiculo = new Veiculo(null, "ford", "fiesta", "ttt-6958", TipoVeiculo.VAN.getDescricao(),"1000", "15245.1544",dt.parse("12/12/2020"), dt.parse("12/12/2021"));
		veiculoRepository.save(veiculo);
	
	}

}

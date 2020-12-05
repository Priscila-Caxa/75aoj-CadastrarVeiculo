package com.example.demo.resources;

import com.example.demo.domain.Veiculo;
import com.example.demo.services.VeiculoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;



@RestController
@RequestMapping(value="/api")
@Api ( value = " API REST Veiculo " )
public class VeiculoResource {


	@Autowired
	private VeiculoService service;

	public VeiculoResource(VeiculoService service) {
		this.service = service;
	}


	@ApiOperation ( value = "Informa veiculo por id" )
	@GetMapping("/veiculos-cadastrados/{id}")
	public ResponseEntity<Veiculo> find(@PathVariable Integer id) throws Exception {
		Veiculo obj = service.find(id);
		return ResponseEntity.ok(obj);
	}

	@ApiOperation ( value = "Cadastra um novo veiculo" )
	@PostMapping("/cadastrar-veiculo")
	public ResponseEntity<Void> insert(@RequestBody Veiculo obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}

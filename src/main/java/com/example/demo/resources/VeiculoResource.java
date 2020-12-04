package com.example.demo.resources;

import com.example.demo.domain.Veiculo;
import com.example.demo.services.VeiculoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.net.URI;
import java.util.List;

framework.beans.factory.annotation.Autowired;
		framework.http.ResponseEntity;
		framework.web.bind.annotation.DeleteMapping;
		framework.web.bind.annotation.GetMapping;
		framework.web.bind.annotation.PathVariable;
		framework.web.bind.annotation.PostMapping;
		framework.web.bind.annotation.RequestBody;
		framework.web.bind.annotation.RequestMapping;
		framework.web.bind.annotation.RequestMethod;
		framework.web.bind.annotation.RestController;
		framework.web.servlet.support.ServletUriComponentsBuilder;

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
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Veiculo> find(@PathVariable Integer id) throws Exception {
		Veiculo obj = service.find(id);
		return ResponseEntity.ok(obj);
	}

	@ApiOperation ( value = "Cadastra um novo veiculo" )
	@PostMapping("/cadastrar-veiculo")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Veiculo obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
//	@ApiOperation ( value = "Excluir um veiculo" )
//	@DeleteMapping ( "/deletar-veiculo/{id}" )
//	public  void  deletaVeiculo ( @PathVariable Integer id ) throws Exception {
//		service.delete(id);
//	}
}

package br.com.educa.Educa.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.educa.Educa.Entity.Pessoa;
import br.com.educa.Educa.Service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	//---------------------//
	@Autowired
	PessoaService service;
	
	//---------------------//
	@GetMapping
	public void listAll() {
		
	}
	
	@GetMapping("/{id}")
	public void FindById( @PathVariable int id ) {
		
	}
	
	@PostMapping
	public void Save( @RequestBody Pessoa pessoa ) {
		
	}
	
	@PutMapping("/{id}")
	public void Update ( @PathVariable int id, @RequestBody Pessoa pessoa ) {
		
	}
	
	@DeleteMapping("/{id}")
	public void Delete( @PathVariable int id ) {
		
	}
	
	
}

package com.springboot.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.domain.model.Pessoa;
import com.springboot.crud.domain.model.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	private PessoaRepository pessoaRepository;

	@GetMapping
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> obter(@PathVariable Long id) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		
		if(pessoa.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(pessoa.get());
	}
	
	@PostMapping
	public Pessoa adicionar(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @RequestBody Pessoa pessoa) {
		
		if(!pessoaRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		pessoa.setId(id);
		pessoa = pessoaRepository.save(pessoa);
		
		return ResponseEntity.ok(pessoa);
	}
}

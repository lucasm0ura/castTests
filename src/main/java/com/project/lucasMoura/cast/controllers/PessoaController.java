package com.project.lucasMoura.cast.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.lucasMoura.cast.payloads.PessoaRequest;
import com.project.lucasMoura.cast.payloads.PessoaResponse;
import com.project.lucasMoura.cast.services.PessoaService;
import com.project.lucasMoura.cast.util.Utils;

@RestController
@RequestMapping(path = "/api")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/pessoas")
	public List<PessoaResponse> getAll(){
		return pessoaService.getAllPessoas();
	}
	
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/pessoa/{id}")
	public PessoaResponse getById(@PathVariable("id") String id) {
		return pessoaService.getById(id);
	}	
	
    @CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/pessoa")
	public ResponseEntity<?> create(@Valid @RequestBody PessoaRequest pessoaRequest){
		pessoaService.create(pessoaRequest);
		return Utils.created(true, "Pessoa criada com sucesso.");
		
	}
	
    @CrossOrigin(origins = "http://localhost:8081")
	@PutMapping("/pessoa")
	public ResponseEntity<?> update(@Valid @RequestBody PessoaRequest pessoaRequest){
		pessoaService.update(pessoaRequest);
		return Utils.created(true, "Pessoa editada com sucesso.");
		
	}
	
    @CrossOrigin(origins = "http://localhost:8081")
	@DeleteMapping("/pessoa/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") String id) {
		pessoaService.delete(id);
		
		return Utils.deleted(true, "Pessoa deletada com sucesso.");
	}	
	
}

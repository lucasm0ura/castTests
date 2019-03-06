package com.project.lucasMoura.cast.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.project.lucasMoura.cast.model.Pessoa;
import com.project.lucasMoura.cast.payloads.PessoaRequest;
import com.project.lucasMoura.cast.payloads.PessoaResponse;
import com.project.lucasMoura.cast.repositories.PessoaMongoRepository;;

@Service
public class PessoaService {

	@Autowired
	private PessoaMongoRepository pessoaRepository;
	
	public List<PessoaResponse> getAllPessoas() {
	
		List<Pessoa> pessoas = pessoaRepository.findAll();
		
		List<PessoaResponse> pessoasResponse = new ArrayList<PessoaResponse>();
		
		if (pessoas.size() == 0) {
			return new ArrayList<>(Collections.emptyList());
		}		
		
		for(Pessoa pessoa : pessoas)
			pessoasResponse.add(new PessoaResponse(pessoa));
		
		return pessoasResponse;
	}

	public PessoaResponse getById(String id) {
		Pessoa pessoa = pessoaRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException());
		
		return new PessoaResponse(pessoa);
	}

	public void create(PessoaRequest pessoaRequest) {
		
		Pessoa pessoa = new Pessoa(pessoaRequest);
		
		pessoaRepository.save(pessoa);
	}

	public void update(PessoaRequest pessoaRequest) {
		
		Pessoa pessoa = pessoaRepository.findById(pessoaRequest.getId())
				.orElseThrow(() -> new ResourceNotFoundException());
		
		if(Objects.nonNull(pessoaRequest.getName()))
			pessoa.setName(pessoaRequest.getName());
		
		if(Objects.nonNull(pessoaRequest.getStreet()))
			pessoa.setStreet(pessoaRequest.getStreet());
		
		if(Objects.nonNull(pessoaRequest.getNumber()))
			pessoa.setNumber(pessoaRequest.getNumber());
		
		if(Objects.nonNull(pessoaRequest.getNeighborhood()))
			pessoa.setNeighborhood(pessoaRequest.getNeighborhood());
		
		if(Objects.nonNull(pessoaRequest.getCity()))
			pessoa.setCity(pessoaRequest.getCity());
		
		if(Objects.nonNull(pessoaRequest.getState()))
			pessoa.setState(pessoaRequest.getState());
		
		if(Objects.nonNull(pessoaRequest.getCellphone()))
			pessoa.setCellphone(pessoaRequest.getCellphone());
		
		if(Objects.nonNull(pessoaRequest.getPhone()))
			pessoa.setPhone(pessoaRequest.getPhone());
		
		pessoaRepository.save(pessoa);
	}

	public void delete(String id) {
		Pessoa pessoa = pessoaRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException());
		
		
		pessoaRepository.delete(pessoa);
	}
	
}

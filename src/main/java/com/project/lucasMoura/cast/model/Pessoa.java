package com.project.lucasMoura.cast.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.project.lucasMoura.cast.payloads.PessoaRequest;

@Document(collection="pessoas")
public class Pessoa {

	@Id
	private String id;
	
	private String name;
	
	private String street;
	
	private String number;
	
	private String neighborhood;
	
	private String city;
	
	private String state;
	
	private String cellphone;
	
	private String phone;
	
	public Pessoa() {
		
	}
	

	public Pessoa(PessoaRequest pessoaRequest) {

		this.setName(pessoaRequest.getName());
		
		if(Objects.nonNull(pessoaRequest.getStreet()))
			this.setStreet(pessoaRequest.getStreet());
		
		if(Objects.nonNull(pessoaRequest.getNumber()))
			this.setNumber(pessoaRequest.getNumber());
		
		if(Objects.nonNull(pessoaRequest.getNeighborhood()))
			this.setNeighborhood(pessoaRequest.getNeighborhood());
		
		if(Objects.nonNull(pessoaRequest.getCity()))
			this.setCity(pessoaRequest.getCity());
		
		if(Objects.nonNull(pessoaRequest.getState()))
			this.setState(pessoaRequest.getState());
		
		if(Objects.nonNull(pessoaRequest.getCellphone()))
			this.setCellphone(pessoaRequest.getCellphone());
		
		if(Objects.nonNull(pessoaRequest.getPhone()))
		this.setPhone(pessoaRequest.getPhone());

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}

package com.project.lucasMoura.cast.payloads;

import javax.validation.constraints.NotNull;

import com.project.lucasMoura.cast.model.Pessoa;

public class PessoaResponse {
	
	private String id;
	
	private String name;
	
	private String street;
	
	private String number;
	
	private String neighborhood;
	
	private String city;
	
	private String state;
	
	private String cellphone;
	
	private String phone;
	
	
	public PessoaResponse(Pessoa pessoa){
		this.setId(pessoa.getId());
		this.setName(pessoa.getName());
		this.setStreet(pessoa.getStreet());
		this.setNumber(pessoa.getNumber());
		this.setNeighborhood(pessoa.getNeighborhood());
		this.setCity(pessoa.getCity());
		this.setState(pessoa.getState());
		this.setCellphone(pessoa.getCellphone());
		this.setPhone(pessoa.getPhone());
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

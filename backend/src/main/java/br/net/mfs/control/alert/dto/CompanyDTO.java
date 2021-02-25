package br.net.mfs.control.alert.dto;

import java.io.Serializable;

import br.net.mfs.control.alert.entities.Company;

public class CompanyDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name ;
	
	public CompanyDTO() {
		
	}

	public CompanyDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public CompanyDTO(Company entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

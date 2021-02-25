package br.net.mfs.control.alert.dto;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.net.mfs.control.alert.entities.Pessoa;

public class PessoaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id ;
	private String name ;
	private String sexo ;
	private String cpf ;
	private Calendar dateNascimento ;
	
	public PessoaDTO() {
		
	}

	public PessoaDTO(Long id, String name, String sexo, String cpf) {
		this.id = id;
		this.name = name;
		this.sexo = sexo;
		this.cpf = cpf;
	}
	
	public PessoaDTO(Pessoa entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.sexo = entity.getSexo();
		this.cpf = entity.getCpf();
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Calendar getDateNascimento() {
		return dateNascimento;
	}

	public void setDateNascimento(Calendar dateNascimento) {
		this.dateNascimento = dateNascimento;
	}
}

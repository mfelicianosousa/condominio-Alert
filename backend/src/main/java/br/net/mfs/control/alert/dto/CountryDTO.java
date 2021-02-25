package br.net.mfs.control.alert.dto;

import java.io.Serializable;

import br.net.mfs.control.alert.entities.Country;

public class CountryDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String codeIBGE ;
	private String name ;
	private String uf ;
	private String timezones ;
	
	
	public CountryDTO() {
		
	}

	public CountryDTO(String codeIBGE, String name, String uf, String timezones) {
		this.codeIBGE = codeIBGE;
		this.name = name;
		this.uf = uf;
		this.timezones = timezones ;
	}
	
	public CountryDTO(Country entity ) {
		this.codeIBGE = entity.getCodeIBGE();
		this.name = entity.getName();
		this.uf = entity.getUf();
		this.timezones = entity.getTimezones() ;
	}
	

	public String getCodeIBGE() {
		return codeIBGE;
	}

	public void setCodeIBGE(String codeIBGE) {
		this.codeIBGE = codeIBGE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getTimezones() {
		return timezones;
	}

	public void setTimezones(String timezones) {
		this.timezones = timezones;
	}


}

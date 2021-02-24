package br.net.mfs.control.alert.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String codeIBGE ;
	private String name ;
	private String uf ;
	private String timezones ;
	
	
	public Country() {
		
	}

	public Country(String codeIBGE, String name, String uf, String timezones) {
		this.codeIBGE = codeIBGE;
		this.name = name;
		this.uf = uf;
		this.timezones = timezones ;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeIBGE == null) ? 0 : codeIBGE.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (codeIBGE == null) {
			if (other.codeIBGE != null)
				return false;
		} else if (!codeIBGE.equals(other.codeIBGE))
			return false;
		return true;
	}


	
	
	

}

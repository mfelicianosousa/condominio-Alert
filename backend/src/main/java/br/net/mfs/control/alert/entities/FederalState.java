package br.net.mfs.control.alert.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FederalState implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UF")
	private String siglaUF ;
	private String codeUF;
	private String name ;

	public FederalState() {
		
	}

	public FederalState(String siglaUF, String codeUF, String name) {
		this.siglaUF = siglaUF;
		this.codeUF = codeUF;
		this.name = name;
	}

	public String getSiglaUF() {
		return siglaUF;
	}

	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
	}

	public String getCodeUF() {
		return codeUF;
	}

	public void setCodeUF(String codeUF) {
		this.codeUF = codeUF;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((siglaUF == null) ? 0 : siglaUF.hashCode());
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
		FederalState other = (FederalState) obj;
		if (siglaUF == null) {
			if (other.siglaUF != null)
				return false;
		} else if (!siglaUF.equals(other.siglaUF))
			return false;
		return true;
	}

	
	
		

}

package br.net.mfs.control.alert.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estado")
public class FederalState implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length=2)
	private String uf ;

	@Column(length=2)
	private String codeIBGE;

	@Column(length=50)
	private String name ;
	
	private int id_pais ;
	
	@Column(length=100)
	private String ddd ;
	
	public FederalState() {	
	}
	
	public FederalState(String uf, String codeIBGE, String name, int id_pais, String ddd) {
		this.uf = uf;
		this.codeIBGE = codeIBGE;
		this.name = name;
		this.id_pais = id_pais;
		this.ddd = ddd;
	}



	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
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

	public int getId_pais() {
		return id_pais;
	}

	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}

}

package br.net.mfs.control.alert.dto;

import java.io.Serializable;

import br.net.mfs.control.alert.entities.FederalState;

public class FederalStateDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String uf ;
	private String codeIBGE;
	private String name ;
	private int    id_pais ;
	private String ddd ;

	public FederalStateDTO() {
		
	}
	
	public FederalStateDTO(String uf, String codeIBGE, String name, int id_pais, String ddd) {
		this.uf = uf;
		this.codeIBGE = codeIBGE;
		this.name = name;
		this.id_pais = id_pais;
		this.ddd = ddd;
	}

	public FederalStateDTO(FederalState entity) {
		this.uf = entity.getUf();
		this.codeIBGE = entity.getCodeIBGE();
		this.name = entity.getName();
		this.id_pais = entity.getId_pais();
		this.ddd = entity.getDdd();
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

}

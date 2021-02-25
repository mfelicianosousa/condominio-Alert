package br.net.mfs.control.alert.dto;

import java.io.Serializable;

import br.net.mfs.control.alert.entities.Pais;

public class PaisDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id ;
	private String codPais ;
	private String name ;
	private String namePt ;
	private String sigla;
	private int codeBacen ;
	
	public PaisDTO() {
		
	}
	

	public PaisDTO(Long id, String codPais, String name, String namePt, String sigla, int codeBacen) {
		this.id = id;
		this.codPais = codPais;
		this.name = name;
		this.namePt = namePt;
		this.sigla = sigla;
		this.codeBacen = codeBacen;
	}

	public PaisDTO(Pais entity) {
		this.id = entity.getId();
		this.codPais = entity.getCodPais();
		this.name = entity.getName();
		this.namePt = entity.getNamePt();
		this.sigla = entity.getSigla();
		this.codeBacen = entity.getCodeBacen();
	}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodPais() {
		return codPais;
	}


	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNamePt() {
		return namePt;
	}


	public void setNamePt(String namePt) {
		this.namePt = namePt;
	}


	public String getSigla() {
		return sigla;
	}


	public void setSigla(String sigla) {
		this.sigla = sigla;
	}


	public int getCodeBacen() {
		return codeBacen;
	}


	public void setCodeBacen(int codeBacen) {
		this.codeBacen = codeBacen;
	}



}

package br.net.mfs.control.alert.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PAIS")
public class Pais implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	
	@Column(length=2)
	private String codPais ;
	
	@Column(length=60)
	private String name ;
	
	@Column(length=60)
	private String namePt ;
	
	@Column(length=2)
	private String sigla;
	
	private int codeBacen ;
	
	public Pais() {
		
	}
	

	public Pais(Long id, String codPais, String name, String namePt, String sigla, int codeBacen) {
		this.id = id;
		this.codPais = codPais;
		this.name = name;
		this.namePt = namePt;
		this.sigla = sigla;
		this.codeBacen = codeBacen;
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPais == null) ? 0 : codPais.hashCode());
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
		Pais other = (Pais) obj;
		if (codPais == null) {
			if (other.codPais != null)
				return false;
		} else if (!codPais.equals(other.codPais))
			return false;
		return true;
	}
	
	

}

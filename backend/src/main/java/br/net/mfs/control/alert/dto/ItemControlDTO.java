package br.net.mfs.control.alert.dto;

import java.io.Serializable;

import br.net.mfs.control.alert.entities.ItemControl;

public class ItemControlDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name ;
	private String description ;
	
	public ItemControlDTO() {
	
	}

	public ItemControlDTO(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public ItemControlDTO(ItemControl entity ) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.description = entity.getDescription();
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

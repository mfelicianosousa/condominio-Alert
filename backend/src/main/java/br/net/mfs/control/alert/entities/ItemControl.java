package br.net.mfs.control.alert.entities;

import java.io.Serializable;

public class ItemControl implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name ;
	private String description ;
	
	public ItemControl() {
		
	}

	public ItemControl(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	

}

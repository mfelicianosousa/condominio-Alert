package br.net.mfs.control.alert.dto;

import java.io.Serializable;

import br.net.mfs.control.alert.entities.User;

public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id ;
	private String login ;
	private String email ;
	private String password ;
	private String firstName ;
	private String lastName ;
	

	public UserDTO() {
		
	}


	public UserDTO( Long id, String login, String email, String password, String firstName, String lastName) {
		this.id = id;
		this.login = login;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UserDTO( User entity ) {
		this.id = entity.getId();
		this.login = entity.getLogin();
		this.email = entity.getEmail();
		this.password = entity.getPassword();
		this.firstName = entity.getFirstName();
		this.lastName = entity.getLastName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

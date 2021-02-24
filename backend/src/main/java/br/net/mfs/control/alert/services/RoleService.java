package br.net.mfs.control.alert.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.control.alert.entities.Role;
import br.net.mfs.control.alert.repositories.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository repository ;
	
	public List<Role> findAll(){
		
		return repository.findAll();
	}
}

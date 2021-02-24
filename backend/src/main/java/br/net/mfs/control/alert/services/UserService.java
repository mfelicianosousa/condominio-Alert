package br.net.mfs.control.alert.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.control.alert.entities.User;
import br.net.mfs.control.alert.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository ;
	
	public List<User> findAll(){
		return repository.findAll() ;
 	}
}

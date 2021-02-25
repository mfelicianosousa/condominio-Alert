package br.net.mfs.control.alert.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.control.alert.dto.UserDTO;
import br.net.mfs.control.alert.entities.User;
import br.net.mfs.control.alert.repositories.UserRepository;
import br.net.mfs.control.alert.services.exception.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository ;
	
	@Transactional(readOnly=true)
	public List<UserDTO> findAll(){
	List<User> list = repository.findAll() ;
		
		return  list.stream().map( x -> new UserDTO( x ) ).collect( Collectors.toList()) ;
 	}
	
	@Transactional(readOnly=true)
	public UserDTO findById(Long id) {
		
		Optional<User> obj = repository.findById(id);	
		User entity = obj.orElseThrow(()-> new EntityNotFoundException("Entity not Found")) ;
		return new UserDTO( entity );
	}
}

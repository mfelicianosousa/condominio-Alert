package br.net.mfs.control.alert.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.control.alert.dto.RoleDTO;
import br.net.mfs.control.alert.entities.Role;
import br.net.mfs.control.alert.repositories.RoleRepository;
import br.net.mfs.control.alert.services.exception.EntityNotFoundException;

@Service
public class RoleService {

	@Autowired
	private RoleRepository repository ;
	
	@Transactional(readOnly=true)
	public List<RoleDTO> findAll(){
	List<Role> list = repository.findAll() ;

		return  list.stream().map( x -> new RoleDTO( x ) ).collect( Collectors.toList()) ;
	}
	
	@Transactional(readOnly=true)
	public RoleDTO findById(Long id) {
		
		Optional<Role> obj = repository.findById(id);	
		Role entity = obj.orElseThrow(()-> new EntityNotFoundException("Entity not Found")) ;
		return new RoleDTO( entity );
	}
}

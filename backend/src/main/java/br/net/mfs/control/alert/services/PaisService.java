package br.net.mfs.control.alert.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.control.alert.dto.PaisDTO;
import br.net.mfs.control.alert.entities.Pais;
import br.net.mfs.control.alert.repositories.PaisRepository;
import br.net.mfs.control.alert.services.exception.EntityNotFoundException;

@Service
public class PaisService {

	@Autowired
	private PaisRepository repository ;
	
	@Transactional(readOnly=true)
	public List<PaisDTO> findAll(){
	List<Pais> list = repository.findAll() ;
		
		return  list.stream().map( x -> new PaisDTO( x ) ).collect( Collectors.toList()) ;
	}
	
	@Transactional(readOnly=true)
	public PaisDTO findById(Long id) {
		
		Optional<Pais> obj = repository.findById(id);	
		Pais entity = obj.orElseThrow(()-> new EntityNotFoundException("Entity not Found")) ;
		return new PaisDTO( entity );
	}
	
}

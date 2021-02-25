package br.net.mfs.control.alert.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.control.alert.dto.FederalStateDTO;
import br.net.mfs.control.alert.entities.FederalState;
import br.net.mfs.control.alert.repositories.FederalStateRepository;
import br.net.mfs.control.alert.services.exception.EntityNotFoundException;

@Service
public class FederalStateService {

	@Autowired
	private FederalStateRepository repository ;
	
	@Transactional(readOnly=true)
	public List<FederalStateDTO> findAll(){
		
		
		List<FederalState> list = repository.findAll() ;
		
		return  list.stream().map( x -> new FederalStateDTO( x ) ).collect( Collectors.toList()) ;
	}
	
	@Transactional(readOnly=true)
	public FederalStateDTO findById(String id) {
		
		Optional<FederalState> obj = repository.findById(id);	
		FederalState entity = obj.orElseThrow(()-> new EntityNotFoundException("Entity not Found")) ;
		return new FederalStateDTO( entity );
	}
}

package br.net.mfs.control.alert.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.control.alert.dto.CountryDTO;
import br.net.mfs.control.alert.entities.Country;
import br.net.mfs.control.alert.repositories.CountryRepository;
import br.net.mfs.control.alert.services.exception.EntityNotFoundException;

@Service 
public class CountryService {

	@Autowired
	private CountryRepository repository ;
	
	@Transactional(readOnly=true)
	public List<CountryDTO> findAll(){
		
		List<Country> list = repository.findAll() ;
		
		return  list.stream().map( x -> new CountryDTO( x ) ).collect( Collectors.toList()) ;
	}
	
	
	@Transactional(readOnly=true)
	public CountryDTO findById(String id) {
		
		Optional<Country> obj = repository.findById(id);	
		Country entity = obj.orElseThrow(()-> new EntityNotFoundException("Entity not Found")) ;
		return new CountryDTO( entity );
	}

}

package br.net.mfs.control.alert.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.control.alert.entities.Country;
import br.net.mfs.control.alert.repositories.CountryRepository;

@Service 
public class CountryService {

	@Autowired
	private CountryRepository repository ;
	
	public List<Country> findAll(){
		
		return repository.findAll() ;
	}
}

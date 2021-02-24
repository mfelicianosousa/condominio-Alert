package br.net.mfs.control.alert.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.control.alert.entities.FederalState;
import br.net.mfs.control.alert.repositories.FederalStateRepository;

@Service
public class FederalStateService {

	@Autowired
	private FederalStateRepository repository ;
	
	public List<FederalState> findAll(){
		
		return repository.findAll() ;
	}
}

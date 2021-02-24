package br.net.mfs.control.alert.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.control.alert.entities.Client;
import br.net.mfs.control.alert.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired 
	private ClientRepository repository ;

	public List<Client> findAll(){
		
		return repository.findAll() ;
	}

}

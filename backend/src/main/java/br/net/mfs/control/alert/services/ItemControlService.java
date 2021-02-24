package br.net.mfs.control.alert.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.control.alert.entities.ItemControl;
import br.net.mfs.control.alert.repositories.ItemControlRepository;

@Service
public class ItemControlService {

	@Autowired
	private ItemControlRepository repository ;
	
	public List<ItemControl> findAll(){
		
		return repository.findAll() ;
	}

}

package br.net.mfs.control.alert.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.control.alert.dto.CompanyDTO;
import br.net.mfs.control.alert.dto.ItemControlDTO;
import br.net.mfs.control.alert.entities.Company;
import br.net.mfs.control.alert.entities.ItemControl;
import br.net.mfs.control.alert.repositories.ItemControlRepository;

@Service
public class ItemControlService {

	@Autowired
	private ItemControlRepository repository ;
	
	@Transactional(readOnly=true)
	public List<ItemControlDTO> findAll(){
		
		
		List<ItemControl> list = repository.findAll() ;
		
		return  list.stream().map( x -> new ItemControlDTO( x ) ).collect( Collectors.toList()) ;
	}

	@Transactional(readOnly=true)
	public ItemControlDTO findById(Long id) {
		
		Optional<ItemControl> obj = repository.findById(id);	
		ItemControl entity = obj.get() ;
		return new ItemControlDTO( entity );
	}
}

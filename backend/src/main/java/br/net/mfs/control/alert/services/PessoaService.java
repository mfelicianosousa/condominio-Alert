package br.net.mfs.control.alert.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.control.alert.dto.CompanyDTO;
import br.net.mfs.control.alert.dto.PessoaDTO;
import br.net.mfs.control.alert.entities.Company;
import br.net.mfs.control.alert.entities.Pessoa;
import br.net.mfs.control.alert.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository ;
	
	@Transactional(readOnly=true)
	public List<PessoaDTO> findAll(){
	List<Pessoa> list = repository.findAll() ;
		
		return  list.stream().map( x -> new PessoaDTO( x ) ).collect( Collectors.toList()) ;
	}
	
	@Transactional(readOnly=true)
	public PessoaDTO findById(Long id) {
		
		Optional<Pessoa> obj = repository.findById(id);	
		Pessoa entity = obj.get() ;
		return new PessoaDTO( entity );
	}

}

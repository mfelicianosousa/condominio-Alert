package br.net.mfs.control.alert.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.control.alert.entities.Pessoa;
import br.net.mfs.control.alert.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository ;
	
	public List<Pessoa> findAll(){
		
		return repository.findAll();
	}
	
	

}

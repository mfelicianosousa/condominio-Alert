package br.net.mfs.control.alert.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.control.alert.entities.Company;
import br.net.mfs.control.alert.repositories.CompanyRepository;

@Service
public class CompanyService {
	
		@Autowired
		private CompanyRepository repository ;
		
		public List<Company> findAll(){
			
			return repository.findAll() ;
		}
	

}

package br.net.mfs.control.alert.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.control.alert.dto.CompanyDTO;
import br.net.mfs.control.alert.entities.Company;
import br.net.mfs.control.alert.repositories.CompanyRepository;

@Service
public class CompanyService {
	
		@Autowired
		private CompanyRepository repository ;
		
		@Transactional(readOnly=true)
		public List<CompanyDTO> findAll(){
			
			List<Company> list = repository.findAll() ;
			
			return  list.stream().map( x -> new CompanyDTO( x ) ).collect( Collectors.toList()) ;
			
		}
		
		@Transactional(readOnly=true)
		public CompanyDTO findById(Long id) {
			
			Optional<Company> obj = repository.findById(id);	
			Company entity = obj.get() ;
			return new CompanyDTO( entity );
		}
	

}

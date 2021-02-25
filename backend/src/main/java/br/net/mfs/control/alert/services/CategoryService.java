package br.net.mfs.control.alert.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.control.alert.dto.CategoryDTO;
import br.net.mfs.control.alert.entities.Category;
import br.net.mfs.control.alert.repositories.CategoryRepository;
import br.net.mfs.control.alert.services.exception.EntityNotFoundException;

/* registrar a classe como um componente que vai participar de um componente de injeção*/

@Service
public class CategoryService {
	
		@Autowired 
		private CategoryRepository repository ;
		
		
		@Transactional(readOnly=true)
		public List<CategoryDTO> findAll(){
			
			List<Category> list = repository.findAll() ;
			/* expressão Lambda */
			
			return  list.stream().map( x -> new CategoryDTO( x ) ).collect( Collectors.toList()) ;
			
			
		}

		@Transactional(readOnly=true)
		public CategoryDTO findById(Long id) {
			
			Optional<Category> obj = repository.findById(id);	
			Category entity = obj.orElseThrow(()-> new EntityNotFoundException("Entity not Found")) ;
			return new CategoryDTO( entity );
		}

		@Transactional
		public CategoryDTO insert(CategoryDTO dto) {
			
			Category entity = new Category();	
			entity.setName( dto.getName() );
			entity = repository.save( entity ) ;
			
			return new CategoryDTO( entity ) ;
		}
		
	
}

package br.net.mfs.control.alert.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.control.alert.entities.Category;
import br.net.mfs.control.alert.repositories.CategoryRepository;

/* registrar a classe como um componente que vai participar de um componente de injeção*/

@Service
public class CategoryService {
	
		@Autowired 
		private CategoryRepository repository ;

		public List<Category> findAll(){
			
			return repository.findAll() ;
		}
}

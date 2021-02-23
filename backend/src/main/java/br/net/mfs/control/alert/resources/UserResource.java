package br.net.mfs.control.alert.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.entities.Company;

@RestController 
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity< List<Company>> findAll(){
		List<Company> list = new ArrayList<>();
		list.add(new Company( 1L,"MARCELINO"));
		list.add(new Company( 2L,"ALEX")) ;
		list.add(new Company( 3L,"HUGUINHO")) ;
		list.add(new Company( 4L,"ZEZINHO")) ;
		list.add(new Company( 5L,"LUIZINHO")) ;
		
		return ResponseEntity.ok().body(list) ;
	}	

}

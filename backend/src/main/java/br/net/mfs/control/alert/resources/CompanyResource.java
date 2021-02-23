package br.net.mfs.control.alert.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.entities.Company;

@RestController
@RequestMapping(value="/companies")
public class CompanyResource {

	@GetMapping
	public ResponseEntity< List<Company>> findAll(){
		List<Company> list = new ArrayList<>();
		list.add(new Company( 1L,"O gato mia"));
		list.add(new Company( 2L,"O cachorro late")) ;
		list.add(new Company( 3L,"O Lobo mau")) ;
		list.add(new Company( 4L,"Cri-Cri-azul")) ;
		list.add(new Company( 5L,"Frajola e piu-piu")) ;
		list.add(new Company( 6L,"Tom & Jerry")) ;
		list.add(new Company( 7L,"Tio Patinhas")) ;
		list.add(new Company( 8L,"Pateta & Michey")) ;
		
		return ResponseEntity.ok().body(list) ;
	}	
}

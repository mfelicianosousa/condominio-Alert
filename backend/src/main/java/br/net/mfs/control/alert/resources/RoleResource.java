package br.net.mfs.control.alert.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.entities.Role;

@RestController
@RequestMapping(value="/rolies")
public class RoleResource {
	@GetMapping
	public ResponseEntity< List<Role>> findAll(){
		List<Role> list = new ArrayList<>();
		list.add(new Role( 1L,"ADMINISTRATION"));
		list.add(new Role( 2L,"OPERATOR")) ;
		list.add(new Role( 3L,"USER")) ;
		list.add(new Role( 4L,"VIEW")) ;
		list.add(new Role( 5L,"AUDITOR")) ;
		
		return ResponseEntity.ok().body(list) ;
	}	

}

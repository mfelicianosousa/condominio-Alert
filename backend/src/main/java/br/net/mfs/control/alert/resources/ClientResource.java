package br.net.mfs.control.alert.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.entities.Client;

@RestController 
@RequestMapping(value="/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity< List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client( 1L,"Arlindo Cruz"));
		list.add(new Client( 2L,"Zeca Pagodinho")) ;
		list.add(new Client( 3L,"Bezerra da Silva")) ;
		list.add(new Client( 4L,"Diogo Nogueira")) ;
		list.add(new Client( 5L,"Beth Carvalho")) ;
		list.add(new Client( 6L,"Alanis Morissete")) ;
		list.add(new Client( 7L,"Roupa Nova")) ;
		list.add(new Client( 8L,"Madonna Mia")) ;
		
		return ResponseEntity.ok().body(list) ;
		
		
	}

}

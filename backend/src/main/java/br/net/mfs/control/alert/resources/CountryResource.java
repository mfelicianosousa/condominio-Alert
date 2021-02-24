package br.net.mfs.control.alert.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.entities.Country;
import br.net.mfs.control.alert.services.CountryService;

@RestController 
@RequestMapping(value="/countries")
public class CountryResource {
	
	@Autowired
    private CountryService service ;
    
	@GetMapping
	public ResponseEntity< List<Country>> findAll(){
		List<Country> list = service.findAll() ;
		
		return ResponseEntity.ok().body(list) ;
		
		
	}

}

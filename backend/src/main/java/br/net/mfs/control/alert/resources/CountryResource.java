package br.net.mfs.control.alert.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.dto.CompanyDTO;
import br.net.mfs.control.alert.dto.CountryDTO;
import br.net.mfs.control.alert.services.CountryService;

@RestController 
@RequestMapping(value="/countries")
public class CountryResource {
	
	@Autowired
    private CountryService service ;
    
	@GetMapping
	public ResponseEntity< List<CountryDTO>> findAll(){
		List<CountryDTO> list = service.findAll() ;
		
		return ResponseEntity.ok().body(list) ;
		
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity< CountryDTO> findById(@PathVariable String id){
		
		CountryDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto) ;
		
	}

}

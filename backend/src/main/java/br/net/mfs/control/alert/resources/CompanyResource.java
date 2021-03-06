package br.net.mfs.control.alert.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.dto.ClientDTO;
import br.net.mfs.control.alert.dto.CompanyDTO;
import br.net.mfs.control.alert.services.CompanyService;

@RestController
@RequestMapping(value="/companies")
public class CompanyResource {
	
	@Autowired 
	private CompanyService service ;

	@GetMapping
	public ResponseEntity< List<CompanyDTO>> findAll(){
		List<CompanyDTO> list = service.findAll();
		return ResponseEntity.ok().body(list) ;
	}	
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity< CompanyDTO> findById(@PathVariable Long id){
		
		CompanyDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto) ;
		
	}
	
	
}

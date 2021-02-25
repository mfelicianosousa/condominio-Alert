package br.net.mfs.control.alert.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.dto.CompanyDTO;
import br.net.mfs.control.alert.dto.PaisDTO;
import br.net.mfs.control.alert.services.PaisService;

@RestController 
@RequestMapping(value="/paises")
public class PaisResource {

	
	@Autowired
	private PaisService service ;
	
	@GetMapping
	public ResponseEntity< List<PaisDTO>> findAll(){
		
		List<PaisDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list) ;
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity< PaisDTO> findById(@PathVariable Long id){
		
		PaisDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto) ;
		
	}
	
}

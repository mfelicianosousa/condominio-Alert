package br.net.mfs.control.alert.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.dto.CategoryDTO;
import br.net.mfs.control.alert.dto.ClientDTO;
import br.net.mfs.control.alert.services.ClientService;

@RestController 
@RequestMapping(value="/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service ;
	
	@GetMapping
	public ResponseEntity< List<ClientDTO>> findAll(){
		List<ClientDTO> list = service.findAll() ;
		return ResponseEntity.ok().body(list) ;
		
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity< ClientDTO> findById(@PathVariable Long id){
		
		ClientDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto) ;
		
	}

}

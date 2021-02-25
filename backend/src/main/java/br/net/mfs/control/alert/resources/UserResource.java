package br.net.mfs.control.alert.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.dto.CompanyDTO;
import br.net.mfs.control.alert.dto.UserDTO;
import br.net.mfs.control.alert.services.UserService;

@RestController 
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service ;
	
	
	@GetMapping
	public ResponseEntity< List<UserDTO>> findAll(){
		List<UserDTO> list = service.findAll() ;
		return ResponseEntity.ok().body(list) ;
	}	
	
	@GetMapping(value="/{id}")
	public ResponseEntity< UserDTO> findById(@PathVariable Long id){
		
		UserDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto) ;
		
	}

}

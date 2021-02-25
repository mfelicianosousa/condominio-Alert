package br.net.mfs.control.alert.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.dto.RoleDTO;
import br.net.mfs.control.alert.services.RoleService;

@RestController
@RequestMapping(value="/rolies")
public class RoleResource {
	
	@Autowired
	private RoleService service ;
	
	@GetMapping
	public ResponseEntity< List<RoleDTO>> findAll(){
		
		List<RoleDTO> list = service.findAll() ;
		
		return ResponseEntity.ok().body(list) ;
	}	

	@GetMapping(value="/{id}")
	public ResponseEntity< RoleDTO> findById(@PathVariable Long id){
		
		RoleDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto) ;
		
	}
}

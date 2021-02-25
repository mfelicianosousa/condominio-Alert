package br.net.mfs.control.alert.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.dto.ItemControlDTO;
import br.net.mfs.control.alert.services.ItemControlService;

@RestController
@RequestMapping(value="/itemcontrols")
public class ItemControlResource {
	
	@Autowired
	private ItemControlService service ;
	
	@GetMapping
	public ResponseEntity< List<ItemControlDTO>> findAll(){
		List<ItemControlDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list) ;
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity< ItemControlDTO> findById(@PathVariable Long id){
		
		ItemControlDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto) ;
		
	}
}

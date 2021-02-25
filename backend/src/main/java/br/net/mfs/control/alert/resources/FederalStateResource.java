package br.net.mfs.control.alert.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.dto.FederalStateDTO;
import br.net.mfs.control.alert.services.FederalStateService;

@RestController 
@RequestMapping(value="/uf")
public class FederalStateResource {
	
	@Autowired
	private FederalStateService service ;

	@GetMapping
	public ResponseEntity< List<FederalStateDTO>> findAll(){
		List<FederalStateDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list) ;
		
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity< FederalStateDTO> findById(@PathVariable String id){
		
		FederalStateDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto) ;
		
	}

}

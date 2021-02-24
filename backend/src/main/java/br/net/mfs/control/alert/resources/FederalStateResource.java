package br.net.mfs.control.alert.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.entities.FederalState;
import br.net.mfs.control.alert.services.FederalStateService;

@RestController 
@RequestMapping(value="/uf")
public class FederalStateResource {
	
	@Autowired
	private FederalStateService service ;

	@GetMapping
	public ResponseEntity< List<FederalState>> findAll(){
		List<FederalState> list = service.findAll();
		
		return ResponseEntity.ok().body(list) ;
		
		
	}

}

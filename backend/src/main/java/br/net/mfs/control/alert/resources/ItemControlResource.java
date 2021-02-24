package br.net.mfs.control.alert.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.entities.ItemControl;
import br.net.mfs.control.alert.services.ItemControlService;

@RestController
@RequestMapping(value="/itemcontrols")
public class ItemControlResource {
	
	@Autowired
	private ItemControlService service ;
	
	@GetMapping
	public ResponseEntity< List<ItemControl>> findAll(){
		List<ItemControl> list = service.findAll();
		
		return ResponseEntity.ok().body(list) ;
	}
}

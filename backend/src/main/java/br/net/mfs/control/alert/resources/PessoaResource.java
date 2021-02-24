package br.net.mfs.control.alert.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.entities.Pessoa;
import br.net.mfs.control.alert.services.PessoaService;

@RestController 
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService service ;
	
	public ResponseEntity< List<Pessoa>> findAll(){
		List<Pessoa> list = service.findAll();
		
		return ResponseEntity.ok().body(list) ;
		
		
	}
	

}

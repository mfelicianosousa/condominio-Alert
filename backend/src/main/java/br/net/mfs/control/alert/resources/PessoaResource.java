package br.net.mfs.control.alert.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.dto.CompanyDTO;
import br.net.mfs.control.alert.dto.PessoaDTO;
import br.net.mfs.control.alert.services.PessoaService;

@RestController 
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService service ;
	
	public ResponseEntity< List<PessoaDTO>> findAll(){
		
		List<PessoaDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list) ;
		
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity< PessoaDTO> findById(@PathVariable Long id){
		
		PessoaDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto) ;
		
	}

}

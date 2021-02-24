package br.net.mfs.control.alert.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.entities.Company;
import br.net.mfs.control.alert.services.CompanyService;

@RestController
@RequestMapping(value="/companies")
public class CompanyResource {
	
	@Autowired 
	private CompanyService service ;

	@GetMapping
	public ResponseEntity< List<Company>> findAll(){
		List<Company> list = service.findAll();
		return ResponseEntity.ok().body(list) ;
	}	
}

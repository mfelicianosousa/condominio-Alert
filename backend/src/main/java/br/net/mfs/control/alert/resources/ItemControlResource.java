package br.net.mfs.control.alert.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.mfs.control.alert.entities.ItemControl;

@RestController
@RequestMapping(value="/itemcontrols")
public class ItemControlResource {
	@GetMapping
	public ResponseEntity< List<ItemControl>> findAll(){
		List<ItemControl> list = new ArrayList<>();
		list.add(new ItemControl( 1L,"Pega-Pega","corre que la vem chumbo"));
		list.add(new ItemControl( 2L,"A arvore","plantada uma árvore, escrito um libro")) ;
		list.add(new ItemControl( 3L,"Mané é zé-mane","como é que é ")) ;
		list.add(new ItemControl( 4L,"Ciranda","ciranda de pedra")) ;
		list.add(new ItemControl( 5L,"Joia do Nilo","rara beleza")) ;
		list.add(new ItemControl( 6L,"Bicho homem, lobisomen","corre que é feio")) ;
		list.add(new ItemControl( 7L,"Cala te boca","morde a lingua ")) ;
		list.add(new ItemControl( 8L,"O Sol da meia-noite","beleza natural")) ;
		
		return ResponseEntity.ok().body(list) ;
	}
}

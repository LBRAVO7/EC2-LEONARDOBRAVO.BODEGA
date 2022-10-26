package com.example.ec2_leonardobravo.bodega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ec2_leonardobravo.bodega.model.Bodega;
import com.example.ec2_leonardobravo.bodega.service.BodegaService;

@RestController
@RequestMapping("/bodegas/v1")
public class BodegaController {
	
	
	public class ProductoController {
		
		@Autowired
		private BodegaService service;
		
		@RequestMapping(path = "/listar", method = RequestMethod.GET)
		public ResponseEntity<List<Bodega>> listar(){
			return new ResponseEntity<List<Bodega>>(service.listar(), HttpStatus.OK) ;
		}
		
		@RequestMapping(path="/guardar", method = RequestMethod.POST)
		public ResponseEntity<Void> guardar(@RequestBody Bodega bodegas ){
			service.guardar(bodegas);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		
		@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
		public ResponseEntity<Bodega> obtenerPorId(@PathVariable Integer id){
			
			Bodega bodegas = service.obtener(id);
			
			if( bodegas != null) {
				return new ResponseEntity<Bodega>(bodegas, HttpStatus.OK);
			}else {
				return new ResponseEntity<Bodega>(HttpStatus.NOT_FOUND);
			}
			
	
		}
	}
}



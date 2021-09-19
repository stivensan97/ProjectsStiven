package com.clientes.pruebaSpringBootJava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientes.pruebaSpringBootJava.entity.Cliente;
import com.clientes.pruebaSpringBootJava.service.ClienteService;

@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping({"/clientes"})
public class Controlador {
	@Autowired
	ClienteService service;
	
	@GetMapping
	public List<Cliente>Listar(){
		
	return 	service.listar();
	}
	
	@PostMapping
	public Cliente agregar(@RequestBody Cliente c) {
		return service.agregar(c);
	}
	
	@GetMapping(path = {"/{nmid}"})
	public Cliente listarId(@PathVariable("nmid") int nmid) {
		return service.listarId(nmid);
	}
	
	@PutMapping(path = {"/{nmid}"})
	public Cliente editar(@RequestBody Cliente c,@PathVariable("nmid") int nmid) {
		c.setNmid(nmid);
		return service.editar(c);
	}
	
	@DeleteMapping(path = {"/{nmid}"})
	public Cliente delete(@PathVariable("nmid") int nmid) {
		return service.eliminar(nmid);
	}
	
	@GetMapping("/error")
	public String error() {
		return "El sitio se encuentra en mantenimiento";
	}
	
	

}

package com.clientes.pruebaSpringBootJava.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clientes.pruebaSpringBootJava.entity.Cliente;
import com.clientes.pruebaSpringBootJava.entity.ClienteRepositorio;

 @Service
public class ClienteServiceImp implements ClienteService {

	 
@Autowired 
ClienteRepositorio repositorio;
		
	
	@Override
	public List<Cliente> listar() {

		return repositorio.findAll();
	}

	@Override
	public Cliente listarId(Integer nmid) {
		return repositorio.findByNmid(nmid);
	}

	@Override
	public Cliente agregar(Cliente c) {
		return repositorio.save(c);
	}

	@Override
	public Cliente editar(Cliente c) {
		return repositorio.save(c);
	}

	@Override
	public Cliente eliminar(Integer nmid) {
		Cliente c=repositorio.findByNmid(nmid);
		if(c!=null) {
			repositorio.delete(c);
		}
		return c;
	}

}

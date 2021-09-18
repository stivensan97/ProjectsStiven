package com.clientes.pruebaSpringBootJava;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

 @Service
 @Component
 @ComponentScan("com.springBoot")
public class ClienteServiceImp implements ClienteService {

	 @Autowired
		ClienteServiceARepositorio service;
		
	
	@Override
	public List<Cliente> listar() {

		return null;
	}

	@Override
	public Cliente listarId(BigInteger nmid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente agregar(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente editar(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente eliminar(BigInteger nmid) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.clientes.pruebaSpringBootJava.service;

import java.util.List;

import com.clientes.pruebaSpringBootJava.entity.Cliente;

import java.math.BigInteger;

public interface ClienteService {
	List<Cliente>listar();
	Cliente listarId(Integer nmid);
	Cliente agregar(Cliente c);
	Cliente editar(Cliente c);
	Cliente eliminar(Integer nmid);
}

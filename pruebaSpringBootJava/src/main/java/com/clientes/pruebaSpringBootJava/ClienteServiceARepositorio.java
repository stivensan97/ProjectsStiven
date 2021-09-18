package com.clientes.pruebaSpringBootJava;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.List;

@Component
public interface ClienteServiceARepositorio extends Repository<Cliente, BigInteger> {
	List<Cliente>findAll();
	Cliente findOne(BigInteger nmid);
	Cliente save(Cliente c);
	void delete(Cliente c);
}

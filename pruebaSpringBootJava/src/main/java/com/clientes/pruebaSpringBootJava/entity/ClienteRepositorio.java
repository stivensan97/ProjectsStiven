package com.clientes.pruebaSpringBootJava.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.math.BigInteger;
import java.util.List;

public interface ClienteRepositorio extends Repository<Cliente, Integer> {
	List<Cliente>findAll();
	Cliente findByNmid(int nmid);
	Cliente save(Cliente c);
	void delete(Cliente c);
	//Cliente getById(int nmid);
}

package com.clientes.pruebaSpringBootJava;

import java.util.List;
import java.math.BigInteger;

public interface ClienteService {
	List<Cliente>listar();
	Cliente listarId(BigInteger nmid);
	Cliente agregar(Cliente c);
	Cliente editar(Cliente c);
	Cliente eliminar(BigInteger nmid);
}

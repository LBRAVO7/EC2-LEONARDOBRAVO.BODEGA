package com.example.ec2_leonardobravo.bodega.service;

import java.util.List;

import com.example.ec2_leonardobravo.bodega.model.Cliente;




public interface ClienteService {
	void guardar(Cliente clientes);
	void actualizar(Cliente clientes);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);

}

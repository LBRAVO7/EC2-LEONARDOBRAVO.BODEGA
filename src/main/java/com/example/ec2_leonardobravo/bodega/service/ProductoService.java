package com.example.ec2_leonardobravo.bodega.service;

import java.util.List;

import com.example.ec2_leonardobravo.bodega.model.Producto;


public interface ProductoService {
	
	void guardar(Producto productos);
	void actualizar(Producto productos);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);

}

package com.example.ec2_leonardobravo.bodega.service;

import java.util.List;

import com.example.ec2_leonardobravo.bodega.model.Bodega;



public interface BodegaService {
	
	void guardar(Bodega bodegas);
	void actualizar(Bodega bodegas);
	void eliminar(Integer id);
	List<Bodega> listar();
	Bodega obtener(Integer id);

}

package com.example.ec2_leonardobravo.bodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ec2_leonardobravo.bodega.model.Producto;
import com.example.ec2_leonardobravo.bodega.repository.ProductoRepository;


@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository rerpositorio;
	
	@Override
	public void guardar(Producto productos) {
		// TODO Auto-generated method stub
		rerpositorio.save(productos);
	}

	@Override
	public void actualizar(Producto productos) {
		// TODO Auto-generated method stub
		rerpositorio.saveAndFlush(productos);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		rerpositorio.deleteById(id);
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return rerpositorio.findAll();
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		return rerpositorio.findById(id).orElse(null);
	}

}

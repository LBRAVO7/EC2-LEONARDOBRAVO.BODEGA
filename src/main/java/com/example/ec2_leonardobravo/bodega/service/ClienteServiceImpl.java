package com.example.ec2_leonardobravo.bodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ec2_leonardobravo.bodega.model.Cliente;
import com.example.ec2_leonardobravo.bodega.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService{
	
		
		@Autowired
		private ClienteRepository rerpositorio;
		
		@Override
		public void guardar(Cliente cliente) {
			// TODO Auto-generated method stub
			rerpositorio.save(cliente);
		}

		@Override
		public void actualizar(Cliente cliente) {
			// TODO Auto-generated method stub
			rerpositorio.saveAndFlush(cliente);
		}

		@Override
		public void eliminar(Integer id) {
			// TODO Auto-generated method stub
			rerpositorio.deleteById(id);
		}

		@Override
		public List<Cliente> listar() {
			// TODO Auto-generated method stub
			return rerpositorio.findAll();
		}

		@Override
		public Cliente obtener(Integer id) {
			// TODO Auto-generated method stub
			return rerpositorio.findById(id).orElse(null);
		}


}

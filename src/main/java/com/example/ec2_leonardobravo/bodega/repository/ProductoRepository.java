package com.example.ec2_leonardobravo.bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ec2_leonardobravo.bodega.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}

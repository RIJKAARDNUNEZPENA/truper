package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos,Long> {

}

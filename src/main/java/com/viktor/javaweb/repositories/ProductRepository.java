package com.viktor.javaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viktor.javaweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}

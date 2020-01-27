package com.viktor.javaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viktor.javaweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}

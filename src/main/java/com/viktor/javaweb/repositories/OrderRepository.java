package com.viktor.javaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.viktor.javaweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}

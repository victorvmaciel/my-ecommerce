package com.viktor.javaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viktor.javaweb.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}

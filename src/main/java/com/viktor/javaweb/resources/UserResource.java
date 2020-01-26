package com.viktor.javaweb.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viktor.javaweb.entity.User;

@RestController
@RequestMapping(value ="/users")

public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Viktor", "victorvmaciel@gmail.com","66666666", "@342#@assaa");
		return ResponseEntity.ok().body(u);
		
	}
	

}

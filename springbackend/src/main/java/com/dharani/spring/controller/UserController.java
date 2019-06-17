package com.dharani.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.entity.User;
import com.dharani.spring.dto.UserDTO;
import com.dharani.spring.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="/user")
	public List<User> getAllUser(){
		return userService.getAllUser();
		
	}
	
	@PostMapping(path="/user")
	public void saveUser(@RequestBody UserDTO userDto) {
		
		userService.saveUser(userDto);
		
	}
	
	@GetMapping(path="findByName")
	
	public User findByUserName(@RequestParam String username) {
		
		return userService.findByUserName(username);
		
	}
	
	
	

}

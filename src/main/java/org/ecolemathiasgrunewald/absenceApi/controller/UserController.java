package org.ecolemathiasgrunewald.absenceApi.controller;

import org.ecolemathiasgrunewald.absenceApi.model.User;
import org.ecolemathiasgrunewald.absenceApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public Iterable<User> getUsers(){
		return userService.getUsers();
	}
	
}

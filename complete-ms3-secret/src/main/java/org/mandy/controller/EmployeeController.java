package org.mandy.controller;

import org.mandy.Model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Value("${spring.datasource.username}")
	private String userName;
	@Value("${spring.datasource.password}")
	private int password;
	
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<User> getUsers() {
		User u1 = new User(userName, password);
		return ResponseEntity.ok(u1);
	}
}

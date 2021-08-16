package org.mandy.controller;

import org.mandy.Model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ResponseEntity<User> getUsers() {
		User u1 = new User("Mandeep", 34);
		return ResponseEntity.ok(u1);
	}
}

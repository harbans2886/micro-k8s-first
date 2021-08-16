package org.mandy.controller;

import org.mandy.Model.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	public ResponseEntity<Client> getUsers() {
		Client u1 = new Client(1234,"Mukhija");
		return ResponseEntity.ok(u1);
	}
}

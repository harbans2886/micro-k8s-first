package io.mandy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/v1", method = RequestMethod.GET)
	public String getString() {
		return "IngressMain1";
	}
}
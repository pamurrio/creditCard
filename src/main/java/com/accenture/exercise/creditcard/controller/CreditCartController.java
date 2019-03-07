package com.accenture.exercise.creditcard.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCartController {
	
	@PostMapping("/creditCard/infoCardByTypeAndAmount")
	String infoCardByTypeAndAmount(@RequestBody String dataBody) {
		return "";
	}

}

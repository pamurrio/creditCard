package com.accenture.exercise.creditcard.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.exercise.creditcard.controller.CreditCardController;

@RestController
public class CreditCardWebServices {

	@Autowired
	public CreditCardController creditCard;

	@GetMapping("/creditCard/infoCardByTypeAndAmount/{type}/{amount}")
	Float infoCardByTypeAndAmount(@PathVariable String type, @PathVariable Float amount) {
		return creditCard.getTasaByMarcaAndImporte(type, amount);
	}

}

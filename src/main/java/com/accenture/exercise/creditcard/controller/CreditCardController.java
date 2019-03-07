package com.accenture.exercise.creditcard.controller;

import org.springframework.stereotype.Controller;

import com.accenture.exercise.creditcard.model.CreditCard;
import com.accenture.exercise.creditcard.model.PereCredit;
import com.accenture.exercise.creditcard.model.ScoCredit;
import com.accenture.exercise.creditcard.model.SquaCred;

@Controller
public class CreditCardController {

	// Obtener por medio de un método la tasa de una operación informando
	// marca e importe
	public Float getTasaByMarcaAndImporte(String type, Float amount) {
		CreditCard credi = null;
		switch (type) {
		case "SQUA":
			credi = new SquaCred();
			break;
		case "PERE":
			credi = new PereCredit();
			break;
		case "SCO":
			credi = new ScoCredit();
			break;
		default:
			break;
		}
		if (credi != null) {
			return amount * credi.tasaOperation();
		}
		return 0f;
	}

}

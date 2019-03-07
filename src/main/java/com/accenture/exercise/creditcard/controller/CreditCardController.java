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
			credi = new SquaCred(11111l,"Accenture Test", "2020-05-20");
			break;
		case "PERE":
			credi = new PereCredit(11112l,"Accenture Test", "2020-05-20");
			break;
		case "SCO":
			credi = new ScoCredit(11113l,"Accenture Test", "2020-05-20");
			break;
		default:
			break;
		}
		if (credi != null) {
			return amount * credi.tasaOperation() / 100;
		}
		return 0f;
	}

}

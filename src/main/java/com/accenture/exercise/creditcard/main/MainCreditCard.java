package com.accenture.exercise.creditcard.main;

import com.accenture.exercise.creditcard.model.CreditCard;
import com.accenture.exercise.creditcard.model.PereCredit;
import com.accenture.exercise.creditcard.model.ScoCredit;
import com.accenture.exercise.creditcard.model.SquaCred;

public class MainCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCard squa = new SquaCred();
		CreditCard sco = new ScoCredit();
		CreditCard pere = new PereCredit();

		// Detallo toda la información de la tarjeta
		squa.getInfoCard();
		sco.getInfoCard();
		pere.getInfoCard();

		// Valido el importe ingresado
		squa.isValidOperation(13.9F);
		sco.isValidOperation(13.9F);
		pere.isValidOperation(13.9F);

		// Valido si es la misma tarjeta ingresado
		squa.isDifferentCard(pere);
	}

	//Obtener por medio de un método la tasa de una operación informando
	//marca e importe
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
		if(credi!= null) {
			return amount * credi.tasaOperation();
		}
		return 0f;
	}
	
	public void cobrar() {
		
	}

}

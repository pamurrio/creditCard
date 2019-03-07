package com.accenture.exercise.creditcard.main;

import com.accenture.exercise.creditcard.model.CreditCard;
import com.accenture.exercise.creditcard.model.PereCredit;
import com.accenture.exercise.creditcard.model.ScoCredit;
import com.accenture.exercise.creditcard.model.SquaCred;

public class MainCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard squa = new SquaCred(11111l,"Accenture Test", "2020-05-20");
		CreditCard sco = new ScoCredit(11112l,"Accenture Test", "2010-05-20");
		CreditCard pere = new PereCredit(11113l,"Accenture Test", "2020-05-20");

		// Detallo toda la información de la tarjeta
		System.out.println(squa.getInfoCard());
		System.out.println(sco.getInfoCard());
		System.out.println(pere.getInfoCard());
		

		// Valido el importe ingresado
		squa.isValidOperation(13.9F);
		sco.isValidOperation(13.9F);
		pere.isValidOperation(13.9F);

		// Valido si es la misma tarjeta ingresado
		squa.isDifferentCard(pere);
		
		// valido si no esta expirado la fecha de vencimiento de la tarjeta
		squa.isCardValidInfo();
		sco.isCardValidInfo();
		pere.isCardValidInfo();
	}

	//Obtener por medio de un método la tasa de una operación informando
	//marca e importe
	public Float getTasaByMarcaAndImporte(String type, Float amount) {
		CreditCard credi = null;
		switch (type) {
		case "SQUA":
			credi = new SquaCred(11112l,"Accenture Test", "2020-05-20");
			break;
		case "PERE":
			credi = new PereCredit(11113l,"Accenture Test", "2020-05-20");
			break;
		case "SCO":
			credi = new ScoCredit(11114l,"Accenture Test", "2020-05-20");
			break;
		default:
			break;
		}
		if(credi!= null) {
			return amount * credi.tasaOperation();
		}
		return 0f;
	}
}

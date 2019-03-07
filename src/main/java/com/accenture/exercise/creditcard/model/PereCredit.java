package com.accenture.exercise.creditcard.model;

import java.util.Calendar;
import java.util.Date;

public class PereCredit extends CreditCard {
	
	
	public PereCredit(Long number, String cardHolder, String expiration) {
		// TODO Auto-generated constructor stub
		super(number, cardHolder, expiration);
		setType("PERE");
		
	}
	
	@Override
	public Float tasaOperation() {
		// TODO Auto-generated method stub
		Date date = new Date(); // your date
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return (float) (cal.get(Calendar.MONTH) * 0.1);
	}

}

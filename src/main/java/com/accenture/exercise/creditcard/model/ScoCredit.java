package com.accenture.exercise.creditcard.model;

import java.util.Calendar;
import java.util.Date;

public class ScoCredit extends CreditCard {

	public ScoCredit(Long number, String cardHolder, String expiration) {
		super(number, cardHolder, expiration);
		// TODO Auto-generated constructor stub
		setType("SCO");
	}

	@Override
	public Float tasaOperation() {
		// TODO Auto-generated method stub
		Date date = new Date(); // your date
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return (float) (cal.get(Calendar.DAY_OF_MONTH) * 0.5);
	}

}

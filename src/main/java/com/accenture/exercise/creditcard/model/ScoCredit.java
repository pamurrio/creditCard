package com.accenture.exercise.creditcard.model;

import java.util.Calendar;
import java.util.Date;

public class ScoCredit extends CreditCard {

	@Override
	public String getInfoCard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float tasaOperation() {
		// TODO Auto-generated method stub
		Date date = null; // your date
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return (float) (cal.get(Calendar.DAY_OF_MONTH) * 0.5);
	}

}

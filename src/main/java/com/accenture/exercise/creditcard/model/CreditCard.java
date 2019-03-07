package com.accenture.exercise.creditcard.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class CreditCard {
	private String type;
	private Long number;
	private String cardHolder;
	private Date expiration;
	
	public CreditCard(Long number, String cardHolder, String expiration) {
		super();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		this.number = number;
		this.cardHolder = cardHolder;
		try {
			this.expiration = format.parse(expiration);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInfoCard() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return "Card Holder:" + getCardHolder() + " - " + "Number Card: " + getNumber()
		+ " - " + " Date Expiration: " + format.format(getExpiration()) + " - " +
		"Marca: " + getType();
	}
	
	public abstract Float tasaOperation();
	
	public  Boolean isValidOperation(Float amount) {
		if(amount < 999) {
			return true;
		}
		return false;
	}
	
	public Boolean isCardValidInfo() {
		if (this.getExpiration().compareTo(new Date()) > 0) {
			return true;
		}
		return false;
	}
	
	public Boolean isDifferentCard(CreditCard card) {
		return card.equals(this);
	}

}

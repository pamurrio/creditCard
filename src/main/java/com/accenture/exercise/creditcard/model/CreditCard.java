package com.accenture.exercise.creditcard.model;

import java.util.Date;

public abstract class CreditCard {
	private String type;
	private Long number;
	private String cardHolder;
	private Date expiration;

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

	public abstract String getInfoCard();
	
	public abstract Float tasaOperation();
	
	public  Boolean isValidOperation(Float amount) {
		if(amount < 999) {
			return true;
		}
		return false;
	}
	
	public Boolean isCardValidInfo(CreditCard card) {
		return false;
	}
	
	public Boolean isDifferentCard(CreditCard card) {
		return card.equals(this);
	}

}

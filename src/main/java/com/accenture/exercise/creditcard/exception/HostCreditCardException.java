package com.accenture.exercise.creditcard.exception;

public class HostCreditCardException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HostCreditCardException(String message) {
		super(message);
	}
	
	public HostCreditCardException() {
		super("HostCreditCardException");
	}
}

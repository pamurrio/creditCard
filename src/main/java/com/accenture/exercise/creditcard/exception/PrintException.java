package com.accenture.exercise.creditcard.exception;

public class PrintException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrintException(String message) {
		super(message);
	}
	public PrintException() {
		super("Se trabo el Papel");
	}
}

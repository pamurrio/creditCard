package com.accenture.exercise.creditcard.exception;

public class DataBaseException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataBaseException(String message) {
		super(message);
	}
	
	public DataBaseException() {
		super("la base de datos no permite escribir el nuevo saldo del cliente");
	}
}

package com.accenture.exercise.creditcard.exception;

public class SystemContabException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SystemContabException(String message) {
		super(message);
	}
	public SystemContabException() {
		super("el sistema contable no responde y/o no atiende los pedidos");
	}
}

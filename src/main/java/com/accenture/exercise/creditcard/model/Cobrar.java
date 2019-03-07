package com.accenture.exercise.creditcard.model;

import com.accenture.exercise.creditcard.exception.DataBaseException;
import com.accenture.exercise.creditcard.exception.HostCreditCardException;
import com.accenture.exercise.creditcard.exception.PrintException;
import com.accenture.exercise.creditcard.exception.SystemContabException;

public class Cobrar {
	
	public void cobrar() {
		try {
		imprimirFactura(); //imprimir factura en controladora fiscal
		enviarInfoTC(); //enviar info de tarjeta de crédito
		informarPago(); //Informar pago a comercial
		actualizarSaldo();//actualizar saldo del cliente
		
		} catch (PrintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HostCreditCardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemContabException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataBaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	private void actualizarSaldo() throws DataBaseException {
		 throw new DataBaseException();
	}

	private void informarPago() throws SystemContabException{
		// TODO Auto-generated method stub
		 throw new SystemContabException();
	}

	private void enviarInfoTC() throws HostCreditCardException{
		// TODO Auto-generated method stub
		throw new HostCreditCardException();
	}

	private void imprimirFactura()throws PrintException{
		// TODO Auto-generated method stub
		 throw new PrintException();
	}

}

package com.gapsi.example.api.exception;

public class NotFoundException extends APIException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6937888707155107386L;

	public NotFoundException(String message){
		super(404, message);
	}

}

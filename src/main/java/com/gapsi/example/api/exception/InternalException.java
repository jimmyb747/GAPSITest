package com.gapsi.example.api.exception;

public class InternalException extends APIException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4663108506949277192L;

	public InternalException(String message) {
		super(500, message);
	}

}

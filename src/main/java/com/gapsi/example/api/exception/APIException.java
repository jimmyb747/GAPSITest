package com.gapsi.example.api.exception;

public class APIException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9133997329406905731L;
	
	private final int code;
	
	APIException(int code, String message){
		super(message);
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}

}

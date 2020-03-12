package com.gapsi.example.api.model;

import java.io.Serializable;

public class ApiResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6219842368440929017L;
	
	private int returnCode;
	private String message;
	
	public ApiResponse(int returnCode, String message) {
		this.returnCode = returnCode;
		this.message = message;
	}
	
	public int getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

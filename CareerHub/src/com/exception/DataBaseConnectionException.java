package com.exception;

public class DataBaseConnectionException extends Exception{

	private static final long serialVersionUID = 1L;
	private String message;
	public DataBaseConnectionException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	

}

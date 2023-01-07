package com.masai.exception;

import org.apache.catalina.User;

public class UserException extends Exception{
	
	public UserException() {}
	
	public UserException(String message) {
		
		super(message);
	}

}

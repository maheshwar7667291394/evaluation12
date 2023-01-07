package com.masai.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyError> getUserException(UserException ce,WebRequest req){
		MyError err=new MyError();
		err.setMessage(ce.getMessage());
		err.setDate(LocalDate.now());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyError>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyError> GetException(Exception ce,WebRequest req){
		
		MyError err=new MyError();
		err.setMessage(ce.getMessage());
		err.setDate(LocalDate.now());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyError>(err,HttpStatus.BAD_REQUEST);
	}
	
	

}

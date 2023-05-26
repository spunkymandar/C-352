package com.example.demo;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class CustomExceptionhandler {
	
	public final ResponseEntity<ExceptionResponse> handleException(BookNotFoundException bookNotFoundException, WebRequest request){
		ExceptionResponse exceptionResponse=new ExceptionResponse(new Date(), bookNotFoundException.getMessage(), request.getDescription(false));
		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_FOUND);
		
		
	}

}

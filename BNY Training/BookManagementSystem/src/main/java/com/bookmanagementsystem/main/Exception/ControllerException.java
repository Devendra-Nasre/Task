package com.bookmanagementsystem.main.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerException {

	@ExceptionHandler(SameIdException.class)
	public String sameIdException(SameIdException e)
	{
		return e.getMessage();
		
		
	}
	
	@ExceptionHandler(NullBookException.class)
	public String nullBookException(NullBookException e)
	{
		return e.getMessage();
	}
}

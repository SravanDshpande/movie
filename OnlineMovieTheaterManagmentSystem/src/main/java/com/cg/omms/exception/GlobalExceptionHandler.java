package com.cg.omms.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(TheaterException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	public  ErrorInfo  handleException(TheaterException ex,HttpServletRequest req)
	{
		
		 String message=ex.getMessage();
		 String uri= req.getRequestURI();
		 
		 ErrorInfo  obj = new ErrorInfo(LocalDateTime.now(),message,uri);
		
		 return obj;
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo>  handleException(Exception ex,HttpServletRequest req)
	{
		
		 String message=ex.getMessage();
		 String uri= req.getRequestURI();
		 
		 ErrorInfo  obj = new ErrorInfo(LocalDateTime.now(),message,uri);
		 ResponseEntity<ErrorInfo>  re = new ResponseEntity<ErrorInfo>(obj,HttpStatus.NOT_FOUND);
		 return re;
	}
}

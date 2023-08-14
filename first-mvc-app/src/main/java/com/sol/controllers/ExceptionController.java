package com.sol.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(HttpServletRequest request, Exception ex) {
		System.out.println("Request: " + request.getRequestURL() + "\nError: " + ex);
		return "error";
		
	}

}

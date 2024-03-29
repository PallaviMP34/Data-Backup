package com.ust.app.springapp.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ust.app.springapp.dto.ErrorResponse;
import com.ust.app.springapp.exception.CustomerNotFoundException;

@RestControllerAdvice
public class CustomerApiErrorController {

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ErrorResponse handleCustomereNotfoundException(CustomerNotFoundException ex, HttpServletRequest request) {
		var status = HttpStatus.NOT_FOUND;
		var statusValue = status.value();
		var error = status.getReasonPhrase();
		var timestamp = LocalDateTime.now();
		var path = request.getRequestURI();
		var message = ex.getMessage();
		return new ErrorResponse(timestamp, statusValue, error, message, path);
	}
	
	
	
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public ErrorResponse handleOtherException(Exception ex, HttpServletRequest request) {
		var status = HttpStatus.INTERNAL_SERVER_ERROR;
		var statusValue = status.value();
		var error = status.getReasonPhrase();
		var timestamp = LocalDateTime.now();
		var path = request.getRequestURI();
		var message = ex.getMessage();
		return new ErrorResponse(timestamp, statusValue, error, message, path);
	}
	
}

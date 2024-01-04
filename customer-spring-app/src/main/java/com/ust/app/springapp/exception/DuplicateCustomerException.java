package com.ust.app.springapp.exception;

public class DuplicateCustomerException extends RuntimeException {
	public DuplicateCustomerException(String message) {
		super(message);
	}

}

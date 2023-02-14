package com.bookstore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BUNotFoundException extends RuntimeException {
	public BUNotFoundException(String message) {
		super(message);
	}

	public BUNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}

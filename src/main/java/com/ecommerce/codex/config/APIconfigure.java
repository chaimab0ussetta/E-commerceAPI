package com.ecommerce.codex.config;

import java.time.LocalDateTime;
 //is used to return a response for the APIs and documenting and testing 
public class APIconfigure {
	private final boolean success;
	private final String message;

	public APIconfigure(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}

	public String getTimestamp() {
		return LocalDateTime.now().toString();
	}
}

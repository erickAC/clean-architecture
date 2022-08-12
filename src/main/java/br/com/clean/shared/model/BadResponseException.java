package br.com.clean.shared.model;

public class BadResponseException extends ApiError{

	public BadResponseException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;

}

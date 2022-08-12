package br.com.clean.shared.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.clean.shared.model.ApiError;
import br.com.clean.shared.model.BadResponseException;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

	private static final long serialVersionUID = 1L;

	@ExceptionHandler(NotFoundException.class)
	public ApiError handlerNotFoundException(NotFoundException exception, HttpServletRequest http) {
		return new ApiError(HttpStatus.NOT_FOUND.value(), http.getContextPath(),
				"Não foi localizado esse recurso, tente novamente");
	}
	
	@ExceptionHandler(BadResponseException.class)
	public ApiError handlerNotFoundException(BadResponseException exception, HttpServletRequest http) {
		return new ApiError(HttpStatus.NOT_FOUND.value(), http.getContextPath(), this.getMessage()
				);
	}
	
	

}

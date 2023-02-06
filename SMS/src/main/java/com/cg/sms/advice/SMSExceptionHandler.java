package com.cg.sms.advice;

import java.rmi.StubNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.sms.exception.StudentNotFoundException;

@RestControllerAdvice
public class SMSExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleBadRequestException(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new LinkedHashMap<>();
		
		ex.getFieldErrors().stream().forEach(fieldError -> {
			errors.put(fieldError.getField(), fieldError.getDefaultMessage());
		});		
		ResponseEntity<Map<String, String>> response = new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
		return response;		
	}
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> handleStudentNotFoundException(StudentNotFoundException se) {
		ResponseEntity<String> response = new ResponseEntity<>(se.getErrorMessage(), HttpStatus.NOT_FOUND);
		return response;		
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleInternalServerException(Exception ex){
		ResponseEntity<String> response = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
		
	}
}

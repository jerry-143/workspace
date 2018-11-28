package com.cg.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;



@ControllerAdvice
public class GlobalExceptionHandler {
	
	

    @ExceptionHandler(value= {StudentException.class})
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    public StudentException  exception(StudentException se) {
        
        String status =  se.getMsg();
        System.out.println("In global exception class running");
        return new StudentException(status);
	
	
}
}

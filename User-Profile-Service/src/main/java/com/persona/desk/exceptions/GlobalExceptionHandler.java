package com.persona.desk.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDuplicateEmailEntry(DataIntegrityViolationException ex){
        String message = ex.getMostSpecificCause().getMessage();
        if(message.toLowerCase().contains("profile_email")){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Email Already exists. Please use a different email.");
        }else{
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Duplicate value - violates unique constraint");
        }

    }
}

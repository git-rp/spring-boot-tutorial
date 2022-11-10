package com.demo.Springboot.tutorial.error;

import com.demo.Springboot.tutorial.entity.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandlers extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DepartmentNotFoundExceptions.class)
    public ResponseEntity<ErrorMessage> departmentNotFoundException(DepartmentNotFoundExceptions departmentNotFoundExceptions, WebRequest webRequest){

    ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,departmentNotFoundExceptions.getMessage());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}

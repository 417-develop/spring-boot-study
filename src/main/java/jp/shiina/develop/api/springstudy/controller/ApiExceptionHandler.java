package jp.shiina.develop.api.springstudy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jp.shiina.develop.api.springstudy.exception.InvalidParametersException;
import jp.shiina.develop.api.springstudy.model.ErrorResponse;

@ControllerAdvice
public class ApiExceptionHandler {
    /**
     * 400 - Bad Reqest
     */
    @ExceptionHandler(InvalidParametersException.class)
    public ResponseEntity<ErrorResponse> notReadable(InvalidParametersException e, HttpServletRequest req){
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse(e.getMessage())
                ,HttpStatus.BAD_REQUEST);
    }
}
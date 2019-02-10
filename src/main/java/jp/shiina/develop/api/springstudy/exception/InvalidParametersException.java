package jp.shiina.develop.api.springstudy.exception;

import lombok.Getter;

@Getter
public class InvalidParametersException extends RuntimeException {
    private static final String REQUIRED_ERR_MSG = "%s is required";
    private String message;

    public InvalidParametersException(String param){
        this.message = String.format(REQUIRED_ERR_MSG, param);
    }
}
package jp.shiina.develop.api.springstudy.controller;

import org.springframework.web.bind.annotation.RestController;

import jp.shiina.develop.api.springstudy.exception.InvalidParametersException;
import jp.shiina.develop.api.springstudy.model.PostAuthenticationResponse;
import jp.shiina.develop.api.springstudy.service.AuthenticationService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AuthenticationController {
    private static final String CLIENT_ID = "client_id";
    private static final String CLIENT_SECRET = "client_secret";

    @Autowired
    private AuthenticationService service;

    @PostMapping(value="/authentication",
    consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE },
    produces = { MediaType.APPLICATION_JSON_VALUE })
    public PostAuthenticationResponse postAuthentication(@RequestBody MultiValueMap<String, String> requestValues) {   
        Map<String, String> request = requestValues.toSingleValueMap();

        // validation
        validate(request, CLIENT_ID);
        validate(request, CLIENT_SECRET);

        return service.authenticate(request.get(CLIENT_ID), request.get(CLIENT_SECRET));
    }
    
    private void validate(Map<String, String> request, String key){
        if(!request.containsKey(key)){
            throw new InvalidParametersException(key);
        }
    }
}
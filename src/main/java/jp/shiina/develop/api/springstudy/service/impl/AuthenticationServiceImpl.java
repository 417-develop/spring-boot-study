package jp.shiina.develop.api.springstudy.service.impl;

import org.springframework.stereotype.Service;

import jp.shiina.develop.api.springstudy.model.PostAuthenticationResponse;
import jp.shiina.develop.api.springstudy.service.AuthenticationService;
import jp.shiina.develop.api.springstudy.service.converter.PostAuthenticationResponseConverter;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final String BEARER = "Bearer";
    private static final int EXPIRES_IN = 600;

    @Override
    public PostAuthenticationResponse authenticate(String clientaid, String clientSecret) {
        // TODO: Auth and generate token
        return new PostAuthenticationResponseConverter("token", BEARER, EXPIRES_IN);
    }

}
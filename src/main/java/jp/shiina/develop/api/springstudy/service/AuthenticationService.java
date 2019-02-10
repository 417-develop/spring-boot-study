package jp.shiina.develop.api.springstudy.service;

import jp.shiina.develop.api.springstudy.model.PostAuthenticationResponse;

public interface AuthenticationService {
    public PostAuthenticationResponse authenticate(String clientaid, String clientSecret);
}
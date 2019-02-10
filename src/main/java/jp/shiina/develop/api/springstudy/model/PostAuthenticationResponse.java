package jp.shiina.develop.api.springstudy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class PostAuthenticationResponse {
    @JsonProperty("access_token")
    private String accesssToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private int expiresIn;
}
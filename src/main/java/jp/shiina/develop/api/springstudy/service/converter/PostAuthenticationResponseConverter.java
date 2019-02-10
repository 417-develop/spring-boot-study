package jp.shiina.develop.api.springstudy.service.converter;

import com.fasterxml.jackson.annotation.JsonProperty;

import jp.shiina.develop.api.springstudy.model.PostAuthenticationResponse;

public class PostAuthenticationResponseConverter extends PostAuthenticationResponse {

    private String token;
    private String type;
    private int expireIn;

    public PostAuthenticationResponseConverter(String token, String type, int expiresIn){
        this.token = token;
        this.type = type;
        this.expireIn = expiresIn;
    }

    @Override
    public String getAccesssToken(){
        return token;
    }
    @Override
    public String getTokenType(){
        return type;
    }
    @Override
    public int getExpiresIn(){
        return expireIn;
    }
}
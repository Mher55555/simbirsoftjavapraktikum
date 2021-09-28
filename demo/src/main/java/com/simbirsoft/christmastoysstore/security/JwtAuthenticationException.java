package com.simbirsoft.christmastoysstore.security;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import javax.naming.AuthenticationException;

public class JwtAuthenticationException extends AuthenticationException {

    @Getter

    private HttpStatus httpStatus;
    public JwtAuthenticationException(String msg) {
        super(msg);
    }
    public JwtAuthenticationException(String msg, HttpStatus httpStatus) {
        super(msg);
        this.httpStatus = httpStatus;
    }
}


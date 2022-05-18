package com.webapp.first.service;

public class TwitchException extends RuntimeException{
    public TwitchException(String errorMessage){
        super(errorMessage);
    }
}

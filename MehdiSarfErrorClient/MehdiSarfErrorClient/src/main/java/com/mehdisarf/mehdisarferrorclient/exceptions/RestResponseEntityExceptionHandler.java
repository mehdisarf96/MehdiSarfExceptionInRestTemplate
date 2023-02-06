package com.mehdisarf.mehdisarferrorclient.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;


@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler
    public void handleNullPointerException(NullPointerException ex) {
        System.out.println("NullPointerException");
    }

    @ExceptionHandler(HttpClientErrorException.Unauthorized.class)
    public void handleUnauthorized(HttpClientErrorException.Unauthorized ex) {
        System.out.println("Unauthorized");
    }

    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public void handleUnauthorized(HttpClientErrorException.BadRequest ex) {
        System.out.println("BadRequest");
    }

    @ExceptionHandler(HttpClientErrorException.Forbidden.class)
    public void handleUnauthorized(HttpClientErrorException.Forbidden ex) {
        System.out.println("Forbidden");
    }

    @ExceptionHandler(HttpServerErrorException.GatewayTimeout.class)
    public void handleUnauthorized(HttpServerErrorException.GatewayTimeout ex) {
        System.out.println(ex.getMessage());
        System.out.println(ex.getCause());
        System.out.println("Gateway----Timeout");
    }

    @ExceptionHandler(value = {Exception.class})
    public void handleAnyException(Exception ex) {
        System.out.println("The most general Exception");
    }
}
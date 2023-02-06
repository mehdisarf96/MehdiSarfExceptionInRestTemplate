package com.mehdisarf.mehdisarferrorserver.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ErrorController {

    @GetMapping("/badRequest")
    public ResponseEntity<?> returnBadRequest(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/forbidden")
    public ResponseEntity<?> returnForbidden(){
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    @GetMapping("/gwtimeout")
    public ResponseEntity<?> returnGatewayTimeout(){
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).build();
    }

    @GetMapping("/notfound")
    public ResponseEntity<?> returnNotFound(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/unauthorized")
    public ResponseEntity<?> returnUnAuthorized(){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @GetMapping("/requestTimeout")
    public ResponseEntity<?> returnRequestTimeout(){
        return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).build();
    }
}

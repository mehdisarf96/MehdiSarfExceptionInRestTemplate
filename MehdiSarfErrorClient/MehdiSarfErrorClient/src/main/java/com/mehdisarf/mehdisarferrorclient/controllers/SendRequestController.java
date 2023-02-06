package com.mehdisarf.mehdisarferrorclient.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/sndreq")
public class SendRequestController {

    @GetMapping("/{error}")
    public void sendRequest(@PathVariable("error") String error) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8014/error/" + error;
        HttpEntity<Void> httpRequestEntity = new HttpEntity<>(new HttpHeaders());

        try {
            restTemplate.exchange(url, HttpMethod.GET, httpRequestEntity, Void.class);

        } catch (Exception exception) {
            System.out.println(exception.getClass().getSimpleName());
            throw exception;
        }
    }
}

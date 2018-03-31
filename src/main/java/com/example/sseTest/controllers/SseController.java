package com.example.sseTest.controllers;


import com.example.sseTest.bean.RandomNumbers;
import com.example.sseTest.services.SseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/randomNumbers")
class SseController {

    @Autowired
    SseServices randomNumbersService;

    @GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<RandomNumbers> randomNumbersEvents(){
        return randomNumbersService.getRandom();
    }
}
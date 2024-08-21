package com.example.springbootkafkademo.controller;


import com.example.springbootkafkademo.model.User;
import com.example.springbootkafkademo.services.KafkaJsonProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class JsonMessageController {
    private final KafkaJsonProducer jsonProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage( @RequestBody User user ){
        return ResponseEntity.ok(jsonProducer.publishMessage(user));
    }
}

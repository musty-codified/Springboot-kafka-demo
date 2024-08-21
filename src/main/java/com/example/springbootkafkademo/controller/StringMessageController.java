package com.example.springbootkafkademo.controller;


import com.example.springbootkafkademo.services.KafkaStringProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class StringMessageController {

    private final KafkaStringProducer kafkaProducer;

    // http://localhost:9000/api/v1/publish/learningKafka
    @GetMapping("/publish/{message}")
    public ResponseEntity<String> publishMessage(@PathVariable("message") String message) {
        return ResponseEntity.ok(kafkaProducer.publishMessage(message));
    }

}

package com.example.springbootkafkademo.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaStringConsumer {
    @KafkaListener(topics = "musty-codified", groupId = "myGroup")

    public String SubscribeToMessage(String message){
        log.info("Message consumed: " + message);
        return "Message consumed successfully";
    }
}

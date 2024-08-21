package com.example.springbootkafkademo.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class KafkaStringProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaStringProducer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    public String publishMessage(String message) {
        log.info("message: "+ message);
        kafkaTemplate.send("musty-codified", message);
        return "Published Successfully";
    }
}

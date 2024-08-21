package com.example.springbootkafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic demoTopic(){
        return TopicBuilder.name("musty-codified")
                .build();
    }

    @Bean
    public NewTopic demoJsonTopic(){
        return TopicBuilder.name("musty-codified-events")
                .build();
    }
}


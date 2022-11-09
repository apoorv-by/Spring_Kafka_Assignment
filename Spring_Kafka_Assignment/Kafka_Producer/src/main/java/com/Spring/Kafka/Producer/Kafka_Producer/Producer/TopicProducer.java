package com.Spring.Kafka.Producer.Kafka_Producer.Producer;

import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j // setter/getter/constructor/table
@RequiredArgsConstructor
@Service
public class TopicProducer {
    @Value("${topic.name.producer}")
    private String topicName;

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void send(String message){
        kafkaTemplate.send(topicName,message);
    }
}

package com.Spring.Kafka.Consumer.Kafka_Consumer.Controller;

import com.Spring.Kafka.Consumer.Kafka_Consumer.Consumer.TopicConsumer;
import com.Spring.Kafka.Consumer.Kafka_Consumer.Model.Movie_consumer;
import com.Spring.Kafka.Consumer.Kafka_Consumer.Repository.MessagesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka/consumer")
public class ConsumerController {

    private final TopicConsumer consumer;

    @Autowired
    private MessagesRepository messagesRepository;

    @GetMapping("/consume")
    public String consume(){
        return consumer.getLoadedConsume();
    }


}

package com.Spring.Kafka.Consumer.Kafka_Consumer.Consumer;

import com.Spring.Kafka.Consumer.Kafka_Consumer.Model.Movie_consumer;
import com.Spring.Kafka.Consumer.Kafka_Consumer.Repository.MessagesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j // setter/getter/constructor/table
@RequiredArgsConstructor
@Service
public class TopicConsumer {
    @Value("${topic.name.consumer}")
    private String topicName;

    private String latestConsumeData;

    @Autowired
    private MessagesRepository messagesRepository;

    @KafkaListener(topics = "${topic.name.consumer}",groupId = "group_id_consumer")
    public String consume(ConsumerRecord<String,String> payload){
        System.out.println(payload);
        System.out.println(payload.value().getClass().getName());
        log.info("Topic Name:"+topicName);
        log.info("Key:"+payload.key());
        log.info("Value:"+payload.value());
        log.info("Header:"+payload.headers());
        log.info("Partition:"+payload.partition());
        latestConsumeData = payload.value();

        Movie_consumer movieConsumer = new Movie_consumer();
        movieConsumer.setMessage(payload.value());
        messagesRepository.save(movieConsumer);
        return payload.value();
    }

    public String getLoadedConsume() {
        return latestConsumeData;
    }
}

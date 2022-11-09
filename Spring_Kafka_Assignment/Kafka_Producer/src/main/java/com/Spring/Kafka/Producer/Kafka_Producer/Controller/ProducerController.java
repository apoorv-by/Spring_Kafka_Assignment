package com.Spring.Kafka.Producer.Kafka_Producer.Controller;


import com.Spring.Kafka.Producer.Kafka_Producer.Model.Movie;
import com.Spring.Kafka.Producer.Kafka_Producer.Producer.TopicProducer;
import com.Spring.Kafka.Producer.Kafka_Producer.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka/producer")
public class ProducerController {
    private final TopicProducer topicProducer;

    private MovieService movieService;

    @Autowired
    public ProducerController(TopicProducer topicProducer, MovieService movieService){
        this.topicProducer = topicProducer;
        this.movieService = movieService;
    }

    @GetMapping("/send/{name}")
    public void send(@PathVariable("name") String name){
        topicProducer.send("Movie: "+name+".");
    }

    @PostMapping("/send")
    public Movie send(@RequestBody Movie movie){
        topicProducer.send(movie.toString());

        return movieService.saveMessage(movie);
    }

}

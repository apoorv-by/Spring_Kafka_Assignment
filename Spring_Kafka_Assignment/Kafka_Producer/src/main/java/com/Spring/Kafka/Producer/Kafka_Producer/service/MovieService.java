package com.Spring.Kafka.Producer.Kafka_Producer.service;

import com.Spring.Kafka.Producer.Kafka_Producer.Model.Movie;
import com.Spring.Kafka.Producer.Kafka_Producer.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMessage(Movie movie)
    {
        Movie message = movieRepository.save(movie);
        return message;
    }

}

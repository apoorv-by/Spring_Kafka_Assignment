package com.Spring.Kafka.Producer.Kafka_Producer.repository;

import com.Spring.Kafka.Producer.Kafka_Producer.Model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}

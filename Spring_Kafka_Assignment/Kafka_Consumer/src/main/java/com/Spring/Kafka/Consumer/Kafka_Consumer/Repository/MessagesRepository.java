package com.Spring.Kafka.Consumer.Kafka_Consumer.Repository;

import com.Spring.Kafka.Consumer.Kafka_Consumer.Model.Movie_consumer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends MongoRepository<Movie_consumer, ObjectId> {

}

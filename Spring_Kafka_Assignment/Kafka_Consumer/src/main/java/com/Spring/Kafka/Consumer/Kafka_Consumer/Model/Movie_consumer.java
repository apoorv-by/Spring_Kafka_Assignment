package com.Spring.Kafka.Consumer.Kafka_Consumer.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie_consumer {

    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private ObjectId id;

    private String message;

    public Movie_consumer() {
    }

    public Movie_consumer(ObjectId id, String message) {
        this.id = id;
        this.message = message;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Movie_consumer{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
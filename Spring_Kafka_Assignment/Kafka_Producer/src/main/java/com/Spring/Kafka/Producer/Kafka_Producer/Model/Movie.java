package com.Spring.Kafka.Producer.Kafka_Producer.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private ObjectId id;

    private String name;
    private String creationDate;
    private int rating;

    public Movie() {
    }

    public Movie(ObjectId id, String name, String creationDate, int rating) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.rating = rating;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", rating=" + rating +
                '}';
    }
}
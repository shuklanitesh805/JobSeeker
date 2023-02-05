package com.nitesh.jobseeker.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Post extends MongoRepository<com.nitesh.jobseeker.model.Post, String> {
}

package com.example.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}

package com.geisonbrunodev.mongodbspring.repository;

import com.geisonbrunodev.mongodbspring.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}

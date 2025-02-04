package com.geisonbrunodev.mongodbspring.services;

import com.geisonbrunodev.mongodbspring.domain.Post;
import com.geisonbrunodev.mongodbspring.repository.PostRepository;
import com.geisonbrunodev.mongodbspring.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id).orElseThrow(() -> new
                ObjectNotFoundException("Object not found"));
    }
}

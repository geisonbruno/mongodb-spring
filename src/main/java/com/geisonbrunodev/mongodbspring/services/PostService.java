package com.geisonbrunodev.mongodbspring.services;

import com.geisonbrunodev.mongodbspring.domain.Post;
import com.geisonbrunodev.mongodbspring.repository.PostRepository;
import com.geisonbrunodev.mongodbspring.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static org.apache.catalina.startup.ClassLoaderFactory.RepositoryType.URL;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id).orElseThrow(() -> new
                ObjectNotFoundException("Object not found"));
    }

    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }


    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repo.fullSearch(text, minDate, maxDate);
    }
}

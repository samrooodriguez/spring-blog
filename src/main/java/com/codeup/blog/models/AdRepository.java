package com.codeup.blog.models;

import org.springframework.data.repository.CrudRepository;

public interface AdRepository extends CrudRepository<Post, Long> {
    Post findByTitle(String title);
}
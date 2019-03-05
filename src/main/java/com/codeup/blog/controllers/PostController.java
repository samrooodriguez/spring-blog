package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String allPosts(){
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String profile(@PathVariable String id){
        return id;
    }

    @GetMapping("posts/create")
    public String createPost(){
        return "blogPostForm";
    }

    @PostMapping("posts/create")
    public String createdPost(){
        return "posts/show";
    }

}

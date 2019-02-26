package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String allPosts() {
        return "";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String profile(@PathVariable String id){
        return id;
    }

    @GetMapping("posts/create")
    @ResponseBody
    public String createPost(){
        return " <h1> Enter in a blog post: </h1> <form>  <input type='text' name=createPost </form>";
    }

    @PostMapping("posts/create")
    @ResponseBody
    public String createdPost(){
        return "New post created";
    }

}

package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello/{name}/{age}")
    @ResponseBody
    public String hello(@PathVariable String name, @PathVariable int age){
        return "Hello from " + name + " I am " + age + " years old";

    }

    @PostMapping("/hello")
    @ResponseBody
    public String getPassword(@RequestParam(name = "password")String pass){

        return "definitelynotthepassword" + pass + "notthepassword";
    }
}

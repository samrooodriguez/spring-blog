package com.codeup.blog.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LandonController {

    @GetMapping("/landon/{names}")
    public String landon(@PathVariable String names, Model model) {
        model.addAttribute("name", names);
        return "landon";
    }
}

package com.codeup.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    @ResponseBody
    public String userGuess(){
        return "<h1> GUESS A NUMBA' FOOL </h1>";
    }

    @GetMapping("/roll-dice/n")
    @ResponseBody
    public void randomNumber() {
        int max = 6;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < 6; i++) {

            int rand = (int) (Math.random() * range) + min;
        }
    }
}

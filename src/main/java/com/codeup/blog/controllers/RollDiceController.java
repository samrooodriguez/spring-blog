package com.codeup.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String userGuess(){
        return "rollDice";
    }

    @GetMapping("/roll-dice/{roll}")
    public String guess(@PathVariable String roll, Model model){

        model.addAttribute("roll", roll);

        return "diceGuess";
    }


}

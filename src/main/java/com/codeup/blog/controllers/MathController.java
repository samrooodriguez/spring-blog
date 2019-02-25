package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/math/add/{numberOne}/and/{numberTwo}")
    @ResponseBody
    public int addition(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberOne + numberTwo;
    }

    @GetMapping("/math/subtract/{numberOne}/from/{numberTwo}")
    @ResponseBody
    public int subtraction(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberOne - numberTwo;
    }

    @GetMapping("/math/multiply/{numberOne}/and/{numberTwo}")
    @ResponseBody
    public int multiplication(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberOne * numberTwo;
    }

    @GetMapping("/math/divide/{numberOne}/by/{numberTwo}")
    @ResponseBody
    public int division(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberOne / numberTwo;
    }

}

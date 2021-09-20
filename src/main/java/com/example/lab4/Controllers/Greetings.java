package com.example.lab4.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Axel Jeansson
 * Date: 2021-09-20
 * Time: 11:43
 * Project: Lab4
 * Copyright: MIT
 */
@RestController
public class Greetings {


    @GetMapping("/hello")
    public @ResponseBody String helloController(){
        return "Hello, World!";
    }
}

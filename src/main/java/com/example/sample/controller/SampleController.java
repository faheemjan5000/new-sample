package com.example.sample.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/call")
public class SampleController {

    @GetMapping("/hello")
    public String greetings(){
        return "Hello worlds";
    }

    @GetMapping("/faheem")
    public String morning(){
        return "Good morning Faheem jan my friend ";
    }

    @PostMapping("/add/{message}")
    public String message(@PathVariable("message") String message){
        return "hello "+message;
    }
}

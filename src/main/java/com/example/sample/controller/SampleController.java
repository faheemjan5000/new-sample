package com.example.sample.controller;

import com.example.sample.model.Order;
import com.example.sample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/call")
public class SampleController {

    @Autowired
    private OrderService orderService;
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

    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return orderService.getOrders();
    }
}

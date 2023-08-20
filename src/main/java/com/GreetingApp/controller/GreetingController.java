package com.GreetingApp.controller;

import com.GreetingApp.entity.Greeting;
import com.GreetingApp.entity.User;
import com.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class GreetingController {
@Autowired
    GreetingService greetingService;
private static final String template ="Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world") String name){
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }
}



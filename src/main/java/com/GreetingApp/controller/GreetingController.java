package com.GreetingApp.controller;

import com.GreetingApp.entity.Greeting;
import com.GreetingApp.entity.User;
import com.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    @GetMapping("/path/{id}")
    public Greeting getElementById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }
    @GetMapping("/getAll")
    public List<Greeting> getAll(){
        return greetingService.getAllGreeting();
    }
    @PutMapping("/edit/{id}")
    public Greeting editGreetingById(@PathVariable long id, @RequestParam String name){
        return greetingService.editGreetingById(id, name);
    }
}



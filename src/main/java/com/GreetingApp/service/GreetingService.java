package com.GreetingApp.service;

import com.GreetingApp.entity.Greeting;
import com.GreetingApp.entity.User;

import java.util.List;

public interface GreetingService {
    Greeting addGreeting(User user);

    Greeting getGreetingById(long id);

    List<Greeting> getAllGreeting();

    Greeting editGreetingById(long id, String name);
}
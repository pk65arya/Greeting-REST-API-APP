package com.GreetingApp.service;

import com.GreetingApp.entity.Greeting;
import com.GreetingApp.entity.User;

public interface GreetingService {
    Greeting addGreeting(User user);

    Greeting getGreetingById(long id);
}
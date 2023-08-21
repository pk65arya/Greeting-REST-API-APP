package com.GreetingApp.service;

import com.GreetingApp.entity.Greeting;
import com.GreetingApp.entity.User;

import java.util.List;

public interface GreetingService {
    Greeting addGreeting(User user);

    Greeting getGreetingById(long id);

    List<Greeting> getAllGreeting();
<<<<<<< HEAD

    Greeting editGreetingById(long id, String name);
=======
>>>>>>> a6e766b55a0858dd9ad2ff12756d8d46d88e0052
}
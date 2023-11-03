package com.amazon.webapp.amazonwebapp.controller;

import com.amazon.webapp.amazonwebapp.data.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class helloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World!!!!!!") String name) {
        return Greeting.builder().id(counter.incrementAndGet()).content(String.format(template, name)).build();
    }

    @GetMapping({"/"})
    public Greeting helloWorld() {
        return Greeting.builder().id(this.counter.incrementAndGet()).content(" Hello World!!!!!").build();
    }
}

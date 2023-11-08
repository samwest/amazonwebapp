package com.amazon.webapp.amazonwebapp.controller;

import com.amazon.webapp.amazonwebapp.data.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class helloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public ResponseEntity<Greeting> greeting(@RequestParam(value = "name", defaultValue = "World!!!!!!!!!!!??????xx") String name) {
        final Greeting greeting = Greeting.builder().id(counter.incrementAndGet()).content(String.format(template, name)).build();
        return ResponseEntity.ok(greeting);
    }

    @GetMapping({"/"})
    public ResponseEntity<Greeting> helloWorld() {
        final Greeting greeting = Greeting.builder().id(this.counter.incrementAndGet()).content(" Hello World!!!!!?????").build();
        return ResponseEntity.ok(greeting);
    }
}

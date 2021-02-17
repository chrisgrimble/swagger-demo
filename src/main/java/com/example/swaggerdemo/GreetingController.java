package com.example.swaggerdemo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "%s, %s!";
    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/greeting")
    public Greeting greeting(@RequestBody GreetingRequest greetingRequest) {
        return new Greeting(counter.incrementAndGet(), String.format(template, greetingRequest.getMessage(), greetingRequest.getName()));
    }
}

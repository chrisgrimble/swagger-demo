package com.example.swaggerdemo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@Api(description = "Greetings description text")
public class GreetingController {

    private static final String template = "%s, %s!";
    private final AtomicLong counter = new AtomicLong();

    @ApiOperation(value = "Short description of the greeting endpoint",
        notes = "A description of the greeting endpoint")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "An ok greeting"),
        @ApiResponse(code = 403, message = "Some other error"),
    })
    @PostMapping("/greeting")
    public Greeting greeting(@RequestBody GreetingRequest greetingRequest) {
        return new Greeting(counter.incrementAndGet(), String.format(template, greetingRequest.getMessage(), greetingRequest.getName()));
    }
}

package com.example.swaggerdemo;

import io.swagger.annotations.ApiModelProperty;

public class GreetingRequest {

    @ApiModelProperty(example = "a jaunty message", required = false)
    private String message;
    @ApiModelProperty(example = "A name", required = true)
    private String name;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

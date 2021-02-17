package com.example.swaggerdemo;

import io.swagger.annotations.ApiModelProperty;

public class Greeting {

    @ApiModelProperty(example = "123")
    private final long id;
    @ApiModelProperty(example = "Hi Bob, this is a jaunty message")
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

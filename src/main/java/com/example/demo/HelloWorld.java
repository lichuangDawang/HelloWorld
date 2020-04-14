package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")

    public static void main(String[] args) {
        String jso = "{\"a\": \"Hello\", \"b\": \"World\"}";

    }




}



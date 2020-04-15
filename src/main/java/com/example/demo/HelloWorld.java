package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")

    public String hello(){
        return "hello danjie";
    }
    @GetMapping("/name")
    public String getJson(){
        return  "name:lichuang";
    }
    @GetMapping("/name1")
    public String getJson1(){
        return  "name:lichuang222";
    }
    @GetMapping("/name2")
    public String getJson2(){
        return  "name:lichuang333";
    }
    @GetMapping("/name4")
    public String getJson4(){
        return  "name:lichuang444";
    }


}



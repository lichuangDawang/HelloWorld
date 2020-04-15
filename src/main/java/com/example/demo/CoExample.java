package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Copyight (C),2020-2020,xxx
 * FileName: CoExample
 * Author: LICHUANG
 * Date:2020/4/1515:24
 * Description:xx
 * History:
 * <author>  <time>  <version>  <des>
 */

@Data
@Component
@ConfigurationProperties(prefix = "com.example")
public class CoExample {
    private  String name;
    private int age;
    private List<String> address;


}

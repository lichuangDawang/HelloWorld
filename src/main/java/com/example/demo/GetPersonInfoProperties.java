package com.example.demo;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Copyight (C),2020-2020,xxx
 * FileName: GetPersonInfoProperties
 * Author: LICHUANG
 * Date:2020/4/1514:58
 * Description:prefix
 * History:
 * <author>  <time>  <version>  <des>
 */
@Component
@Data
@ConfigurationProperties(prefix = "personinfo")
public class GetPersonInfoProperties {
    private String name;
    private  int age;

}

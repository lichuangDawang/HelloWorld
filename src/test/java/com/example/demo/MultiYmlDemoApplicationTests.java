package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyight (C),2020-2020,xxx
 * FileName: MultiYmlDemoApplicationTests
 * Author: LICHUANG
 * Date:2020/4/1516:21
 * Description:
 * History:
 * <author>  <time>  <version>  <des>
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MultiYmlDemoApplicationTests {
    @Value("${myenvironment.name}")
    private String name;
    @Test
    public void getMyEnvironment(){
        System.out.println(name);
    }
}

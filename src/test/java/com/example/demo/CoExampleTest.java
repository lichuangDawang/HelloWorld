package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyight (C),2020-2020,xxx
 * FileName: CoExampleTest
 * Author: LICHUANG
 * Date:2020/4/1515:29
 * Description:
 * History:
 * <author>  <time>  <version>  <des>
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CoExampleTest {
   @Autowired
    private CoExample coExample;

   @Test
    public void getName(){
       System.out.println(coExample.getName());
   }
   @Test
    public void getAge(){
       System.out.println(coExample.getAge());

   }
   @Test
    public void getAddress(){
       System.out.println(coExample.getAddress().get(0));
   }
}

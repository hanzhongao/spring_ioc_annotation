package com.hza.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by hza
 * 2019-09-05 17:08
 */
public class SpringDemo1 {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService.sayHello("张三"));
    }
}

package com.hza.demo1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Spring的Bean管理的注解方式
 */
//@Component("userService")
@Service("userService")
public class UserService {
    public String sayHello(String name) {
        return "hello " + name ;
    }
}

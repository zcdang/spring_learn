package com.atguigu.dubbocustomer.controller;

import com.atguigu.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")
public class UserServiceController {
    @Reference
    private UserService userService;

    @GetMapping("/sayhi")
    private String sayHi(String name){
        System.out.println("调用成功 name = " + name);
        return userService.sayHi(name);

    }

}

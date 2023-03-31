package com.atguigu.dubboprovider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public String sayHi(String name) {
        System.out.println(name);
        return "Hello, " + name;
    }
}

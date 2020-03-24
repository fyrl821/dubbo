/**
 * System Name： SDWAN Controller
 * <p>
 * File Name： HelloController
 * <p>
 * Creating Time： 2020-03-24 10:26
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */
package com.fh.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fh.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function Description: HelloController 控制器 <br>
 * Writter: peilun <br>
 * Creating Time: 2020-03-24 10:26 <br>
 **/

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String str = helloService.sayHello("World");
        System.out.println(helloService.sayHello("xiaopei!"));
        return str;
    }

    @GetMapping("/query/{id}")
    public String query(@PathVariable String id) {
        return "Hello, This is " + id;

    }
}

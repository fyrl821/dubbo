/**
 * System Name： SDWAN Controller
 * <p>
 * File Name： HelloServiceImpl
 * <p>
 * Creating Time： 2020-03-24 10:11
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */
package com.fh.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fh.service.HelloService;

/**
 * Function Description: HelloServiceImpl 实现类 <br>
 * Writter: peilun <br>
 * Creating Time: 2020-03-24 10:11 <br>
 **/
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "[This is dubbo-provider]: Hello " + name;
    }
}

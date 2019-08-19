/**
 * Copyright (C), 2012-2019, by xavier chen
 * FileName: HelloController
 * Author:   chen
 * Date:     2019/8/15 21:42
 * Description: controller类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/
package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉
 * 〈controller类 - HelloController〉
 * @Author chen
 * @Date 2019/8/15
 * @since 1.0.0
 *
 * 当我们一个类中的所有方法都需要直接返回数据给浏览器，那么可以把@ResponseBody注解写在类上
 * 而不是方法上。这样类上的注解变为@ResponseBody和@Controller。这两个注解可以使用一个注解代替@RestController
 **/
//@ResponseBody
//@Controller

@RestController
public class HelloController {

    @RequestMapping(name = "/hello")
    public String sayHello(){
        return "hello springboot!";
    }
}
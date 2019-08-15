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

/**
 * 〈一句话功能简述〉
 * 〈controller类 - HelloController〉
 * @Author chen
 * @Date 2019/8/15
 * @since 1.0.0
 **/
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(name = "/hello")
    public String sayHello(){
        return "hello springboot!";
    }
}